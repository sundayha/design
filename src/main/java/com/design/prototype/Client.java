package com.design.prototype;

/**
 * @author 张博 [zhangb@novadeep.com]
 */
public class Client {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("小明");
        person.setSex("男");
        person.setIntroduce("世界首富");
        Person person1 = null, person2 = null;
        try {
            person1 = person.clone();
            person1.setIntroduce("可以改变世界的富豪");
            person2 = person.clone();
            person2.setIntroduce("他真的可以改变世界！");

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(person.getIntroduce());
        System.out.println(person1.getIntroduce());
        System.out.println(person2.getIntroduce());
    }
}
