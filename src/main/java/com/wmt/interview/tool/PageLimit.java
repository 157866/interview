package com.wmt.interview.tool;

import lombok.Data;
import lombok.ToString;
import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description:
 * @date 2023/6/1115:29
 */
@Data
@ToString

public class PageLimit {
    private Object object;
    private int pageBegin;
    private int pageCount;
}
