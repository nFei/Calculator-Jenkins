package org.example;



public class Calculator {

    public static void main(String[] args){
        System.out.println("Hello world");
    }

    public double sum(double a, double b){
        return a + b;
    }

    public double substraction(double a, double b){
        return a - b;
    }

    public double multiplication(double a, double b){
        return a * b;
    }

    public double division(double a, double b){
        if(b != 0){
            return a/b;
        }
        return -1;
    }
}

