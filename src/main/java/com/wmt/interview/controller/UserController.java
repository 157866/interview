package com.wmt.interview.controller;

import com.wmt.interview.entity.User;
import com.wmt.interview.service.UserService;
import com.wmt.interview.tool.Result;
import org.apache.catalina.Session;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import java.util.List;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description:
 * @date 2023/6/817:09
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/login")
    public Result login(String accountNumber, String upassword, HttpSession session) {

        User login = userService.login(accountNumber, upassword);

        try {
            if (login.getUid() != null) {
                session.setAttribute("user", login);
                return Result.ok().data(login);
            }
        } catch (NullPointerException e) {
            e.printStackTrace();

        }

        return Result.error().message("账号或者密码错误");
    }

    @GetMapping("all")
    public List<User> all() {
        List<User> users = userService.selectAllUser();
        return users;
    }

    @PostMapping("/register")
    public Result register(User user) {
        int register = userService.register(user);

        if (register > 0) {
            return Result.ok().message("注册成功").data(register);
        }
        return Result.error().message("注册失败");
    }
}
