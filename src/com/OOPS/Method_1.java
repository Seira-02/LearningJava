package com.OOPS;

class student1 {
    String name;
    int age;
}

public class Method_1{
    public static void main(String[] args){
        student1 st = new student1();

        System.out.println("Age is : " +st.age);
        System.out.println("Name is: " +st.name);

        st.name = "Dev";
        st.age = 11;

        System.out.println("Age is : " +st.age);
        System.out.println("Name is: " +st.name);
    }
}
