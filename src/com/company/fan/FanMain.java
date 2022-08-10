package com.company.fan;

public class FanMain {
    public static void main(String[] args) {
        Fan fan= new Fan("FAST","yellow",10,true);
        Fan fan1=new Fan("MEDIUM", "blue", 5, false);
        System.out.println(fan.toString());
        System.out.println(fan1.toString());
    }
}
