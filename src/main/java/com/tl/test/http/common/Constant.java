package com.tl.test.http.common;/**
 * Created by Administrator on 2018/6/8.
 */

/**
 * @program: tl-front
 * @description: 常量类
 * @author: jw
 * @create: 2018-06-08 16:44
 */
public class Constant {

    public static final String YES = "1";
    public static final String NO = "0";

    public static class RetCode {
        /**
         * 接口调用成功
         */
        public final static int SUCCESS = 100001;
        /**
         * 接口调用失败
         */
        public final static int FAIL = 100002;
        /**
         * 接口异常
         */
        public final static int EXCPTION = 100003;
        /**
         * 参数错误
         */
        public final static int PARAMETER_ERROR = 100004;
        public final static int KNOWN_ERROR = 100005;
        public final static int PARAMETER_PARSE_EXCEPTION = 1000006;
        public final static int JSON_PARSE_EXCEPTION = 1000007;

        public final static int SYSTEM_PARAMETER_ERROR = 200001;
        public final static int STREAM_BUCKET_ERROR = 200002;
        public final static int STREAM_PROVIDER_ERROR = 200003;
        public final static int REDIS_DATA_ERROR = 200004;

        public final static int REQUEST_ORDER_CONDITION_ERROR = 200101;


        public final static int REQUEST_BODY_NOT_JSON = 100501;
        public final static int REQUEST_BODY_PARAMETER_DATA_TYPE_ERROR = 100502;


    }
}
