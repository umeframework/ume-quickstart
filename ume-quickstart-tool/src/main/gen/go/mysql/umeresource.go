package dto
import (
    "database/sql"
    ."gear/orm"
)

// 'UME资源管理表'表实体结构(基础类型描述)
type UmeResourceDto struct {
    // 资源ID
    ResId string
    // 资源类型
    ResType int64
    // 资源名称
    ResName string
    // 资源分组
    ResGroup string
    // 资源链接
    ResLink string
    // 资源排序序号
    ResIndex int64
    // 资源状态
    ResStatus int64
    // 创建者
    CreateAuthor string
    // 创建时间
    CreateDatetime string
    // 更新者
    UpdateAuthor string
    // 更新时间
    UpdateDatetime string
}

// 'UME资源管理表'表实体结构(SQL类型描述)
type UmeResourceEntity struct {
    // 资源ID 
    ResId sql.NullString `name:"RES_ID", type:"VARCHAR", comment:"资源ID", key:true, notnull:true`
    // 资源类型 
    ResType sql.NullInt64 `name:"RES_TYPE", type:"INT", comment:"资源类型", key:true, notnull:true`
    // 资源名称 
    ResName sql.NullString `name:"RES_NAME", type:"VARCHAR", comment:"资源名称", key:false, notnull:false`
    // 资源分组 
    ResGroup sql.NullString `name:"RES_GROUP", type:"VARCHAR", comment:"资源分组", key:false, notnull:false`
    // 资源链接 
    ResLink sql.NullString `name:"RES_LINK", type:"VARCHAR", comment:"资源链接", key:false, notnull:false`
    // 资源排序序号 
    ResIndex sql.NullInt64 `name:"RES_INDEX", type:"INT", comment:"资源排序序号", key:false, notnull:false`
    // 资源状态 
    ResStatus sql.NullInt64 `name:"RES_STATUS", type:"INT", comment:"资源状态", key:false, notnull:false`
    // 创建者
    CreateAuthor sql.NullString `name:"CREATE_AUTHOR",  type:"VARCHAR", comment:"创建者", key:false, notnull:false`
    // 创建时间
    CreateDatetime sql.NullString `name:"CREATE_DATETIME",  type:"TIMESTAMP", comment:"创建时间", key:false, notnull:false`
    // 更新者
    UpdateAuthor sql.NullString `name:"UPDATE_AUTHOR",  type:"VARCHAR", comment:"更新者", key:false, notnull:false`
    // 更新时间
    UpdateDatetime sql.NullString `name:"UPDATE_DATETIME",  type:"TIMESTAMP", comment:"更新时间", key:false, notnull:false`
}

// 返回'UME资源管理表'表名
func (owner *UmeResourceEntity) TableName() string {
    return "UME_RESOURCE"
}

