package com.tl.test.http.com.tl.test;

import com.tl.StartApp;
import com.tl.test.http.RestAPI;
import com.tl.test.http.common.CommonResponse;
import com.tl.test.http.common.Constant;
import com.tl.test.http.common.HttpUtil4LiveRecord;
import com.tl.test.http.common.LiveIdRequest;
import com.tl.test.http.common.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Ron
 * @date : 2019/2/27 上午11:01
 * @description Copyright (C) 2018 TL.Crop, All Rights Reserved.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartApp.class)
@Slf4j
public class UserList {

    @Autowired
    RestAPI restAPI;

    @Test
    public void getUserList() {
        try {
            LiveIdRequest request = new LiveIdRequest();
            request.setLiveId("31797277");

            CommonResponse cr = null;


            long l = System.currentTimeMillis();

            for (int i = 0; i < 100; i++) {
                cr = restAPI.getCurrentOnlineUserList(request);
                if (Constant.RetCode.SUCCESS != cr.getCode()) {
                    System.out.println("走 consul错误:" + i);
                }
                //System.out.println("cr.toString1(): " + cr.toString());
            }
            long totalTime = System.currentTimeMillis() - l;
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 请求一百次 走 consul 总耗时1：" + totalTime + "ms");


            l = System.currentTimeMillis();
            for (int i = 0; i < 100; i++) {
                String result = HttpUtil4LiveRecord.post("http://192.168.88.210:5046/mobile/live/getCurrentOnlineUserList", JSONUtil.toJson(request));
                cr = JSONUtil.fromJson(result, CommonResponse.class);
                if (Constant.RetCode.SUCCESS != cr.getCode()) {
                    System.out.println("直连错误:" + i);
                }
                //System.out.println("cr.toString2(): " + cr.toString());
            }
            totalTime = System.currentTimeMillis() - l;
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 请求一百次 直连 总耗时2：" + totalTime + "ms");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
