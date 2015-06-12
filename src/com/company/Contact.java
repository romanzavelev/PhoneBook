package com.company;

/**
 * Created by admin on 04.06.2015.
 */
public class Contact {
    public String name;
    String phone;
    int age;

    public Contact(String name,String phone,int age){
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public void  toString(Contact c){
        System.out.println("Name: "+c.name+" Phone: " + c.phone + " age: " + c.age);
    }
}
