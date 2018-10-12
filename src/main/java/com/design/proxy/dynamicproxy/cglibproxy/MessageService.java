package com.design.proxy.dynamicproxy.cglibproxy;

import com.design.proxy.staticproxy.model.MessageTag;

/**
 * @author 张博 [zhangb@novadeep.com]
 */
public class MessageService {

    public void send(MessageTag messageTag) {
        System.out.println("接收客户端消息：".concat(messageTag.getClientContent()));
        messageTag.setResponseContent("目标对象返回的消息-> 服务端已接收：".concat(messageTag.getClientContent()));
    }
}
