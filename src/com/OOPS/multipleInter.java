package com.OOPS;
//This demo is for multiple inheritance
interface inter1{
    default void diplay(){
        System.out.println("Default method for inter1");
    }
}

interface inter2{
    default void display(){
        System.out.println("Default method for inter2");
    }
}

class Child3 implements inter1,inter2{
    public void display(){
        System.out.println("Child body");
        inter1.super.diplay();
        inter2.super.display();
    }
}
public class multipleInter {
    public static void main(String[] args) {

        Child3 ch3 = new Child3();
        ch3.display();
    }
}
