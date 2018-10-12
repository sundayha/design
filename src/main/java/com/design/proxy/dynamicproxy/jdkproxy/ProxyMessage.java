package com.design.proxy.dynamicproxy.jdkproxy;

import com.design.proxy.staticproxy.model.MessageTag;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 张博 [zhangb@novadeep.com]
 */
public class ProxyMessage implements InvocationHandler {

    private Object targetProxy;

    /**
     * 创建人：张博 [zhangb@novadeep.com]
     * 时间：2018/10/12 9:37 AM
     * @param targetProxy 需要代理的目标类对象
     * @apiNote 返回实现了指定接口代理类的实例
     * @return Object
     */
    public Object newInstance(Object targetProxy) {
        this.targetProxy = targetProxy;
        return Proxy.newProxyInstance(targetProxy.getClass().getClassLoader(), targetProxy.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("准备参数....开始向服务端发消息");
        method.invoke(targetProxy, args);
        System.out.println("消息发送完毕，开始接收服务端的消息");
        MessageTag messageTag = (MessageTag)args[0];
        System.out.println(messageTag.getResponseContent());
        return null;
    }
}
