package com.OOPS;

class Employee{
    String name;
    int age;

    void display(){
        System.out.println("Name is: " +name);
        System.out.println("Age is: " +age);
    }
}

class FulltimeEmp extends Employee{
    int monthlysalary;

    void display(){
        super.display();
        System.out.println("Monthly salary is: " +monthlysalary);
    }
}

class ParttimeEmp extends Employee{
    int parttimesalary;

    void display(){
        super.display();
        System.out.println("Part time salary is: " +parttimesalary);
    }
}


public class MethodOverriding {
    public static void main(String[] args){

        FulltimeEmp fte = new FulltimeEmp();
        fte.monthlysalary = 3000;
        fte.name = "Priyanka";
        fte.age = 27;

        ParttimeEmp pte = new ParttimeEmp();
        pte.parttimesalary = 2000;
        pte.name = "Shweta";
        pte.age = 32;

        fte.display();
        pte.display();
    }
}
