package com.design.prototype;

/**
 * @author 张博 [zhangb@novadeep.com]
 */
public class Person implements Cloneable {

    private String name;
    private String sex;
    private String introduce;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.name = this.name;
        person.sex = this.sex;
        person.introduce = this.introduce;
        return person;
    }
}
