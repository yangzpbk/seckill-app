package com.yzp.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Component;

/**
 * @ClassName : MD5Util
 * @Description : md5工具类
 * @Author : yangzp
 * @Date: 2022-09-25 20:17
 */
@Component
public class MD5Util {

    private static final String salt = "ayzbyzp123";

    public static String md5(String src) {
        return DigestUtils.md5Hex(src);
    }

    public static String inputPassToFormPass(String inputPass) {
        // 混淆加密
        String str = salt.charAt(0) +inputPass+ salt.charAt(1) + salt.charAt(3);
        return md5(str);

    }

    /**
     * @param formPass
     * @param salt
     * @Description:salt的length大于6
     * @return: [formPass, salt]
     * @Author: yangzp
     * @Date 2022/9/25 20:56
     */

    public static String formPassToDBPass(String formPass, String salt) {
        String str = salt;
        if (salt.length() >= 6) {
            str = salt.charAt(1) + formPass + salt.charAt(0) + salt.charAt(5) + salt.charAt(2);
        }
        return md5(str);
    }

    /**
     * @param inputPass
     * @param salt
     * @Description:真正需要的是dbPass
     * @return: [inputPass, salt]
     * @Author: yangzp
     * @Date 2022/9/25 20:44
     */

    public static String inputPassToDBPass(String inputPass, String salt) {
        String formPss = inputPassToFormPass(inputPass);
        String dbPass = formPassToDBPass(formPss, salt);
        return dbPass;
    }
}
