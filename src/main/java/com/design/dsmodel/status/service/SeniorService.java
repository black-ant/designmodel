/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.dsmodel.status.service;

/**
 *
 * @author gang
 */
public class SeniorService {

    static DoStart doStart;
    static DoEnd doEnd;

    private String type;

    {
        doStart = new DoStart();
        doEnd = new DoEnd();
    }

    public void doAction() {
        switch (getType()) {
            case "start":
                doStart.run();
                break;
            case "end":
                doEnd.run();
                break;
            default:
                break;
        }
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
}

abstract interface DoSomeAction {

    public void run();
}

class DoStartSenior implements DoSomeAction {

    @Override
    public void run() {
        System.err.println("start Action ");
    }
}

class DoEndSenior implements DoSomeAction {

    @Override
    public void run() {
        System.err.println("end Action");
    }
}
