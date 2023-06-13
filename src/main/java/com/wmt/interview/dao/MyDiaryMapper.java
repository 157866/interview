package com.wmt.interview.dao;

import com.wmt.interview.entity.MyDiary;
import com.wmt.interview.tool.PageLimit;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description:
 * @date 2023/6/1211:47
 */
@Mapper
@Repository
public interface MyDiaryMapper {
    //    添加日记
    int addMyDiary(MyDiary myDiary);

    //    分页查询日记
    List<MyDiary> selectByUidLimit(PageLimit pageLimit);

    //     删除
    int deleteByUid(String did);

//    更新日记根据did更新
    int updataBydidDiary(MyDiary myDiary);

    //    查看多少条数据
    int countDiary(String uid);
}
