package com.design.strategy;

/**
 * @author 张博 [zhangb@novadeep.com]
 */
public class PassCalc {

    public void calc(ICalculator iCalculator, int a, int b) {
        iCalculator.calculate(a, b);
    }
}
