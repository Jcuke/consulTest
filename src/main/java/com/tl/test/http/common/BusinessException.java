package com.tl.test.http.common;/**
 * Created by Administrator on 2018/7/7.
 */

import lombok.Data;

/**
 * @program: matrix-tl
 * @description: 业务数据异常
 * @author: jw
 * @create: 2018-07-07 15:21
 */
@Data
public class BusinessException extends Exception{

    public final static String DEFAULT_CODE = "200";

    public String code;
    public String msg;

    public BusinessException(Throwable throwable){
        super(throwable);
    }

    public BusinessException(String code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public BusinessException(String msg) {
        super(msg);
        this.code = "200";
        this.msg = msg;
    }

    public BusinessException(int code) {
        super(String.valueOf(code));
        this.code = String.valueOf(code);
        this.msg = String.valueOf(code);
    }
}
