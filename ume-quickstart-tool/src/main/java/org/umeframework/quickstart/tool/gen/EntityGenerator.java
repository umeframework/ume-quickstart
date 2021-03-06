/* 
 * Copyright 2014-2017 UME Framework Group, GNU General Public License 
 */
package org.umeframework.quickstart.tool.gen;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.umeframework.quickstart.tool.gen.db.DtoBuilder;
import org.umeframework.quickstart.tool.gen.db.EntityDescBean;
import org.umeframework.quickstart.tool.gen.db.TableDescBean;
import org.umeframework.quickstart.tool.poi.TypeMapper;

/**
 * TableGenerator
 */
public class EntityGenerator {
    // generate by database category setting
    // private String[] databaseCategory = { "mysql", "oracle", "h2" };
    private String[] databaseCategory = { "mysql", "h2" };

    // generate base package setting
    private String genBasePackage;

    // generate file DIR setting
    private String genDirJava = "src/main/gen/";
    private String genDirResource = "src/main/gen/";
    private String genDirSqlMap = "src/main/gen/sql/";
    private String genDirSql = "src/main/gen/ddl/";
    private String genDirGoLang = "src/main/gen/go/";

    // VM template setting
    private String templateSqlMap = "template/table-sqlmap-{PROVIDER}.vm";
    private String templateSql = "template/table-ddl-{PROVIDER}.vm";
    private String templateSqlBat = "template/table-ddlbat-{PROVIDER}.vm";
    private String templateGoLang = "template/table-golang-{PROVIDER}.vm";
    // VM template setting
    private String templateDto = "template/entity-dto.vm";
    private String templateDtoCondition = "template/entity-dto-condition.vm";
    private String templateDtoCriteria = "template/entity-dto-criteria.vm";
    private String templateDtoMapper = "template/entity-dto-mapper.vm";
    private String templateCrudInterface = "template/entity-crud-interface.vm";
    private String templateCrudImpl = "template/entity-crud-impl.vm";
    private String templateCrudApi = "template/entity-crud-api.vm";
    private String templateCrudWsid = "template/entity-crud-wsid.vm";

    private DtoBuilder dtoBuilder;
    /**
     * If generate default field for each table
     */
    private boolean generateDefaultTableField = true;

    /**
     * TableGenerator
     * 
     * @throws IOException
     */
    public EntityGenerator(TypeMapper typeMapper, String... databaseCategory) throws IOException {
        this.databaseCategory = databaseCategory;
        dtoBuilder = new DtoBuilder(typeMapper, this);
    }

    /**
     * prepare
     */
    protected void prepare() {
        File dir = new File(genDirJava);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        dir = new File(genDirResource);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        for (String category : databaseCategory) {
            dir = new File(genDirSql + category + "/");
            if (!dir.exists()) {
                dir.mkdirs();
            }
            dir = new File(genDirSqlMap + category + "/");
            if (!dir.exists()) {
                dir.mkdirs();
            }
            dir = new File(genDirGoLang + category + "/");
            if (!dir.exists()) {
                dir.mkdirs();
            }
        }
    }

    /**
     * execute
     * 
     * @param dtoList
     * @throws Exception
     */
    public void execute(Collection<TableDescBean> dtoList) throws Exception {
        execute(null, dtoList);
    }

