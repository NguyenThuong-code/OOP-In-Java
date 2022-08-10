package com.company.fan;


public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private String speed = "SLOW";
    private boolean on;
    private double radius = 5;
    private String color = "blue";

    Fan(String speed, String color, double radius, boolean on) {
        this.speed = speed;
        this.color = color;
        this.radius = radius;
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        if (speed=="SLOW"){
            return getSLOW();
        }else if (speed=="MEDIUM"){
            return getMEDIUM();
        }else
            return getFAST();
    }

    public boolean isOn() {
        return on;
    }

    public String toString() {
        if (isOn()== true) {
            return "fan is on " + "Speed: " + getSpeed() + " Color: " + getColor() + " radius: " + getRadius();
        }
            return "fan is off " + "Color: " + getColor() + " radius: " + getRadius();

    }
    public int getSLOW(){
        return SLOW;
    }
    public int getFAST(){
        return FAST;
    }
    public int getMEDIUM(){
        return MEDIUM;
    }
//    }
//    public void setRadius(double radius){
//        this.radius=radius;
//    }
//    public void setColor(String color){
//        this.color= color;
//    }
//    public void setSpeed(int speed){
//        this.speed= speed;
//    }

}
