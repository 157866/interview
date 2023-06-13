package com.wmt.interview.service.impl;

import com.wmt.interview.dao.UserMapper;
import com.wmt.interview.entity.User;
import com.wmt.interview.service.UserService;
import com.wmt.interview.tool.MyUUID;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description:
 * @date 2023/6/817:06
 */
@Service
public class UserServiceIMPL implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> selectAllUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public User login(String accountNumber, String upassword) throws NullPointerException  {
        return userMapper.login(accountNumber, upassword);
    }

    @Override
    public int register(User user) {
        user.setUid(MyUUID.getUUID());
        return userMapper.register(user);
    }
}
