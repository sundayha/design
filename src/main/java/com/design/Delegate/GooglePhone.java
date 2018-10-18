package com.design.Delegate;

/**
 * @author 张博 [zhangb@novadeep.com]
 */
public class GooglePhone implements IMobilePhone {
    @Override
    public void send(String msg) {
        System.out.println("google: ".concat(msg));
    }
}