    /**
     * execute
     * 
     * @param group
     * @param dtoList
     * @throws Exception
     */
    public void execute(String group, Collection<TableDescBean> dtoList) throws Exception {
        group = group == null ? "" : group.trim();
        prepare();

        List<EntityDescBean> dtoExList = new ArrayList<EntityDescBean>(dtoList.size());

        for (String category : databaseCategory) {
            for (TableDescBean tableDto : dtoList) {
                EntityDescBean entityDto = dtoBuilder.build(tableDto, category);
                entityDto.setGenerateDefaultTableField(generateDefaultTableField ? 1 : 0);
                dtoExList.add(entityDto);
            }

            String allddlfileName = genDirSql + category + "/" + "create-table" + group + ".sql";
            String vm = templateSqlBat.replace("{PROVIDER}", category.toString().toLowerCase());

            if (new File(vm).exists()) {
                new CodeGenerator(vm).execute("dtos", dtoExList, allddlfileName);
                System.out.println("[" + allddlfileName + "] created.");
            }

            // Generate Each DDL File
            for (EntityDescBean dto : dtoExList) {
                String ddlfileName = genDirSql + category + "/" + dto.getTblAlias() + ".sql";
                vm = templateSql.replace("{PROVIDER}", category.toString().toLowerCase());
                if (!new File(vm).exists()) {
                    continue;
                }
                new CodeGenerator(vm).execute("dto", dto, ddlfileName);
                System.out.println("[" + ddlfileName + "] created.");
            }

            // Generate SqlMap File
            for (EntityDescBean dto : dtoExList) {
                String sqlMapfileName = genDirSqlMap + category + "/" + dto.getSqlMapXmlFile() + ".xml";
                vm = templateSqlMap.replace("{PROVIDER}", category.toString().toLowerCase());
                if (!new File(vm).exists()) {
                    continue;
                }
                new CodeGenerator(vm).execute("dto", dto, sqlMapfileName);
                System.out.println("[" + sqlMapfileName + "] created.");
            }

            // Generate GoLang File
            for (EntityDescBean dto : dtoExList) {
                String gofileName = genDirGoLang + category + "/" + dto.getClassOriId().toLowerCase() + ".go";
                vm = templateGoLang.replace("{PROVIDER}", category.toString().toLowerCase());
                if (!new File(vm).exists()) {
                    continue;
                }
                new CodeGenerator(vm).execute("dto", dto, gofileName);
                System.out.println("[" + gofileName + "] created.");
            }
        }

        // Generate Dto class
        if (new File(templateDto).exists()) {
            CodeGenerator cgDto = new CodeGenerator(templateDto);
            for (EntityDescBean dto : dtoExList) {
                String fileName = cgDto.createPackageDir(genDirJava, dto.getTableDtoPackage()) + dto.getTableDtoClass() + ".java";
                cgDto.execute("dto", dto, fileName);
                System.out.println("[" + fileName + "] created.");
            }
        }
        // Generate Dto Condition class
        if (new File(templateDtoCondition).exists()) {
            CodeGenerator cgDto = new CodeGenerator(templateDtoCondition);
            for (EntityDescBean dto : dtoExList) {
                String fileName = cgDto.createPackageDir(genDirJava, dto.getTableDtoPackage()) + dto.getTableDtoConditionClass() + ".java";
                cgDto.execute("dto", dto, fileName);
                System.out.println("[" + fileName + "] created.");
            }
        }
        // Generate Dto Criteria class
        if (new File(templateDtoCriteria).exists()) {
            CodeGenerator cgDto = new CodeGenerator(templateDtoCriteria);
            for (EntityDescBean dto : dtoExList) {
                String fileName = cgDto.createPackageDir(genDirJava, dto.getTableDtoPackage()) + dto.getTableDtoCriteriaClass() + ".java";
                cgDto.execute("dto", dto, fileName);
                System.out.println("[" + fileName + "] created.");
            }
        }
        // Generate Mapper class
        if (new File(templateDtoMapper).exists()) {
            CodeGenerator cgDto = new CodeGenerator(templateDtoMapper);
            for (EntityDescBean dto : dtoExList) {
                String fileName = cgDto.createPackageDir(genDirJava, dto.getTableMapperPackage()) + dto.getTableMapperClass() + ".java";
                cgDto.execute("dto", dto, fileName);
                System.out.println("[" + fileName + "] created.");
            }
        }

        // Generate Crud Service interface
        if (new File(templateCrudInterface).exists()) {
            CodeGenerator cgCrudInterface = new CodeGenerator(templateCrudInterface);
            for (EntityDescBean dto : dtoExList) {
                String packageName = dto.getTableCrudServiceInterfacePackage();
                String fileName = cgCrudInterface.createPackageDir(genDirJava, packageName) + dto.getTableCrudServiceInterface() + ".java";
                cgCrudInterface.execute("dto", dto, fileName);
                System.out.println("[" + fileName + "] created.");
            }
        }
        // Generate Crud Service implement class
        if (new File(templateCrudImpl).exists()) {
            CodeGenerator cgCrudClass = new CodeGenerator(templateCrudImpl);
            for (EntityDescBean dto : dtoExList) {
                String packageName = dto.getTableCrudServicePackage();
                String fileName = cgCrudClass.createPackageDir(genDirJava, packageName) + dto.getTableCrudServiceClass() + ".java";
                cgCrudClass.execute("dto", dto, fileName);
                System.out.println("[" + fileName + "] created.");
            }
        }
        // Generate Crud Api class
        if (new File(templateCrudApi).exists()) {
            CodeGenerator cgCrudApi = new CodeGenerator(templateCrudApi);
            for (EntityDescBean dto : dtoExList) {
                String packageName = dto.getTableCrudApiPackage();
                String fileName = cgCrudApi.createPackageDir(genDirJava, packageName) + dto.getTableCrudApiClass() + ".java";
                cgCrudApi.execute("dto", dto, fileName);
                System.out.println("[" + fileName + "] created.");
            }
        }
        // Generate Crud Service Mapping File
        if (new File(templateCrudWsid).exists()) {
            CodeGenerator cgCrudMapping = new CodeGenerator(templateCrudWsid);
            String mappingFileName = genDirResource + "entityServiceMapping" + group + ".properties";
            cgCrudMapping.execute("dtos", dtoExList, mappingFileName);
            System.out.println("[" + mappingFileName + "] created.");
        }
        
        System.out.println("DDL,SqlMap,Dto,CrudService have been generated.");
    }

