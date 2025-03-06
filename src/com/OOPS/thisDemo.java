package com.OOPS;

class TestDemo{
    int num = 20;

    void display(){
        int num = 10;
        System.out.println("Value of num is: " +num);
        System.out.println("Value of num is: " + this.num);
    }
}

public class thisDemo {
    public static void main(String[] args){
        TestDemo obj = new TestDemo();
        obj.display();
    }
}
