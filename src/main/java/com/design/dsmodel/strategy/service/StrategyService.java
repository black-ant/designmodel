/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.dsmodel.strategy.service;

import java.math.BigDecimal;
import org.springframework.stereotype.Service;

/**
 *
 * @author gang
 */
@Service
public class StrategyService {

    private MathAction edit;

    public double editMath(String type, int num1, int mum2) {
        switch (type) {
            case "sum":
                edit = new SUMAction();
                break;
            case "mutiply":
                edit = new multiplyAction();
                break;
            case "divide":
                edit = new devideAction();
                break;
            case "substract":
                edit = new SubstractAction();
                break;
            default:
                System.err.println("com.design.dsmodel.strategy.service.StrategyService.editMath()");
        }

        return edit.math(num1, mum2);
    }
}

interface MathAction {

    public double math(int num1, int mum2);
}

class SUMAction implements MathAction {

    @Override
    public double math(int num1, int num2) {
        return num1 + num2;
    }
}

class SubstractAction implements MathAction {

    @Override
    public double math(int num1, int num2) {
        return num1 - num2;
    }
}

class multiplyAction implements MathAction {

    @Override
    public double math(int num1, int num2) {
        return num1 * num2;
    }
}

class devideAction implements MathAction {

    @Override
    public double math(int num1, int num2) {
        return num1 / num2;
    }
}
