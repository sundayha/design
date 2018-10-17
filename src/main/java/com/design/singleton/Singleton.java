package com.design.singleton;

/**
 * @author 张博 [zhangb@novadeep.com]
 */
public class Singleton {

    private static Singleton singleton = null;
    private Singleton() {}

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }

    public void getSome() {
        System.out.println("单例模式");
    }
}
