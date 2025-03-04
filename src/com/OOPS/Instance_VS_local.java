package com.OOPS;

class MyObject{
    String name = "Welcome";
    int age = 1;
}
public class Instance_VS_local {
    public static void main(String[] args){
    String name = "Priyanka";
    MyObject st = new MyObject();
    System.out.println("Name is: "+ st.name);
    System.out.println("Name is: "+ st.age);

    System.out.println("Name is: "+ name);
}
}
