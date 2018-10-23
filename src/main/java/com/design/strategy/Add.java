package com.design.strategy;

/**
 * @author 张博 [zhangb@novadeep.com]
 */
public class Add implements ICalculator {
    @Override
    public void calculate(int a, int b) {
        System.out.println("加：" + (a + b));
    }
}
