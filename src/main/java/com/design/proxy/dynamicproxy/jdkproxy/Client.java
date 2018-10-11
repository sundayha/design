package com.design.proxy.dynamicproxy.jdkproxy;

import com.design.proxy.dynamicproxy.jdkproxy.message.IMessage;
import com.design.proxy.staticproxy.model.MessageTag;

/**
 * @author 张博 [zhangb@novadeep.com]
 */
public class Client {
    public static void main(String[] args) {
        ProxyMessage proxyMessage = new ProxyMessage();
        MessageTag messageTag = new MessageTag();
        messageTag.setClientContent("你是什么品种的猪，怎么这么凶");
        IMessage iMessage = (IMessage) proxyMessage.newInstance(new MessageService());
        iMessage.send(messageTag);
    }
}
