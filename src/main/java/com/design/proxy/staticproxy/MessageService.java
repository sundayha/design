package com.design.proxy.staticproxy;

import com.design.proxy.staticproxy.message.AbstractMessage;
import com.design.proxy.staticproxy.model.MessageTag;

/**
 * @author 张博【zhangb@lianliantech.cn】
 */
public class MessageService extends AbstractMessage {

    @Override
    public void send(MessageTag messageTag) {
        System.out.println("接收客户端消息：".concat(messageTag.getClientContent()));
        messageTag.setResponseContent("目标对象返回的消息-> 服务端已接收：".concat(messageTag.getClientContent()));
    }
}
