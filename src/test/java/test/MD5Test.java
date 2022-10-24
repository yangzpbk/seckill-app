package test;

import com.yzp.utils.MD5Util;

/**
 * @ClassName : MD5Test
 * @Description : md5加密测试
 * @Author : yangzp
 * @Date: 2022-09-27 22:37
 */
public class MD5Test {
    public static void main(String[] args) {
        //6502a2bb5dce5e457134f186797a2f7e
        //4e6f50ea3b4477c3fa838c8b8d45e8da
        System.out.println(MD5Util.inputPassToFormPass("12345678"));
        System.out.println(MD5Util.inputPassToDBPass("12345678","yzp123"));

    }
}
