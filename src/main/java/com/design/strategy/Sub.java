package com.design.strategy;

/**
 * @author 张博 [zhangb@novadeep.com]
 */
public class Sub implements ICalculator {
    @Override
    public void calculate(int a, int b) {
        System.out.println("减：" + (a - b));
    }
}
