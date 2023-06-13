package com.wmt.interview.service.impl;

import com.wmt.interview.dao.MyDiaryMapper;
import com.wmt.interview.entity.MyDiary;
import com.wmt.interview.service.MyDiaryService;
import com.wmt.interview.tool.MyUUID;
import com.wmt.interview.tool.PageLimit;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description:
 * @date 2023/6/1211:52
 */
@Service
public class MyDiaryServiceIMPL implements MyDiaryService {
    @Resource
    private MyDiaryMapper myDiaryMapper;

    //    添加日记
    @Override
    public int addMyDiary(MyDiary myDiary) {
        myDiary.setDid(MyUUID.getUUID());
        System.out.println("service myDiary" + myDiary);
        return myDiaryMapper.addMyDiary(myDiary);
    }

    @Override
    public List<MyDiary> selectByUidLimit(PageLimit pageLimit) {
        return myDiaryMapper.selectByUidLimit(pageLimit);
    }

    //  删除日记
    @Override
    public int deleteByUid(String did) {
        return myDiaryMapper.deleteByUid(did);
    }

    @Override
    public int updataBydidDiary(MyDiary myDiary) {
        return myDiaryMapper.updataBydidDiary(myDiary);
    }

    @Override
    public int saveDiaryAndUpdate(MyDiary myDiary) {
//        有did就更新没有就添加
        if (myDiary.getDid() == null) {
            myDiary.setDid(MyUUID.getUUID());
            return myDiaryMapper.addMyDiary(myDiary);
        }
        return myDiaryMapper.updataBydidDiary(myDiary);
    }

    @Override
    public int countDiary(String uid) {
        return myDiaryMapper.countDiary(uid);
    }

}
