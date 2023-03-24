package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.setName("Rajaraman");
        String name=obj.getName();
        System.out.print(name);


    }
}