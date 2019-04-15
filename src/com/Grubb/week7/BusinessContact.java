package com.Grubb.week7;

/**
 * Created by 014291 on 2/26/2019.
 */
public class BusinessContact extends Contact {
    private String phoneNumber;

    public BusinessContact(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void display() {
        System.out.println("Contact{" +
                "\nname: '" + name + '\'' +
                "\nemail: '" + email + '\'' +
                "\nphone number: '" + phoneNumber + '\'' +
                "\n" +'}');
    }
}
