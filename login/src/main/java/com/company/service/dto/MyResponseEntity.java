package com.company.service.dto;

public class MyResponseEntity<T> {
    private int code;
    private String msg;
    private T data;

    public MyResponseEntity(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public MyResponseEntity(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public MyResponseEntity(int code) {
        this.code = code;
    }

    public MyResponseEntity() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MyResponseEntity{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