    /**
     * @return the genDirResource
     */
    public String getGenDirResource() {
        return genDirResource;
    }

    /**
     * @param genDirResource
     *            the genDirResource to set
     */
    public void setGenDirResource(String genDirResource) {
        this.genDirResource = genDirResource;
    }

    /**
     * @return the genDirJava
     */
    public String getGenDirJava() {
        return genDirJava;
    }

    /**
     * @param genDirJava
     *            the genDirJava to set
     */
    public void setGenDirJava(String genDirJava) {
        this.genDirJava = genDirJava;
    }

    /**
     * @return the dtoBuilder
     */
    public DtoBuilder getDtoBuilder() {
        return dtoBuilder;
    }

    /**
     * @param dtoBuilder
     *            the dtoBuilder to set
     */
    public void setDtoBuilder(DtoBuilder dtoBuilder) {
        this.dtoBuilder = dtoBuilder;
    }

    /**
     * @return the genBasePackage
     */
    public String getGenBasePackage() {
        return genBasePackage;
    }

    /**
     * @param genBasePackage
     *            the genBasePackage to set
     */
    public void setGenBasePackage(String genBasePackage) {
        this.genBasePackage = genBasePackage;
    }

    /**
     * @return the genDirSql
     */
    public String getGenDirSql() {
        return genDirSql;
    }

    /**
     * @param genDirSql
     *            the genDirSql to set
     */
    public void setGenDirSql(String genDirSql) {
        this.genDirSql = genDirSql;
    }

    /**
     * @return the genDirSqlMap
     */
    public String getGenDirSqlMap() {
        return genDirSqlMap;
    }

    /**
     * @param genDirSqlMap
     *            the genDirSqlMap to set
     */
    public void setGenDirSqlMap(String genDirSqlMap) {
        this.genDirSqlMap = genDirSqlMap;
    }

    /**
     * @return the databaseCategory
     */
    public String[] getDatabaseCategory() {
        return databaseCategory;
    }

    /**
     * @param databaseCategory
     *            the databaseCategory to set
     */
    public void setDatabaseCategory(String[] databaseCategory) {
        this.databaseCategory = databaseCategory;
    }

    /**
     * @return the generateDefaultTableField
     */
    public boolean isGenerateDefaultTableField() {
        return generateDefaultTableField;
    }

    /**
     * @param generateDefaultTableField
     *            the generateDefaultTableField to set
     */
    public void setGenerateDefaultTableField(boolean generateDefaultTableField) {
        this.generateDefaultTableField = generateDefaultTableField;
    }

}
