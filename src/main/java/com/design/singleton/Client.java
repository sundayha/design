package com.design.singleton;

/**
 * @author 张博【zhangb@lianliantech.cn】
 */
public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.getSome();
    }
}
