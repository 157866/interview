package com.wmt.interview.tool;

import lombok.Getter;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description:
 * @date 2023/6/818:07
 */
@Getter
public enum ResultCode {

    SUCCESS(true, 2000, "成功"),
    UNKNOWN_ERROR(false, 4000, "未知错误"),
    BAD_CREDENTIALS(false, 3001, "用户名或密码输入错误！请重新输入！"),
    CREDENTIALS_EXPIRED(false, 3002, "密码过期，请联系管理员！"),
    ACCOUNT_EXPIRED(false, 3003, "账户过期，请联系管理员！"),
    ACCOUNT_LOCKED(false, 3004, "账户被锁定，请联系管理员！"),
    ACCOUNT_DISABLED(false, 3005, "账户被禁用，请联系管理员！"),
    EXCEED_MAX_SESSION(false, 3006, "您的账号已在别的地方登录，不允许重复登录！"),
    SMS_SEND_ERROR(false, 5000, "账号或密码错误");
    private final Boolean success;
    private final Integer code;
    private final String message;

    ResultCode(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
}
