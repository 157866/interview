package com.wmt.interview.controller;

import com.wmt.interview.entity.User;
import com.wmt.interview.entity.UserInfo;
import com.wmt.interview.service.UserInfoService;
import com.wmt.interview.tool.PageLimit;
import com.wmt.interview.tool.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description:
 * @date 2023/6/818:34
 */
@RestController
@RequestMapping("/userInfo")
@CrossOrigin
public class UserInfoController {
    @Resource
    private UserInfoService userInfoService;
    @PostMapping("/addUserInfo")
    public Result addUserInfo(UserInfo userInfo, HttpSession session){
        userInfo.setUid(userInfo.getUid());
        int i = userInfoService.addUserInfoService(userInfo);
        if (i > 0) {
            return Result.ok().message("添加密码成功");
        }
        return Result.error().message("添加失败");
    }

    @GetMapping("/selectLimitUserInfo")
    public Result selectLimitUserInfo(PageLimit pageLimit){
        System.out.println("pageLimit" + pageLimit);
        List<UserInfo> userInfos = userInfoService.selectLimitUserInfo(pageLimit);
        if (userInfos.equals(null)) {
            return  Result.error().message("没有内容");
        }
        return  Result.ok().data(userInfos).message("分页查询成功");
    }
    @GetMapping("/selectUserInfoCount")
    //    查看表中有多少条数据
    public Result selectUserInfoCount(String uid){
        int i = userInfoService.selectUserInfoCount(uid);
        if (i >= 0){
            return Result.ok().message("成功查询数据条数").data(i);
        }
        return Result.error().message("查询条数失败");
    }
    @GetMapping("/deleteByInfoId")
    //    根据infoId删除
    public Result deleteByInfoId(String infoId){
        System.out.println("infoId" + infoId);
        int i = userInfoService.deleteByInfoId(infoId);
        if (i > 0){
            return  Result.ok().message("删除成功").data(i);
        }
        return  Result.error().message("删除失败");
    }
}
