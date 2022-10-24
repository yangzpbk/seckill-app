package test;

import com.yzp.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName : MaybeTest
 * @Description : 随意测试
 * @Author : yangzp
 * @Date: 2022-10-16 17:59
 */
@Slf4j
public class MaybeTest{

    @Test
    public void test() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(new Long(1),"1231","2131","2131","2022-10-20 18:20:20","2022-10-20 18:20:20","2022-10-20 18:20:20",1));
        userList.add(new User(new Long(2),"123","2131","2131","2022-10-20 18:20:20","2022-10-20 18:20:20","2022-10-20 18:20:20",2));
        userList.add(new User(new Long(3),"1235","2131","2131","2022-10-20 18:20:20","2022-10-20 18:20:20","2022-10-20 18:20:20",3));
        int count = userList.stream().filter(predicate -> "123".equalsIgnoreCase(predicate.getNickname())).findFirst()
                        .map(User::getLoginCount).orElse(1);
        System.out.println(count);
    }
}
