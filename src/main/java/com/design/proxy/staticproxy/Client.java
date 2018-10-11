package com.design.proxy.staticproxy;

import com.design.proxy.staticproxy.message.AbstractMessage;
import com.design.proxy.staticproxy.model.MessageTag;

/**
 * @author 张博【zhangb@lianliantech.cn】
 *
 * 静态代理实现
 */
public class Client {

    public static void main(String[] args) {
        AbstractMessage message = new ProxyMessage();
        MessageTag messageTag = new MessageTag();
        messageTag.setClientContent("你是什么品种的猪，怎么这么凶");
        message.send(messageTag);
    }
}
