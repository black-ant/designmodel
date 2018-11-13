/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.dsmodel.mediator.service;

/**
 *
 * @author gang
 */
public class EasyService {

}
//买家卖家抽象类

abstract class User {

    protected String name;

    public abstract void askMediator();

    public abstract void message();
}

class BuyUser extends User {

    @Override
    public void askMediator() {

    }

    @Override
    public void message() {
        System.out.println("我是" + this.name + ",我需要买一件东西");
    }
}

class SellUser extends User {

    @Override
    public void askMediator() {

    }

    @Override
    public void message() {
        System.out.println("我需要卖一件东西");
    }
}

class Mediator {

    private BuyUser buser;
    private SellUser suser;


public void 
}
