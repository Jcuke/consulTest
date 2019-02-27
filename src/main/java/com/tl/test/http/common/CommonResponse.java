package com.tl.test.http.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

/**
 * json 响应
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommonResponse implements Serializable{

    private static final long serialVersionUID = 3760561205380419035L;

    protected int code = Constant.RetCode.SUCCESS;

	protected String msg;

 	//private Map<String, Object> data = new HashMap<>();
    private Object data = new Object();
}
