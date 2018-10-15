package com.design.factory;

/**
 * @author 张博 [zhangb@novadeep.com]
 */
public class Client {

    public static void main(String[] args) {
        PhoneFactory<IPhone> phoneFactory = new PhoneFactory<>();

        IPhone applePhone = phoneFactory.newInstance(ApplePhone.class);
        applePhone.sendMsg("hi jack");

        IPhone googlePhone = phoneFactory.newInstance(GooglePhone.class);
        googlePhone.sendMsg("hi jackson");
    }
}
