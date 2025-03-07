package com.OOPS;

import com.sun.source.tree.ParenthesizedTree;

class Parents{
    void disp(){
        System.out.println("This demo is for single level inheritance");
    }
}

class Child extends Parents{
    void honk(){
        System.out.println("Beep Beep");
    }
}
public class SingleInheritance {
    public static void main(String[] args){
        Child obj = new Child();
        obj.disp();
        obj.honk();
    }
}
