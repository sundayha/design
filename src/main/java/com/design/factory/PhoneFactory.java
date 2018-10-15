package com.design.factory;

/**
 * @author 张博 [zhangb@novadeep.com]
 */
public class PhoneFactory<I> {

    @SuppressWarnings("unchecked")
    public <T> T newInstance(Class<T> tClass) {
        I i = null;
        try {
           i = (I) Class.forName(tClass.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) i;
    }
}
