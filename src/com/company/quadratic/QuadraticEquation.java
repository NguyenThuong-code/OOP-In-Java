package com.company.quadratic;

public class QuadraticEquation {
        int a;
        int b;
        int c;
    QuadraticEquation( int a, int b, int c){
        this.a= a;
        this.b=b;
        this.c=c;
    }
    double getDiscriminant(){
        return (Math.pow(b,2))-(4*a*c);
    }
    double getRoot1(){
        return (-b+(Math.sqrt(getDiscriminant())))/2*a;
    }
    double getRoot2(){
        return (-b-(Math.sqrt(getDiscriminant())))/2*a;
    }
    double getOnlyRoot(){
        return (-b/2*a);
    }
}
