package com.design.proxy.staticproxy.message;

import com.design.proxy.staticproxy.model.MessageTag;

/**
 * @author 张博 [zhangb@novadeep.com]
 * @since 2018/10/11 10:59 AM
 */
public abstract class AbstractMessage {

    /**
     * 创建人：张博 [zhangb@novadeep.com]
     * 时间：2018/10/11 4:48 PM
     * @param messageTag 消息包
     * @apiNote 发送消息
     */
    public void send(MessageTag messageTag){}
}
