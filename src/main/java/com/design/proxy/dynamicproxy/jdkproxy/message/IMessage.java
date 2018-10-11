package com.design.proxy.dynamicproxy.jdkproxy.message;

import com.design.proxy.staticproxy.model.MessageTag;

/**
 * @author 张博【zhangb@lianliantech.cn】
 */
public interface IMessage {

    /**
     * 创建人：张博 [zhangb@novadeep.com]
     * 时间：2018/10/11 4:48 PM
     * @param messageTag 消息包
     * @apiNote 发送消息
     */
    void send(MessageTag messageTag);
}
