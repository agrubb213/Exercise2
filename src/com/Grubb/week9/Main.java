package com.Grubb.week9;




/**
 * Created by 014291 on 3/12/2019.
 */

/*
 create an abstract class for contacts that stores a contact's name and defines an
 abstract method contact(). Create one class that makes use of the abstract contact
 class that stores an email address and implements the contact() method using the email
 address and another class that stores a phone number and implements the contact() method
 using the phone number. The implementation of the contact() method should simply print a
 string with the appropriate information like "Emailing aneuman1@cscc.edu" or "Calling 123-456-7890".
 */
abstract class ContactInfo{

    ContactInfo() {

    }

    public abstract void contact();
}
class emailClass extends ContactInfo{
    public String email;

    public emailClass(String email){
        this.email = email;
    }
    @Override
    public void contact(){
        System.out.println(email);
       }
}
class phoneClass extends ContactInfo{
    public String phone;

    public phoneClass(String phone){
        this.phone = phone;
    }
    @Override
    public void contact(){
        System.out.println(phone);
    }
}
public class Main {
    public static void main(String[] args) {
        emailClass test = new emailClass("ajg0525@att.net");
        phoneClass asa = new phoneClass("614-940-0881");
        asa.contact();
        test.contact();
    }
}
