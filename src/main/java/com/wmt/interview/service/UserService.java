package com.wmt.interview.service;

import com.wmt.interview.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description:
 * @date 2023/6/817:05
 */

public interface UserService {
    //    全查
    List<User> selectAllUser();

    //    登录
    User login(String accountNumber, String upassword);

    //    注册
    int register(User user);


}
