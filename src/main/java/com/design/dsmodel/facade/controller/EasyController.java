/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.dsmodel.facade.controller;

import com.alibaba.fastjson.JSONObject;
import com.design.dsmodel.facade.service.Computor;
import javax.jws.soap.InitParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gang
 */
@RestController
public class EasyController {

    Computor cpmputor;

    {
        cpmputor = new Computor();
    }

    @RequestMapping("/facadeup")
    public JSONObject facadeOneComUp() {
        JSONObject root = new JSONObject();
        cpmputor.startup();
        return root;
    }

    @RequestMapping("/facadedown")
    public JSONObject facadeOneComDown() {
        JSONObject root = new JSONObject();
        cpmputor.shutdown();
        return root;
    }

}
