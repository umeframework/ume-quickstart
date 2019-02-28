package org.umeframework.quickstart.sample.api;

import java.util.Iterator;
import java.util.List;
import javax.annotation.Resource;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.umeframework.quickstart.sample.entity.AlbumContributorDto;
import org.umeframework.quickstart.sample.service.AlbumContributorCrudService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
//import lombok.extern.slf4j.Slf4j;

/**
 * 参加该唱片录音的艺术家信息管理表:ALBUM_CONTRIBUTOR CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@CrossOrigin
@Api(value="参加该唱片录音的艺术家信息管理表Controller",tags={"参加该唱片录音的艺术家信息管理表 CRUD API"})
@RequestMapping(value = "/api/entity/albumcontributor/v1/")
@RestController
//@Slf4j
public class AlbumContributorCrudController {
    /**
     * AlbumContributorCrudService 实例<br>
     */
    @Resource
    private AlbumContributorCrudService service;

    /**
     * 实体创建<br>
     * 
     * @param entity - entity instance
     */
	@ApiOperation(value = "实体创建")
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@Transactional
	public Integer create(AlbumContributorDto entity) {
        return service.create(entity);
    }
    
    /**
     * 实体创建(多条)<br>
     * 
     * @param entity - entity instance
     */
	@ApiOperation(value = "实体创建(多条)")
	@RequestMapping(value = "/create-list", method = RequestMethod.POST)
	@Transactional
    public List<Integer> createList(List<AlbumContributorDto> entityList) {
        return service.createList(entityList);
    }
    
    /**
     * 实体更新或创建<br>
     * 
     * @param entity - entity instance
     */
	@ApiOperation(value = "实体更新或创建")
	@RequestMapping(value = "/create-update", method = RequestMethod.POST)
	@Transactional
    public Integer createOrUpdate(AlbumContributorDto entity) {
        return service.createOrUpdate(entity);
    }
    
    /**
     * 实体更新或创建(多条)<br>
     * 
     * @param entity - entity instance
     */
	@ApiOperation(value = "实体更新或创建(多条)")
	@RequestMapping(value = "/create-update-list", method = RequestMethod.POST)
	@Transactional
    public List<Integer> createOrUpdateList(List<AlbumContributorDto> entityList) {
        return service.createOrUpdateList(entityList);
    }
    
    /**
     * 实体更新<br>
     * 
     * @param entity - entity instance
     */
	@ApiOperation(value = "实体更新")
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@Transactional
    public Integer update(AlbumContributorDto entity) {
        return service.update(entity);
    }
    
    /**
     * 实体更新(多条)<br>
     * 
     * @param entity - entity instance
     */
	@ApiOperation(value = "实体更新(多条)")
	@RequestMapping(value = "/update-list", method = RequestMethod.POST)
	@Transactional
    public List<Integer> updateList(List<AlbumContributorDto> entityList) {
        return service.updateList(entityList);
    }
    
    /**
     * 实体删除<br>
     * 
     * @param entity - entity instance
     */
	@ApiOperation(value = "实体删除")
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@Transactional
    public Integer delete(AlbumContributorDto entity) {
        return service.delete(entity);
    }
    
    /**
     * 实体删除(多条)<br>
     * 
     * @param entity - entity instance
     */
	@ApiOperation(value = "实体删除(多条)")
	@RequestMapping(value = "/delete-list", method = RequestMethod.POST)
	@Transactional
    public List<Integer> deleteList(List<AlbumContributorDto> entityList) {
        return service.deleteList(entityList);
    }

    /**
     * 实体查询(主键匹配)<br>
     * 
     * @param entity - entity instance
     */
	@ApiOperation(value = "实体查询")
	@RequestMapping(value = "/find", method = RequestMethod.POST)
    public AlbumContributorDto find(AlbumContributorDto criteria) {
        return service.find(criteria);
    }
    /**
     * 实体查询(精确匹配返回列表)<br>
     * 
     * @param criteria - criteria instance
     */
	@ApiOperation(value = "实体查询(精确匹配返回列表)")
	@RequestMapping(value = "/find-list", method = RequestMethod.POST)
    public List<AlbumContributorDto> findList(AlbumContributorDto criteria) {
        return service.findList(criteria);
    }
    /**
     * 实体查询(模糊匹配返回列表)<br>
     * 
     * @param criteria - entity criteria
     */
	@ApiOperation(value = "实体查询(模糊匹配返回列表)")
	@RequestMapping(value = "/find-list-like", method = RequestMethod.POST)
    public List<AlbumContributorDto> findListLike(AlbumContributorDto criteria) {
        return service.findListLike(criteria);
    }
    /**
     * 件数统计<br>
     * 
     * @param criteria - criteria instance
     */
	@ApiOperation(value = "件数统计")
	@RequestMapping(value = "/count", method = RequestMethod.POST)
    public Integer count(AlbumContributorDto criteria) {
        return service.count(criteria);
    }

    /**
     * doValidate<br>
     * 
     * @param entity
     */
    public void doValidate(AlbumContributorDto entity) {
        Validator validator = validatorFactory.getValidator();
        Iterator<ConstraintViolation<AlbumContributorDto>> violations = validator.validate(entity).iterator();
        StringBuilder msg = new StringBuilder();
        while (violations.hasNext()) {
            ConstraintViolation<AlbumContributorDto> violation = violations.next();
            String prop = violation.getPropertyPath().toString();
            String message = violation.getMessage();
            msg.append(prop);
            msg.append(":");
            msg.append(message);
            msg.append("\n");
        }
        if (msg.length() > 0) {
            throw new RuntimeException(msg.toString());
        }
    }
    
    /**
     * validatorFactory
     */
    private static ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
}
