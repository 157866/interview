package com.wmt.interview.controller;

import com.wmt.interview.entity.MyDiary;
import com.wmt.interview.service.MyDiaryService;
import com.wmt.interview.tool.PageLimit;
import com.wmt.interview.tool.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description:
 * @date 2023/6/1211:55
 */
@RestController
@RequestMapping("/diary")
@CrossOrigin
public class MyDiaryController {
    @Resource
    private MyDiaryService myDiaryService;
    @PostMapping("/saveDiaryAndUpdate")
    //    修改和更新 日志
    public Result saveDiaryAndUpdate(MyDiary myDiary){
        System.out.println("myDiary =" + myDiary);
        int i = myDiaryService.saveDiaryAndUpdate(myDiary);
        if (i > 0 ){
            return Result.ok().message("日志保存成功").data(i);
        }
        return Result.error().message("日志保存失败");
    }

    @GetMapping("/selectByUidLimit")
    public Result selectByUidLimit(PageLimit pageLimit) {
        List<MyDiary> myDiaries = myDiaryService.selectByUidLimit(pageLimit);
        if (myDiaries.equals(null)) {
            return Result.error().message("分页查询错误或者没有数据");
        }
        return Result.ok().message("分页查询成功").data(myDiaries);
    }

    //    删除日志
    @GetMapping("/deleteByUid")
    public Result deleteByUid(String did) {
        int i = myDiaryService.deleteByUid(did);
        if (i > 0) {
            return Result.ok().message("删除成功").data(i);
        }
        return Result.error().message("删除失败");
    }

    //查看条数
    @GetMapping("/countDiary/{uid}")
    public int countDiary(@PathVariable("uid") String uid) {
        return myDiaryService.countDiary(uid);
    }

}

