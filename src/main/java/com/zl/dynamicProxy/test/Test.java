package com.zl.dynamicProxy.test;

import com.zl.dynamicProxy.proxy.MyProxy;
import com.zl.dynamicProxy.service.TicketService;

import java.lang.reflect.Proxy;

public class Test {
    private TicketService ticketService = new TicketService();
    @org.junit.Test
    public void test(){
        TicketService ticketServiceProxy = (TicketService) Proxy.newProxyInstance(ticketService.getClass().getClassLoader(),
                ticketService.getClass().getInterfaces(), new MyProxy(ticketService));
        ticketServiceProxy.sellTicket();
    }
//    @org.junit.Test
//    public void test1() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Class<?> proxyClass = Proxy.getProxyClass(ticketServiceIntef.getClass().getClassLoader(),
//                ticketServiceIntef.getClass().getInterfaces());
//        InvocationHandler invocationHandler = new MyProxy(ticketServiceIntef);
//        Constructor<?> constructor = proxyClass.getConstructor(InvocationHandler.class);
//        TicketServiceIntef proxy = (TicketServiceIntef) constructor.newInstance(invocationHandler);
//        proxy.sellTicket();
//    }
    @org.junit.Test
    public void test2(){
        TicketService.getInstance().sellTicket();
    }
}
