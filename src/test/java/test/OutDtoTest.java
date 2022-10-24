package test;

import com.yzp.common.packdto.outdto.R;
import com.yzp.entity.User;

/**
 * @ClassName : OutDtoTest
 * @Description : outdto测试
 * @Author : yangzp
 * @Date: 2022-09-26 23:35
 */
public class OutDtoTest {
    public static void main(String[] args) {
        R<User> outDTO = new R<>();
        System.out.println(outDTO);
    }
}
