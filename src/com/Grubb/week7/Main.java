package com.Grubb.week7;

/**
 * Created by 014291 on 2/26/2019.
 */
/*
Write a program that includes a class representing contact information for a
person including their name and email address. This class should include a method
for displaying the contact's name and email address. The program should also include
a class for business contacts that extends the contact class and stores the contact's
phone number. The business contact class should override the base class's method that
displays the name and email address so that it displays the phone number in addition to
the name and email address. Create instances of both classes to demonstrate functionality.
 */

public class Main {
    public static void main(String[] args) {
        Contact newContact = new Contact("Ausitn", "ajg05@amfgf.com");
        BusinessContact newBusinessContact = new BusinessContact("Austin","ajg05@amfgf.com", "614-940-0881");
        contactCollection list = new contactCollection();

        newContact.display();
        newBusinessContact.display();

        list.addTo(newContact);
        list.addTo(newBusinessContact);

        list.showList();

    }
}
