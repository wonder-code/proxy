package com.zl.dynamicProxy.service;

import com.zl.dynamicProxy.proxy.MyProxy;
import com.zl.dynamicProxy.serviceintef.TicketServiceIntef;

import java.lang.reflect.Proxy;

public class TicketService implements TicketServiceIntef {
    private static final TicketServiceIntef ticketServiceIntef = new TicketService();
    public TicketService(){}
    public static TicketServiceIntef getInstance(){
        return (TicketServiceIntef) Proxy.newProxyInstance(ticketServiceIntef.getClass().getClassLoader(),
                ticketServiceIntef.getClass().getInterfaces(), new MyProxy(ticketServiceIntef));
    }
    public void sellTicket() {
        System.out.println("卖票");
    }
}
