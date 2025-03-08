package com.OOPS;

class Parent{
    Parent get(){
        return this;
    }
}

class child extends Parent{
    child get(){
        return this;
    }

    public void display(){
        System.out.println("This is an instance method");
    }
}
public class coVariant {
    public static void main(String[] args){
        child obj = new child();
        obj.get();
        obj.display();
    }
}
