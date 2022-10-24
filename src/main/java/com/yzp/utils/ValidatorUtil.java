package com.yzp.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName : ValidatorUtil
 * @Description : 手机号码校验
 * @Author : yangzp
 * @Date: 2022-09-29 23:41
 */
public class ValidatorUtil {

    private static final Pattern mobile_pattern = Pattern.compile("/^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\\d{8}$/");

    public static boolean isMobile(String mobile){
        if(StringUtils.isEmpty(mobile)){
            return false;
        }
        Matcher matcher =mobile_pattern.matcher(mobile);
        return matcher.matches();
    }
}
