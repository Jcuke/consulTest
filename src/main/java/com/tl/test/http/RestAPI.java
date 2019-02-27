package com.tl.test.http;

import com.tl.test.http.common.CommonResponse;
import com.tl.test.http.common.LiveIdRequest;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("tl-user")
public interface RestAPI {

    @PostMapping("/mobile/live/getCurrentOnlineUserList")
    CommonResponse getCurrentOnlineUserList(@RequestBody LiveIdRequest request) throws Exception;
}
