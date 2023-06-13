package com.wmt.interview.tool;

import lombok.Getter;

/**
 * @author wmt
 * @Title:
 * @Package
 * @Description:
 * @date 2023/6/818:02
 */
@Getter
public class Result {
    //    返回结果是否正确
    private boolean success;
    //   返回码
    private Integer code;
    //返回消息
    private String message;
    //返回数据
    private Object data;
    //备用返回槽
    private Object standbyData;

    public Result() {

    }

    public Result(ResultCode resultCode) {
        this.success = resultCode.getSuccess();
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }


    public static Result ok() {
        return new Result(ResultCode.SUCCESS);
    }

    public static Result error() {
        return new Result(ResultCode.UNKNOWN_ERROR);
    }

    public static Result error(ResultCode resultCode) {
        return new Result(resultCode);
    }

    public Result code(Integer code) {
        this.code = code;
        return this;
    }

    public Result message(String message) {
        this.message = message;
        return this;
    }

    public Result data(Object data) {
        this.data = data;
        return this;
    }
    public Result dataAndStandbyData(Object data, Object standbyData) {
        this.data = data;
        this.standbyData = standbyData;
        return this;
    }
}
