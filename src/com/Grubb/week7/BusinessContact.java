package com.Grubb.week7;

/**
 * Created by 014291 on 2/26/2019.
 */
public class BusinessContact extends Contact {
    private String phoneNumber;
    @Override
    public String toString() {
        return "Contact{" +
                "\nname: '" + name + '\'' +
                "\nemail: '" + email + '\'' +
                "\nphone number: '" + phoneNumber + '\'' +
                "\n" +'}' ;
    }
}
