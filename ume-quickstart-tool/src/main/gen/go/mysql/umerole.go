package dto
import (
    "database/sql"
    ."gear/orm"
)

// 'UME角色定义表'表实体结构(基础类型描述)
type UmeRoleDto struct {
    // 角色ID
    RoleId string
    // 角色名称
    RoleName string
    // 角色描述
    RoleDesc string
    // 创建者
    CreateAuthor string
    // 创建时间
    CreateDatetime string
    // 更新者
    UpdateAuthor string
    // 更新时间
    UpdateDatetime string
}

// 'UME角色定义表'表实体结构(SQL类型描述)
type UmeRoleEntity struct {
    // 角色ID 
    RoleId sql.NullString `name:"ROLE_ID", type:"VARCHAR", comment:"角色ID", key:true, notnull:true`
    // 角色名称 
    RoleName sql.NullString `name:"ROLE_NAME", type:"VARCHAR", comment:"角色名称", key:false, notnull:false`
    // 角色描述 
    RoleDesc sql.NullString `name:"ROLE_DESC", type:"VARCHAR", comment:"角色描述", key:false, notnull:false`
    // 创建者
    CreateAuthor sql.NullString `name:"CREATE_AUTHOR",  type:"VARCHAR", comment:"创建者", key:false, notnull:false`
    // 创建时间
    CreateDatetime sql.NullString `name:"CREATE_DATETIME",  type:"TIMESTAMP", comment:"创建时间", key:false, notnull:false`
    // 更新者
    UpdateAuthor sql.NullString `name:"UPDATE_AUTHOR",  type:"VARCHAR", comment:"更新者", key:false, notnull:false`
    // 更新时间
    UpdateDatetime sql.NullString `name:"UPDATE_DATETIME",  type:"TIMESTAMP", comment:"更新时间", key:false, notnull:false`
}

// 返回'UME角色定义表'表名
func (owner *UmeRoleEntity) TableName() string {
    return "UME_ROLE"
}

// 从'map'创建
func (owner *UmeRoleEntity) FromMap(src map[string]interface{}) *UmeRoleEntity {
    var value interface{}
    var exist bool
    value,exist = src["RoleId"]
    if exist {
        owner.RoleId = sql.NullString{String:value.(string), Valid:true}
    }
    value,exist = src["RoleName"]
    if exist {
        owner.RoleName = sql.NullString{String:value.(string), Valid:true}
    }
    value,exist = src["RoleDesc"]
    if exist {
        owner.RoleDesc = sql.NullString{String:value.(string), Valid:true}
    }
    value,exist = src["CreateAuthor"]
    if exist {
        owner.CreateAuthor = sql.NullString{String:value.(string), Valid:true}
    }
    value,exist = src["CreateDatetime"]
    if exist {
        owner.CreateDatetime = sql.NullString{String:value.(string), Valid:true}
    }
    value,exist = src["UpdateAuthor"]
    if exist {
        owner.UpdateAuthor = sql.NullString{String:value.(string), Valid:true}
    }
    value,exist = src["UpdateDatetime"]
    if exist {
        owner.UpdateDatetime = sql.NullString{String:value.(string), Valid:true}
    }
    return owner
}

// 变换为'map'
func (owner *UmeRoleEntity) ToMap() map[string]interface{} {
    tar := make(map[string]interface{})
    if owner.RoleId.Valid {
        tar["RoleId"] = owner.RoleId.String
    }
    if owner.RoleName.Valid {
        tar["RoleName"] = owner.RoleName.String
    }
    if owner.RoleDesc.Valid {
        tar["RoleDesc"] = owner.RoleDesc.String
    }
    if owner.CreateAuthor.Valid {
        tar["CreateAuthor"] = owner.CreateAuthor.String
    }
    if owner.CreateDatetime.Valid {
        tar["CreateDatetime"] = owner.CreateDatetime.String
    }
    if owner.UpdateAuthor.Valid {
        tar["UpdateAuthor"] = owner.UpdateAuthor.String
    }
    if owner.UpdateDatetime.Valid {
        tar["UpdateDatetime"] = owner.UpdateDatetime.String
    }
    return tar
}

