package com.design.proxy.code.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author 张博【zhangb@lianliantech.cn】
 */
@ApiModel("消息包")
public class MessageTag {

    @ApiModelProperty("客户端消息")
    private String clientContent;
    @ApiModelProperty("服务端响应消息")
    private String responseContent;

    public String getClientContent() {
        return clientContent;
    }

    public void setClientContent(String clientContent) {
        this.clientContent = clientContent;
    }

    public String getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(String responseContent) {
        this.responseContent = responseContent;
    }
}
