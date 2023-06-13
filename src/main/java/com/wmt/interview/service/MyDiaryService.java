package com.wmt.interview.service;

import com.wmt.interview.entity.MyDiary;
import com.wmt.interview.tool.PageLimit;

import java.util.List;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description:
 * @date 2023/6/1211:52
 */
public interface MyDiaryService {
    //    添加日记
    int addMyDiary(MyDiary myDiary);

    //    分页查询日记
    List<MyDiary> selectByUidLimit(PageLimit pageLimit);

    //  删除日记
    int deleteByUid(String did);

    //    更新日记根据did更新
    int updataBydidDiary(MyDiary myDiary);

    //    添加和更新日记
    int saveDiaryAndUpdate(MyDiary myDiary);

    //    查看多少条数据
    int countDiary(String uid);
}
