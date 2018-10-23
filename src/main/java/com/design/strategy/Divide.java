package com.design.strategy;

/**
 * @author 张博 [zhangb@novadeep.com]
 */
public class Divide implements ICalculator {
    @Override
    public void calculate(int a, int b) {
        System.out.println("除：" + (a / b));
    }
}
