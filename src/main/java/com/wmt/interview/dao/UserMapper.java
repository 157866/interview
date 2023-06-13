package com.wmt.interview.dao;

import com.wmt.interview.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description: 接口映射
 * @date 2023/6/813:50
 */
@Mapper
@Repository
public interface UserMapper {
//    全查
    List<User> selectAllUser();
//    登录
    User  login(@Param("accountNumber") String accountNumber,@Param("upassword") String upassword);
//    注册
    int register(User user);


}
