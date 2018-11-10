/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.dsmodel.strategy.controller;

import com.alibaba.fastjson.JSONObject;
import com.design.dsmodel.strategy.service.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gang
 */
@RestController
public class StrategyController {

    @Autowired
    StrategyService strategyService;

    @RequestMapping("/strategy")
    public JSONObject seniorStatus() {
        JSONObject root = new JSONObject();

        strategyService.editMath("sum", 5, 9);
        strategyService.editMath("mutiply", 5, 9);
        strategyService.editMath("divide", 5, 9);
        strategyService.editMath("substract", 5, 9);

        return root;
    }
}
