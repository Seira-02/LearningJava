package com.OOPS;

class student2{
    private String name;
    private int age;


     public void accept(String n, int a){
        name = n;
        age = a;

    }
    public void display(){
        System.out.println("Name is: " +name);
        System.out.println("Age is: " +age);
    }
}
public class privateMethod{
public static void main(String[] args){
    student2 st2 = new student2();
    st2.accept("Priyanka", 27);
    st2.display();

    student2 st3 = new student2();
    st3.accept("Priya", 28);
    st3.display();

}
    }
