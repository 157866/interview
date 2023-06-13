package com.wmt.interview.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description: userinfo的映射
 * @date 2023/6/813:46
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Alias("userInfoEntity")
public class UserInfo {
    private String infoId;
    private String uid;
    private String infoType;
    private String infoMessage;
    private int istate;
}
