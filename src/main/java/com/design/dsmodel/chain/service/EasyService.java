/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.dsmodel.chain.service;

/**
 *
 * @author gang
 */
public class EasyService {

    public void askForLeave(int day) {
        AbstrractLeader leader_1 = new Leader_one();
        AbstrractLeader leader_2 = new Leader_two();
        AbstrractLeader leader_3 = new Leader_three();
        AbstrractLeader leader_4 = new Leader_four();
        leader_1.setNextLeader(leader_2);
        leader_2.setNextLeader(leader_3);
        leader_3.setNextLeader(leader_4);
        leader_1.leaderHandle(day);
    }

    public void askForLeaveNo2(int day) {
        AbstrractLeader leader_1 = new Leader_one();
        AbstrractLeader leader_2 = new Leader_two();
        AbstrractLeader leader_3 = new Leader_three();
        AbstrractLeader leader_4 = new Leader_four();
        leader_1.setNextLeader(leader_3);
        leader_3.setNextLeader(leader_4);
        leader_1.leaderHandle(day);
    }

}

enum Level {
    level_0(0, "无需请假"),
    level_1(1, "辅导员同意"),
    level_2(3, "系领导同意"),
    level_3(5, "院长同意"),
    level_4(7, "校领导同意");

    private int levelNum;
    private String desc;

    private Level(int levelNum, String desc) {
        this.levelNum = levelNum;
        this.desc = desc;
    }

    public int getLevelNum() {
        return levelNum;
    }

    public void setLevelNum(int levelNum) {
        this.levelNum = levelNum;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}

abstract class AbstrractLeader {

    protected AbstrractLeader nextLeader;
    protected int day;
    protected Level levelitem = Level.level_0;

    public void setNextLeader(AbstrractLeader nextLeader) {
        this.nextLeader = nextLeader;
    }

    protected void toNextLeader() {
        if (null != nextLeader) {
            nextLeader.leaderHandle(day);
        }
    }

    public void leaderHandle(int day) {
        if (this.day <= day) {
            System.out.println("请假条已阅," + levelitem.getDesc());
        }
        toNextLeader();
    }
}

class Leader_one extends AbstrractLeader {

    protected Level levelitem = Level.level_1;
}

class Leader_two extends AbstrractLeader {

    protected Level levelitem = Level.level_2;
}

class Leader_three extends AbstrractLeader {

    protected Level levelitem = Level.level_3;
}

class Leader_four extends AbstrractLeader {

    protected Level levelitem = Level.level_4;
}
