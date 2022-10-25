package com.yzp.utils;

import java.util.UUID;

/**
 * @ClassName : UUIDUtil
 * @Description : 生成uuid给cookie调用
 * @Author : yangzp
 * @Date: 2022-10-03 15:58
 */
public class UUIDUtil {
    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
