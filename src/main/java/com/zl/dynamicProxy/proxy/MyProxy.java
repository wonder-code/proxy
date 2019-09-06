package com.zl.dynamicProxy.proxy;

import com.zl.dynamicProxy.serviceintef.TicketServiceIntef;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxy implements InvocationHandler {
    private TicketServiceIntef ticketServiceIntef;

    public MyProxy(TicketServiceIntef ticketServiceIntef){
        this.ticketServiceIntef = ticketServiceIntef;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("卖票前");
        Object result = method.invoke(ticketServiceIntef, args);
        System.out.println("卖票后");
        return result;
    }
}
