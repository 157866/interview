package com.wmt.interview.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Objects;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description:
 * @date 2023/6/1211:44
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Alias("myDiaryEntity")
public class MyDiary {
    private String did;
    private String uid;
    @DateTimeFormat(pattern="yyyy-MM-dd") //HH:mm:ss
    private Date ddate;
    private String dtitle;
    private String diary;
    private int dstate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDiary myDiary = (MyDiary) o;
        return dstate == myDiary.dstate && Objects.equals(did, myDiary.did) && Objects.equals(uid, myDiary.uid) && Objects.equals(ddate, myDiary.ddate) && Objects.equals(dtitle, myDiary.dtitle) && Objects.equals(diary, myDiary.diary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(did, uid, ddate, dtitle, diary, dstate);
    }
}
