package com.OOPS;

class OverDemo{
    void sum(int num1, int num2){
        int result;
        result = num1 +num2;
        System.out.println("Result is " +result);
    }

    void sum(int num1, int num2, int num3){
        int result;
        result = num1+num2+num3;
        System.out.println("Result is " +result);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        OverDemo obj = new OverDemo();
        obj.sum(10, 20);
        obj.sum(10,20,30);
    }
}
