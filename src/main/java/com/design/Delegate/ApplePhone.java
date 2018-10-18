package com.design.Delegate;

/**
 * @author 张博 [zhangb@novadeep.com]
 */
public class ApplePhone implements IMobilePhone {
    @Override
    public void send(String msg) {
        System.out.println("apple: ".concat(msg));
    }
}
