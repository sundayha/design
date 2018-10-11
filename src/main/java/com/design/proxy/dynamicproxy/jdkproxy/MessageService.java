package com.design.proxy.dynamicproxy.jdkproxy;

import com.design.proxy.dynamicproxy.jdkproxy.message.IMessage;
import com.design.proxy.staticproxy.model.MessageTag;

/**
 * @author 张博 [zhangb@novadeep.com]
 */
public class MessageService implements IMessage {

    @Override
    public void send(MessageTag messageTag) {
        System.out.println("接收客户端消息：".concat(messageTag.getClientContent()));
        messageTag.setResponseContent("目标对象返回的消息-> 服务端已接收：".concat(messageTag.getClientContent()));
    }
}
