package com.wmt.interview.service;

import com.wmt.interview.entity.UserInfo;
import com.wmt.interview.tool.PageLimit;

import java.util.List;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description:
 * @date 2023/6/818:26
 */
public interface UserInfoService {
    //    添加消息
    int addUserInfoService(UserInfo userInfo);

    //   分页查询
    List<UserInfo> selectLimitUserInfo(PageLimit pageLimit);

    //    查看表中有多少条数据
    int selectUserInfoCount(String uid);

    //    根据infoId删除
    int deleteByInfoId(String infoId);
}
