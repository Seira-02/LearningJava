package com.OOPS;

public interface InterfaceDemo {
    public static final int FEES = 5000;
    public abstract void disp();
}

class Tester implements InterfaceDemo{
    public void disp(){
        System.out.println("I have the body");
    }
    public static void maim(String[] args){
        System.out.println("The fees is: " +FEES);
        Tester obj1 = new Tester();                //OK
        obj1.disp();

        InterfaceDemo obj2 = new Tester();         //OK
        obj2.disp();
    /*
        InterfaceDemo onj3 = new InterfaceDemo();
        obj3.disp();                           / NOT OK bcz we cannot create object of interface class
     */
}
}
