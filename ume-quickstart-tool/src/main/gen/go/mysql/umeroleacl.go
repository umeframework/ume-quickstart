package dto
import (
    "database/sql"
    ."gear/orm"
)

// 'UME角色资源访问权限关系表'表实体结构(基础类型描述)
type UmeRoleAclDto struct {
    // 角色ID
    RoleId string
    // 角色可访问的资源ID
    AccResId string
    // 角色可访问的资源ID
    AccResType int64
    // 访问级别
    AccLevel int64
    // 创建者
    CreateAuthor string
    // 创建时间
    CreateDatetime string
    // 更新者
    UpdateAuthor string
    // 更新时间
    UpdateDatetime string
}

// 'UME角色资源访问权限关系表'表实体结构(SQL类型描述)
type UmeRoleAclEntity struct {
    // 角色ID 
    RoleId sql.NullString `name:"ROLE_ID", type:"VARCHAR", comment:"角色ID", key:true, notnull:true`
    // 角色可访问的资源ID 
    AccResId sql.NullString `name:"ACC_RES_ID", type:"VARCHAR", comment:"角色可访问的资源ID", key:true, notnull:true`
    // 角色可访问的资源ID 
    AccResType sql.NullInt64 `name:"ACC_RES_TYPE", type:"INT", comment:"角色可访问的资源ID", key:true, notnull:true`
    // 访问级别 
    AccLevel sql.NullInt64 `name:"ACC_LEVEL", type:"INT", comment:"访问级别", key:true, notnull:true`
    // 创建者
    CreateAuthor sql.NullString `name:"CREATE_AUTHOR",  type:"VARCHAR", comment:"创建者", key:false, notnull:false`
    // 创建时间
    CreateDatetime sql.NullString `name:"CREATE_DATETIME",  type:"TIMESTAMP", comment:"创建时间", key:false, notnull:false`
    // 更新者
    UpdateAuthor sql.NullString `name:"UPDATE_AUTHOR",  type:"VARCHAR", comment:"更新者", key:false, notnull:false`
    // 更新时间
    UpdateDatetime sql.NullString `name:"UPDATE_DATETIME",  type:"TIMESTAMP", comment:"更新时间", key:false, notnull:false`
}

// 返回'UME角色资源访问权限关系表'表名
func (owner *UmeRoleAclEntity) TableName() string {
    return "UME_ROLE_ACL"
}

// 从'map'创建
func (owner *UmeRoleAclEntity) FromMap(src map[string]interface{}) *UmeRoleAclEntity {
    var value interface{}
    var exist bool
    value,exist = src["RoleId"]
    if exist {
        owner.RoleId = sql.NullString{String:value.(string), Valid:true}
    }
    value,exist = src["AccResId"]
    if exist {
        owner.AccResId = sql.NullString{String:value.(string), Valid:true}
    }
    value,exist = src["AccResType"]
    if exist {
        owner.AccResType = sql.NullInt64{Int64:value.(int64), Valid:true}
    }
    value,exist = src["AccLevel"]
    if exist {
        owner.AccLevel = sql.NullInt64{Int64:value.(int64), Valid:true}
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
func (owner *UmeRoleAclEntity) ToMap() map[string]interface{} {
    tar := make(map[string]interface{})
    if owner.RoleId.Valid {
        tar["RoleId"] = owner.RoleId.String
    }
    if owner.AccResId.Valid {
        tar["AccResId"] = owner.AccResId.String
    }
    if owner.AccResType.Valid {
        tar["AccResType"] = owner.AccResType.Int64
    }
    if owner.AccLevel.Valid {
        tar["AccLevel"] = owner.AccLevel.Int64
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

// 从'UmeRoleAclDto'创建
func (owner *UmeRoleAclEntity) FromDto(src UmeRoleAclDto) *UmeRoleAclEntity {
    owner.RoleId = sql.NullString{String:src.RoleId, Valid:true}
    owner.AccResId = sql.NullString{String:src.AccResId, Valid:true}
    owner.AccResType = sql.NullInt64{Int64:src.AccResType, Valid:true}
    owner.AccLevel = sql.NullInt64{Int64:src.AccLevel, Valid:true}
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

// 变换为'UmeRoleAclDto'
func (owner *UmeRoleAclEntity) ToDto() UmeRoleAclDto {
    var tar UmeRoleAclDto
    tar.RoleId = owner.RoleId.String
    tar.AccResId = owner.AccResId.String
    tar.AccResType = owner.AccResType.Int64
    tar.AccLevel = owner.AccLevel.Int64
    tar.CreateAuthor = owner.CreateAuthor.String
    tar.CreateDatetime = owner.CreateDatetime.String
    tar.UpdateAuthor = owner.UpdateAuthor.String
    tar.UpdateDatetime = owner.UpdateDatetime.String
    return tar
}

// 创建行数据映射列表
func (owner *UmeRoleAclEntity) Mapper(entity interface{}) []interface{} {
    e := entity.(*UmeRoleAclEntity)
    return []interface{}{ &e.RoleId,&e.AccResId,&e.AccResType,&e.AccLevel,&e.CreateAuthor,&e.CreateDatetime,&e.UpdateAuthor,&e.UpdateDatetime}
}

// 查询
func (owner *UmeRoleAclEntity) Retrieve(ctx OrmContext, orderBy ...OrderByCondition) []UmeRoleAclEntity {
    sqlText, sqlParams := GetDao().BuildSqlSelect(owner, orderBy)
    var nl []UmeRoleAclEntity
    GetDao().Retrieve(ctx, sqlText, sqlParams[:]...).Mapping(&nl, owner.Mapper)
    return nl
}

// 查询(使用map类型参数查询)
func (owner *UmeRoleAclEntity) RetrieveByMap(ctx OrmContext, param map[string]interface{}, orderBy ...OrderByCondition) []UmeRoleAclEntity {
    return owner.FromMap(param).Retrieve(ctx,orderBy[:]...)
}

// 统计
func (owner *UmeRoleAclEntity) Count(ctx OrmContext) int64 {
    sqlText, sqlParams := GetDao().BuildSqlCount(owner)
    return GetDao().Count(ctx, sqlText, sqlParams[:]...)
}

// 登录
func (owner *UmeRoleAclEntity) Insert(ctx OrmContext) int64 {
    sqlText, sqlParams := GetDao().BuildSqlInsert(owner)
    return GetDao().Insert(ctx, sqlText, sqlParams[:]...)
}

// 更新
func (owner *UmeRoleAclEntity) Update(ctx OrmContext) int64 {
    sqlText, sqlParams := GetDao().BuildSqlUpdate(owner)
    return GetDao().Update(ctx, sqlText, sqlParams[:]...)
}

// 删除
func (owner *UmeRoleAclEntity) Delete(ctx OrmContext) int64 {
    sqlText, sqlParams := GetDao().BuildSqlDelete(owner)
    return GetDao().Delete(ctx, sqlText, sqlParams[:]...)
}







