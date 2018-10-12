package com.design.factory;

/**
 * @author 张博 [zhangb@novadeep.com]
 */
public class GooglePhone implements IPhone {

    @Override
    public void sendMsg(String msg) {
        System.out.println("GooglePhone: ".concat(msg));
    }
}
