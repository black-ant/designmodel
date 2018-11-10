/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.dsmodel.status.service;

import org.springframework.stereotype.Service;

/**
 * 核心管理类,用于通过条件去管理状态的执行方法
 *
 * @author gang
 */
@Service
public class EasyService {

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

class DoStart {

    public void run() {
        System.err.println("start Action ");
    }
}

class DoEnd {

    public void run() {
        System.err.println("end Action");
    }
}
