/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.dsmodel.status.controller;

import com.alibaba.fastjson.JSONObject;
import com.design.dsmodel.status.service.EasyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 状态模式
 *
 * @author gang
 */
public class EasyController {

    @Autowired
    EasyService easyS;

    /**
     * *
     * 简单版:
     *
     * 仅需要使用if-else分别调用不同的方法类型
     */
    @RequestMapping("east")
    public JSONObject easyStatus() {
        JSONObject root = new JSONObject();

        easyS.setType("start");
        easyS.doAction();

        easyS.setType("end");
        easyS.doAction();

        return root;
    }

    /**
     * *
     * 复杂版:
     *
     * 仅需要使用if-else分别调用不同的方法类型
     */
    @RequestMapping("east")
    public JSONObject seniorStatus() {
        JSONObject root = new JSONObject();

        easyS.setType("start");
        easyS.doAction();

        easyS.setType("end");
        easyS.doAction();

        return root;
    }
}
