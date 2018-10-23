package com.design.strategy;

/**
 * @author 张博 [zhangb@novadeep.com]
 *
 * 计算器接口
 */
public interface ICalculator {

    /**
     * 创建人：张博 [zhangb@novadeep.com]
     * 时间：2018/10/23 10:31 AM
     * @param a 数1
     * @param b 数2
     * @apiNote 计算 a 与 b 的加减乘除
     */
    void calculate(int a, int b);
}
