package dto
import (
    "database/sql"
    ."gear/orm"
)

// 'UME用户表'表实体结构(基础类型描述)
type UmeUserDto struct {
    // 用户识别ID
    UserId string
    // 用户登录密码
    UserPassword string
    // 用户名
    UserName string
    // 用户昵称
    UserNickName string
    // 用户性别
    UserGender int64
    // 用户手机
    UserMobile string
    // 用户邮箱
    UserEmail string
    // 用户头像
    UserHeadImage string
    // 用户描述信息
    UserDesc string
    // 用户账户状态
    UserStatus int64
    // 创建者
    CreateAuthor string
    // 创建时间
    CreateDatetime string
    // 更新者
    UpdateAuthor string
    // 更新时间
    UpdateDatetime string
}

// 'UME用户表'表实体结构(SQL类型描述)
type UmeUserEntity struct {
    // 用户识别ID 
    UserId sql.NullString `name:"USER_ID", type:"VARCHAR", comment:"用户识别ID", key:true, notnull:true`
    // 用户登录密码 
    UserPassword sql.NullString `name:"USER_PASSWORD", type:"VARCHAR", comment:"用户登录密码", key:false, notnull:false`
    // 用户名 
    UserName sql.NullString `name:"USER_NAME", type:"VARCHAR", comment:"用户名", key:false, notnull:false`
    // 用户昵称 
    UserNickName sql.NullString `name:"USER_NICK_NAME", type:"VARCHAR", comment:"用户昵称", key:false, notnull:false`
    // 用户性别 
    UserGender sql.NullInt64 `name:"USER_GENDER", type:"INT", comment:"用户性别", key:false, notnull:false`
    // 用户手机 
    UserMobile sql.NullString `name:"USER_MOBILE", type:"VARCHAR", comment:"用户手机", key:false, notnull:false`
    // 用户邮箱 
    UserEmail sql.NullString `name:"USER_EMAIL", type:"VARCHAR", comment:"用户邮箱", key:false, notnull:false`
    // 用户头像 
    UserHeadImage sql.NullString `name:"USER_HEAD_IMAGE", type:"VARCHAR", comment:"用户头像", key:false, notnull:false`
    // 用户描述信息 
    UserDesc sql.NullString `name:"USER_DESC", type:"VARCHAR", comment:"用户描述信息", key:false, notnull:false`
    // 用户账户状态 
    UserStatus sql.NullInt64 `name:"USER_STATUS", type:"INT", comment:"用户账户状态", key:false, notnull:false`
    // 创建者
    CreateAuthor sql.NullString `name:"CREATE_AUTHOR",  type:"VARCHAR", comment:"创建者", key:false, notnull:false`
    // 创建时间
    CreateDatetime sql.NullString `name:"CREATE_DATETIME",  type:"TIMESTAMP", comment:"创建时间", key:false, notnull:false`
    // 更新者
    UpdateAuthor sql.NullString `name:"UPDATE_AUTHOR",  type:"VARCHAR", comment:"更新者", key:false, notnull:false`
    // 更新时间
    UpdateDatetime sql.NullString `name:"UPDATE_DATETIME",  type:"TIMESTAMP", comment:"更新时间", key:false, notnull:false`
}

// 返回'UME用户表'表名
func (owner *UmeUserEntity) TableName() string {
    return "UME_USER"
}

