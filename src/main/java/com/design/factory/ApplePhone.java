package com.design.factory;

/**
 * @author 张博 [zhangb@novadeep.com]
 */
public class ApplePhone implements IPhone {
    @Override
    public void sendMsg(String msg) {
        System.out.println("ApplePhone: ".concat(msg));
    }
}
