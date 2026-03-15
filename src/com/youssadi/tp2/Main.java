package com.youssadi.tp2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Addess{
    private String zipCode;
    private String city;
    public Addess(String zipCode, String city) {
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
class Person {
    private String name;
    private Addess addess;
    public Person(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Addess getAddess() {
        return addess;
    }

    public void setAddess(Addess addess) {
        this.addess = addess;
    }
}
public class Main {
    public static void main(String[] args) throws MyException, FileNotFoundException {
        int a = 2;
        int b =5;
        if(a==0){
                throw new MyException("Division par zéro");
        }else {
                System.out.println(b/a);
        }
        Person p = new Person("john");
        try {
            System.out.println(p.getAddess().getZipCode());
        }catch(RuntimeException e){
            e.printStackTrace();
        }



        System.out.println("code apres l erreur");
    }
}
