package com.OOPS;
//Abstract class can only be inherited it means we cannot create an object of it.

abstract class Animal{

    public void display(){
        System.out.println("I have the body");
    }
    public abstract void FoodHabit();
}

class Herbivorus extends Animal{

    public void FoodHabit(){
        System.out.println("I eat only Plants");
    }

}

public class abstractClass {
    public static void main(String[] args){
        //Animal obj = new Animal();             //CTE as we cannot make object of the parent class
        Herbivorus obj = new Herbivorus();
        obj.FoodHabit();
        obj.display();

    }
}
