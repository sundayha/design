package com.design.factory;

/**
 * @author 张博 [zhangb@novadeep.com]
 */
public class PhoneFactory<I> {

    public <T extends I> T newInstance(Class<T> tClass) {
        T i = null;
        try {
           i = tClass.cast(Class.forName(tClass.getName()).newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }
}
