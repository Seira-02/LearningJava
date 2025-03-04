package com.OOPS;

import java.util.Scanner;

class student{
    String name;
    int age;

    student(String n, int a){
        name = n;
        age = a;
    }

    public void display(){
        System.out.println("Student name is: " +name);
        System.out.println("Student age is: " +age);
    }
}

public class forTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        student st = new student(name, age);
        st.display();

    }
}