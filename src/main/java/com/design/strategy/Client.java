package com.design.strategy;

/**
 * @author 张博 [zhangb@novadeep.com]
 */
public class Client {

    public static void main(String[] args) {
        // 传统的可以使用 if(type.equals("+")) else if(type.equals("-")) 来判断。如果业务逻辑过多将会为后期开发维护带来困难
        PassCalc calc = new PassCalc();
        calc.calc(new Add(), 1, 1);
        calc.calc(new Sub(), 1, 1);
        calc.calc(new Multiply(), 1, 1);
        calc.calc(new Divide(), 1, 1);
    }
}
