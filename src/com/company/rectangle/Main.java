package com.company.rectangle;

public class Main {

    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter number height:");
//        int height = sc.nextInt();
//        System.out.println("Enter number Width:");
//        int width = sc.nextInt();
        Rectangle rectangle= new Rectangle();
        System.out.println("Display height and width:"+ rectangle.display());
        System.out.println("The Area of the Rectangle:"+ rectangle.getArea());
        System.out.println("The Perimeter of the Rectangle:"+ rectangle.getPerimeter());
    }
}
