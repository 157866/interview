package com.wmt.interview.service.impl;

import com.wmt.interview.dao.UserInfoServiceMapper;
import com.wmt.interview.entity.UserInfo;
import com.wmt.interview.service.UserInfoService;
import com.wmt.interview.tool.MyUUID;
import com.wmt.interview.tool.PageLimit;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description:
 * @date 2023/6/818:27
 */
@Service
public class UserInfoServiceIMPL implements UserInfoService {
    @Resource
    private UserInfoServiceMapper userInfoServiceMapper;
    @Override
    public int addUserInfoService(UserInfo userInfo) {
        userInfo.setInfoId(MyUUID.getUUID());
        if (userInfo.getInfoType().equals("日记"))
        {

        }
        return userInfoServiceMapper.addUserInfoService(userInfo);
    }
    //   分页查询
    @Override
    public List<UserInfo> selectLimitUserInfo(PageLimit pageLimit) {
        List<UserInfo> userInfos = userInfoServiceMapper.selectLimitUserInfo(pageLimit);
        return userInfos;
    }

    @Override
    public int selectUserInfoCount(String uid) {
       return userInfoServiceMapper.selectUserInfoCount(uid);
    }

    @Override
    public int deleteByInfoId(String infoId) {

        return userInfoServiceMapper.deleteByInfoId(infoId);
    }
}
