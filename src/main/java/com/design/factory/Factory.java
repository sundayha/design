package com.design.factory;

/**
 * @author 张博 [zhangb@novadeep.com]
 */
public class Factory<R> {

    public <T extends R> T getInstance(Class<T> tClass) {
        T r = null;
        try {
            r = tClass.cast(Class.forName(tClass.getName()).newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return r;
    }
}
