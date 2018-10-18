package com.design.Delegate;

/**
 * @author 张博 [zhangb@novadeep.com]
 */
public class Boss {
    public static void main(String[] args) {
        XiaoMing xm = new XiaoMing();
        xm.send("apple", "把库克给我叫过来");
        xm.send("google", "赶紧停止与美国军方的合作");
    }
}
