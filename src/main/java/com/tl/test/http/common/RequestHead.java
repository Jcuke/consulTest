package com.tl.test.http.common;/**
 * Created by Administrator on 2018/6/13.
 */

import lombok.Data;

import java.io.Serializable;

/**
 * @program: tl-front
 * @description: 请求头部公共消息体
 * @author: jw
 * @create: 2018-06-13 10:00
 */
@Data
public class RequestHead implements Serializable {
    private static final long serialVersionUID = -8104223614145385814L;
    public String contentType;
    public String sdkVersion;
    public String deviceType;
    public String deviceId;
    public String token;
    public String ip;
    public int totalRowsCount = 0;
    public int pageSize = 10;
    public int pageNumber = 1;
    public String sortJsonArray = "";//排序条件json数组

    //签名相关
    //随机数
    public String randomStr;
    //时间戳(秒)
    public String timeStampStr;
    //签名值
    public String sign;

}
