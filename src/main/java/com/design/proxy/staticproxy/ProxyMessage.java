package com.design.proxy.staticproxy;

import com.design.proxy.staticproxy.message.AbstractMessage;
import com.design.proxy.staticproxy.model.MessageTag;

/**
 * @author 张博【zhangb@lianliantech.cn】
 */
public class ProxyMessage extends AbstractMessage {

    private AbstractMessage iMessage = new MessageService();

    @Override
    public void send(MessageTag messageTag) {
        System.out.println("准备参数....开始向服务端发消息");
        iMessage.send(messageTag);
        System.out.println("消息发送完毕，开始接收服务端的消息");
        System.out.println(messageTag.getResponseContent());
    }
}
