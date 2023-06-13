package com.wmt.interview.tool;

import java.util.UUID;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description:
 * @date 2023/6/817:38
 */
public class MyUUID {
    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
