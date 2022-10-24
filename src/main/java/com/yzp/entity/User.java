package com.yzp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
* <p>
* 
* </p>
*
* @author yangzp
* @since 2022-09-26
*/
@Data
@TableName("t_user")
@ApiModel(value = "User对象", description = "")
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户id,手机号码")
    private Long id;

    private String nickname;

    @ApiModelProperty("MD5(MD5(pass明文+固定salt)+salt)")
    private String password;

    private String salt;

    @ApiModelProperty("头像")
    private String head;

    @ApiModelProperty("注册时间")
    private String registerDate;

    @ApiModelProperty("最后一次登录时间")
    private String lastLoginDate;

    @ApiModelProperty("登录次数")
    private Integer loginCount;
}