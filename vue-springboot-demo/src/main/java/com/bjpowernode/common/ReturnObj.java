package com.bjpowernode.common;

import org.springframework.stereotype.Component;

@Component
public class ReturnObj {
    private String msg;
    private Integer code;
    private Object obj;

    @Override
    public String toString() {
        return "ReturnObj{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                ", obj=" + obj +
                '}';
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public ReturnObj() {
    }

    public ReturnObj(String msg, Integer code, Object obj) {
        this.msg = msg;
        this.code = code;
        this.obj = obj;
    }
}
