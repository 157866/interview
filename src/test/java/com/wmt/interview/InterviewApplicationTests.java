package com.wmt.interview;

import com.wmt.interview.dao.UserMapper;
import com.wmt.interview.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class InterviewApplicationTests {
@Resource
private UserMapper userMapper;
    @Test
    void contextLoads() {
        System.out.println("d41cf794ba6d433284b2ca15850858b8".length());

    }

}