// 从'UmeRoleDto'创建
func (owner *UmeRoleEntity) FromDto(src UmeRoleDto) *UmeRoleEntity {
    owner.RoleId = sql.NullString{String:src.RoleId, Valid:true}
    owner.RoleName = sql.NullString{String:src.RoleName, Valid:true}
    owner.RoleDesc = sql.NullString{String:src.RoleDesc, Valid:true}
    owner.CreateAuthor = sql.NullString{String:src.CreateAuthor, Valid:true}
    if src.CreateDatetime != "" {
        owner.CreateDatetime = sql.NullString{String:src.CreateDatetime, Valid:true}
    }
    owner.UpdateAuthor = sql.NullString{String:src.UpdateAuthor, Valid:true}
    if src.CreateDatetime != "" {
        owner.UpdateDatetime = sql.NullString{String:src.UpdateDatetime, Valid:true}
    }
    return owner
}

// 变换为'UmeRoleDto'
func (owner *UmeRoleEntity) ToDto() UmeRoleDto {
    var tar UmeRoleDto
    tar.RoleId = owner.RoleId.String
    tar.RoleName = owner.RoleName.String
    tar.RoleDesc = owner.RoleDesc.String
    tar.CreateAuthor = owner.CreateAuthor.String
    tar.CreateDatetime = owner.CreateDatetime.String
    tar.UpdateAuthor = owner.UpdateAuthor.String
    tar.UpdateDatetime = owner.UpdateDatetime.String
    return tar
}

// 创建行数据映射列表
func (owner *UmeRoleEntity) Mapper(entity interface{}) []interface{} {
    e := entity.(*UmeRoleEntity)
    return []interface{}{ &e.RoleId,&e.RoleName,&e.RoleDesc,&e.CreateAuthor,&e.CreateDatetime,&e.UpdateAuthor,&e.UpdateDatetime}
}

// 查询
func (owner *UmeRoleEntity) Retrieve(ctx OrmContext, orderBy ...OrderByCondition) []UmeRoleEntity {
    sqlText, sqlParams := GetDao().BuildSqlSelect(owner, orderBy)
    var nl []UmeRoleEntity
    GetDao().Retrieve(ctx, sqlText, sqlParams[:]...).Mapping(&nl, owner.Mapper)
    return nl
}

// 查询(使用map类型参数查询)
func (owner *UmeRoleEntity) RetrieveByMap(ctx OrmContext, param map[string]interface{}, orderBy ...OrderByCondition) []UmeRoleEntity {
    return owner.FromMap(param).Retrieve(ctx,orderBy[:]...)
}

// 统计
func (owner *UmeRoleEntity) Count(ctx OrmContext) int64 {
    sqlText, sqlParams := GetDao().BuildSqlCount(owner)
    return GetDao().Count(ctx, sqlText, sqlParams[:]...)
}

// 登录
func (owner *UmeRoleEntity) Insert(ctx OrmContext) int64 {
    sqlText, sqlParams := GetDao().BuildSqlInsert(owner)
    return GetDao().Insert(ctx, sqlText, sqlParams[:]...)
}

// 更新
func (owner *UmeRoleEntity) Update(ctx OrmContext) int64 {
    sqlText, sqlParams := GetDao().BuildSqlUpdate(owner)
    return GetDao().Update(ctx, sqlText, sqlParams[:]...)
}

// 删除
func (owner *UmeRoleEntity) Delete(ctx OrmContext) int64 {
    sqlText, sqlParams := GetDao().BuildSqlDelete(owner)
    return GetDao().Delete(ctx, sqlText, sqlParams[:]...)
}







