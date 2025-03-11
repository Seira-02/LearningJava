package com.OOPS;

public class InterDemo3{
    public static void main(String[] args){
        InterDemo2 obj = new InterDemo2();
        obj.print();

        Printable p = new InterDemo2();
        p.print();

        Showable s = new InterDemo2();
        s.print();
    }
}