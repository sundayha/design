package com.design.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 张博 [zhangb@novadeep.com]
 *
 * 小明
 */
public class XiaoMing {
    private Map<String, IMobilePhone> map = new HashMap<>(2);

    public XiaoMing() {
        map.put("apple", new ApplePhone());
        map.put("google", new GooglePhone());
    }

    /**
     * 创建人：张博 [zhangb@novadeep.com]
     * 时间：2018/10/18 4:10 PM
     * @param phoneName 手机名
     * @param msg 消息
     * @apiNote 委派发送消息
     */
    public void send(String phoneName, String msg) {
        map.get(phoneName).send(msg);
    }
}