// 从'map'创建
func (owner *UmeResourceEntity) FromMap(src map[string]interface{}) *UmeResourceEntity {
    var value interface{}
    var exist bool
    value,exist = src["ResId"]
    if exist {
        owner.ResId = sql.NullString{String:value.(string), Valid:true}
    }
    value,exist = src["ResType"]
    if exist {
        owner.ResType = sql.NullInt64{Int64:value.(int64), Valid:true}
    }
    value,exist = src["ResName"]
    if exist {
        owner.ResName = sql.NullString{String:value.(string), Valid:true}
    }
    value,exist = src["ResGroup"]
    if exist {
        owner.ResGroup = sql.NullString{String:value.(string), Valid:true}
    }
    value,exist = src["ResLink"]
    if exist {
        owner.ResLink = sql.NullString{String:value.(string), Valid:true}
    }
    value,exist = src["ResIndex"]
    if exist {
        owner.ResIndex = sql.NullInt64{Int64:value.(int64), Valid:true}
    }
    value,exist = src["ResStatus"]
    if exist {
        owner.ResStatus = sql.NullInt64{Int64:value.(int64), Valid:true}
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
func (owner *UmeResourceEntity) ToMap() map[string]interface{} {
    tar := make(map[string]interface{})
    if owner.ResId.Valid {
        tar["ResId"] = owner.ResId.String
    }
    if owner.ResType.Valid {
        tar["ResType"] = owner.ResType.Int64
    }
    if owner.ResName.Valid {
        tar["ResName"] = owner.ResName.String
    }
    if owner.ResGroup.Valid {
        tar["ResGroup"] = owner.ResGroup.String
    }
    if owner.ResLink.Valid {
        tar["ResLink"] = owner.ResLink.String
    }
    if owner.ResIndex.Valid {
        tar["ResIndex"] = owner.ResIndex.Int64
    }
    if owner.ResStatus.Valid {
        tar["ResStatus"] = owner.ResStatus.Int64
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

// 从'UmeResourceDto'创建
func (owner *UmeResourceEntity) FromDto(src UmeResourceDto) *UmeResourceEntity {
    owner.ResId = sql.NullString{String:src.ResId, Valid:true}
    owner.ResType = sql.NullInt64{Int64:src.ResType, Valid:true}
    owner.ResName = sql.NullString{String:src.ResName, Valid:true}
    owner.ResGroup = sql.NullString{String:src.ResGroup, Valid:true}
    owner.ResLink = sql.NullString{String:src.ResLink, Valid:true}
    owner.ResIndex = sql.NullInt64{Int64:src.ResIndex, Valid:true}
    owner.ResStatus = sql.NullInt64{Int64:src.ResStatus, Valid:true}
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

// 变换为'UmeResourceDto'
func (owner *UmeResourceEntity) ToDto() UmeResourceDto {
    var tar UmeResourceDto
    tar.ResId = owner.ResId.String
    tar.ResType = owner.ResType.Int64
    tar.ResName = owner.ResName.String
    tar.ResGroup = owner.ResGroup.String
    tar.ResLink = owner.ResLink.String
    tar.ResIndex = owner.ResIndex.Int64
    tar.ResStatus = owner.ResStatus.Int64
    tar.CreateAuthor = owner.CreateAuthor.String
    tar.CreateDatetime = owner.CreateDatetime.String
    tar.UpdateAuthor = owner.UpdateAuthor.String
    tar.UpdateDatetime = owner.UpdateDatetime.String
    return tar
}

// 创建行数据映射列表
func (owner *UmeResourceEntity) Mapper(entity interface{}) []interface{} {
    e := entity.(*UmeResourceEntity)
    return []interface{}{ &e.ResId,&e.ResType,&e.ResName,&e.ResGroup,&e.ResLink,&e.ResIndex,&e.ResStatus,&e.CreateAuthor,&e.CreateDatetime,&e.UpdateAuthor,&e.UpdateDatetime}
}

// 查询
func (owner *UmeResourceEntity) Retrieve(ctx OrmContext, orderBy ...OrderByCondition) []UmeResourceEntity {
    sqlText, sqlParams := GetDao().BuildSqlSelect(owner, orderBy)
    var nl []UmeResourceEntity
    GetDao().Retrieve(ctx, sqlText, sqlParams[:]...).Mapping(&nl, owner.Mapper)
    return nl
}

// 查询(使用map类型参数查询)
func (owner *UmeResourceEntity) RetrieveByMap(ctx OrmContext, param map[string]interface{}, orderBy ...OrderByCondition) []UmeResourceEntity {
    return owner.FromMap(param).Retrieve(ctx,orderBy[:]...)
}

// 统计
func (owner *UmeResourceEntity) Count(ctx OrmContext) int64 {
    sqlText, sqlParams := GetDao().BuildSqlCount(owner)
    return GetDao().Count(ctx, sqlText, sqlParams[:]...)
}

// 登录
func (owner *UmeResourceEntity) Insert(ctx OrmContext) int64 {
    sqlText, sqlParams := GetDao().BuildSqlInsert(owner)
    return GetDao().Insert(ctx, sqlText, sqlParams[:]...)
}

// 更新
func (owner *UmeResourceEntity) Update(ctx OrmContext) int64 {
    sqlText, sqlParams := GetDao().BuildSqlUpdate(owner)
    return GetDao().Update(ctx, sqlText, sqlParams[:]...)
}

// 删除
func (owner *UmeResourceEntity) Delete(ctx OrmContext) int64 {
    sqlText, sqlParams := GetDao().BuildSqlDelete(owner)
    return GetDao().Delete(ctx, sqlText, sqlParams[:]...)
}







