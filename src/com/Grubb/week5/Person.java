package com.Grubb.week5;

/**
 * Created by 014291 on 2/12/2019.
 */
/*
  Create a class that represents contact information for a person. The class should store the person's name and their email address.
  Create a second class that represents an address book (a collection of contact information for many people)
  that includes methods for adding new contact information and for searching the existing collection for a contacts
  email address when the name is specified.
  The program should create instances of the classes and demonstrate the functionality.
*/
public class Person {
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