// 从'map'创建
func (owner *UmeUserEntity) FromMap(src map[string]interface{}) *UmeUserEntity {
    var value interface{}
    var exist bool
    value,exist = src["UserId"]
    if exist {
        owner.UserId = sql.NullString{String:value.(string), Valid:true}
    }
    value,exist = src["UserPassword"]
    if exist {
        owner.UserPassword = sql.NullString{String:value.(string), Valid:true}
    }
    value,exist = src["UserName"]
    if exist {
        owner.UserName = sql.NullString{String:value.(string), Valid:true}
    }
    value,exist = src["UserNickName"]
    if exist {
        owner.UserNickName = sql.NullString{String:value.(string), Valid:true}
    }
    value,exist = src["UserGender"]
    if exist {
        owner.UserGender = sql.NullInt64{Int64:value.(int64), Valid:true}
    }
    value,exist = src["UserMobile"]
    if exist {
        owner.UserMobile = sql.NullString{String:value.(string), Valid:true}
    }
    value,exist = src["UserEmail"]
    if exist {
        owner.UserEmail = sql.NullString{String:value.(string), Valid:true}
    }
    value,exist = src["UserHeadImage"]
    if exist {
        owner.UserHeadImage = sql.NullString{String:value.(string), Valid:true}
    }
    value,exist = src["UserDesc"]
    if exist {
        owner.UserDesc = sql.NullString{String:value.(string), Valid:true}
    }
    value,exist = src["UserStatus"]
    if exist {
        owner.UserStatus = sql.NullInt64{Int64:value.(int64), Valid:true}
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
func (owner *UmeUserEntity) ToMap() map[string]interface{} {
    tar := make(map[string]interface{})
    if owner.UserId.Valid {
        tar["UserId"] = owner.UserId.String
    }
    if owner.UserPassword.Valid {
        tar["UserPassword"] = owner.UserPassword.String
    }
    if owner.UserName.Valid {
        tar["UserName"] = owner.UserName.String
    }
    if owner.UserNickName.Valid {
        tar["UserNickName"] = owner.UserNickName.String
    }
    if owner.UserGender.Valid {
        tar["UserGender"] = owner.UserGender.Int64
    }
    if owner.UserMobile.Valid {
        tar["UserMobile"] = owner.UserMobile.String
    }
    if owner.UserEmail.Valid {
        tar["UserEmail"] = owner.UserEmail.String
    }
    if owner.UserHeadImage.Valid {
        tar["UserHeadImage"] = owner.UserHeadImage.String
    }
    if owner.UserDesc.Valid {
        tar["UserDesc"] = owner.UserDesc.String
    }
    if owner.UserStatus.Valid {
        tar["UserStatus"] = owner.UserStatus.Int64
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

// 从'UmeUserDto'创建
func (owner *UmeUserEntity) FromDto(src UmeUserDto) *UmeUserEntity {
    owner.UserId = sql.NullString{String:src.UserId, Valid:true}
    owner.UserPassword = sql.NullString{String:src.UserPassword, Valid:true}
    owner.UserName = sql.NullString{String:src.UserName, Valid:true}
    owner.UserNickName = sql.NullString{String:src.UserNickName, Valid:true}
    owner.UserGender = sql.NullInt64{Int64:src.UserGender, Valid:true}
    owner.UserMobile = sql.NullString{String:src.UserMobile, Valid:true}
    owner.UserEmail = sql.NullString{String:src.UserEmail, Valid:true}
    owner.UserHeadImage = sql.NullString{String:src.UserHeadImage, Valid:true}
    owner.UserDesc = sql.NullString{String:src.UserDesc, Valid:true}
    owner.UserStatus = sql.NullInt64{Int64:src.UserStatus, Valid:true}
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

// 变换为'UmeUserDto'
func (owner *UmeUserEntity) ToDto() UmeUserDto {
    var tar UmeUserDto
    tar.UserId = owner.UserId.String
    tar.UserPassword = owner.UserPassword.String
    tar.UserName = owner.UserName.String
    tar.UserNickName = owner.UserNickName.String
    tar.UserGender = owner.UserGender.Int64
    tar.UserMobile = owner.UserMobile.String
    tar.UserEmail = owner.UserEmail.String
    tar.UserHeadImage = owner.UserHeadImage.String
    tar.UserDesc = owner.UserDesc.String
    tar.UserStatus = owner.UserStatus.Int64
    tar.CreateAuthor = owner.CreateAuthor.String
    tar.CreateDatetime = owner.CreateDatetime.String
    tar.UpdateAuthor = owner.UpdateAuthor.String
    tar.UpdateDatetime = owner.UpdateDatetime.String
    return tar
}

// 创建行数据映射列表
func (owner *UmeUserEntity) Mapper(entity interface{}) []interface{} {
    e := entity.(*UmeUserEntity)
    return []interface{}{ &e.UserId,&e.UserPassword,&e.UserName,&e.UserNickName,&e.UserGender,&e.UserMobile,&e.UserEmail,&e.UserHeadImage,&e.UserDesc,&e.UserStatus,&e.CreateAuthor,&e.CreateDatetime,&e.UpdateAuthor,&e.UpdateDatetime}
}

// 查询
func (owner *UmeUserEntity) Retrieve(ctx OrmContext, orderBy ...OrderByCondition) []UmeUserEntity {
    sqlText, sqlParams := GetDao().BuildSqlSelect(owner, orderBy)
    var nl []UmeUserEntity
    GetDao().Retrieve(ctx, sqlText, sqlParams[:]...).Mapping(&nl, owner.Mapper)
    return nl
}

// 查询(使用map类型参数查询)
func (owner *UmeUserEntity) RetrieveByMap(ctx OrmContext, param map[string]interface{}, orderBy ...OrderByCondition) []UmeUserEntity {
    return owner.FromMap(param).Retrieve(ctx,orderBy[:]...)
}

// 统计
func (owner *UmeUserEntity) Count(ctx OrmContext) int64 {
    sqlText, sqlParams := GetDao().BuildSqlCount(owner)
    return GetDao().Count(ctx, sqlText, sqlParams[:]...)
}

// 登录
func (owner *UmeUserEntity) Insert(ctx OrmContext) int64 {
    sqlText, sqlParams := GetDao().BuildSqlInsert(owner)
    return GetDao().Insert(ctx, sqlText, sqlParams[:]...)
}

// 更新
func (owner *UmeUserEntity) Update(ctx OrmContext) int64 {
    sqlText, sqlParams := GetDao().BuildSqlUpdate(owner)
    return GetDao().Update(ctx, sqlText, sqlParams[:]...)
}

// 删除
func (owner *UmeUserEntity) Delete(ctx OrmContext) int64 {
    sqlText, sqlParams := GetDao().BuildSqlDelete(owner)
    return GetDao().Delete(ctx, sqlText, sqlParams[:]...)
}







