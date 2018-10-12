package com.design.proxy.dynamicproxy.cglibproxy;

import com.design.proxy.staticproxy.model.MessageTag;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 张博 [zhangb@novadeep.com]
 */
public class ProxyMessage implements MethodInterceptor {

    public Object newInstance(Object targetProxy) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetProxy.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("准备参数....开始向服务端发消息");
        methodProxy.invokeSuper(o, objects);
        //methodProxy.invoke(targetProxy, objects);
        //method.invoke(targetProxy, objects);
        System.out.println("消息发送完毕，开始接收服务端的消息");
        MessageTag messageTag = (MessageTag)objects[0];
        System.out.println(messageTag.getResponseContent());
        return null;
    }
}
