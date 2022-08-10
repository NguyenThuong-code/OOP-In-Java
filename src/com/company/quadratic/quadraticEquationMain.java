package com.company.quadratic;

import java.util.Scanner;

public class quadraticEquationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = sc.nextInt();
        System.out.println("Enter number b:");
        int b = sc.nextInt();
        System.out.println("Enter number c:");
        int c = sc.nextInt();
            QuadraticEquation quadraticEquation= new QuadraticEquation(a, b,c);
        System.out.println(quadraticEquation.getDiscriminant());
            if(a==0){
                int va1;
                va1= -c/b;
                System.out.println("The Equation has a value:" + va1);
            }else if(a!=0&&b!=0&&c!=0){
                if(quadraticEquation.getDiscriminant()>0){
                    System.out.println("The equation has two values:" +"X1 = "+ quadraticEquation.getRoot1()+ "X2 = "+ quadraticEquation.getRoot2());
                }else if (quadraticEquation.getDiscriminant()==0){
                    System.out.println("The quadratic has a value:" + quadraticEquation.getOnlyRoot());
                }else {
                    System.out.println("The quadratic has no value!");
                }
            }else {
                System.out.println("The quadratic has no value!");
            }
    }

}
