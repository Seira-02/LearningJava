package com.OOPS;
// We cannot override static method. If done so it will become method hiding and not method overriding
class Parent1{
    public static void classMethod(){
        System.out.println("In Parent");
    }
    public void instanceMethod(){
        System.out.println("In Parent");
    }
}

class Child1 extends Parent1{
    public static void classMethod(){                  //Method hiding
        System.out.println("In Child");
    }
    public void instanceMethod(){
        System.out.println("In Child");                //Method Overriding
    }
}
public class ForTest1 {
    public static void main(String[] args){
        Child1 obj = new Child1();
        obj.instanceMethod();                          //call with object
        obj.classMethod();                             //call with reference
    }
}
