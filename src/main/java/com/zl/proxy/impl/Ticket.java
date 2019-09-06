package com.zl.proxy.impl;

import com.zl.proxy.intef.Ticketintef;

public class Ticket implements Ticketintef {
    public static int count = 100;
    public int price = 10;
    public void sellTicket() {
        count--;
        System.out.println("花了"+price+"元买了一张票，还剩"+count+"张票");
    }
}
