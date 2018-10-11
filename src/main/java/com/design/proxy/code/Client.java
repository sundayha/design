package com.design.proxy.code;

import com.design.proxy.code.message.AbstractMessage;
import com.design.proxy.code.model.MessageTag;

/**
 * @author 张博【zhangb@lianliantech.cn】
 */
public class Client {

    public static void main(String[] args) {
        AbstractMessage message = new ProxyMessage();
        MessageTag messageTag = new MessageTag();
        messageTag.setClientContent("你是什么品种的猪，怎么这么凶");
        message.send(messageTag);
    }
}
