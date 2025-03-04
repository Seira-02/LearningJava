package com.OOPS;


import java.util.Scanner;

class Student{
    private String name;
    private int age;
    private char gender;

    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();

        System.out.println("Enter age: ");
        age = sc.nextInt();

        System.out.println("Enter Gender: ");
        gender = sc.next().charAt(0);
    }

    public void display(){
        System.out.println("Name is: " +name);
        System.out.println("Age is: " +age);
        System.out.println("Gender is: " +gender);
    }
}
public class pvt_scannerClass {
    public static void main(String[] args){
        Student st = new Student();
        st.accept();
        st.display();

    }
}
