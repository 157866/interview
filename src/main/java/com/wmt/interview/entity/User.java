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
 * @Description: user表的映射
 * @date 2023/6/813:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Alias("userEntity")
public class User {
    private String uid;
    private String uname;
    private String accountNumber;
    private String upassword;
    private int ustate;
}
