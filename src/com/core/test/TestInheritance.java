package com.core.test;

abstract class Animal{ //Parent
   public abstract String  eat(String eatingHabit);  //abstract

   public void display()  //instance
   {

   }
}
class Dog extends Animal{ //Child
    void bark(){System.out.println("barking...");}

    @Override     //implentation
    public String  eat(String str) {   //method overriding
        String foodHabits="Dog Eats veg food";
    return foodHabits;
    }
}
class Lion extends Animal{ //Child
    void Roar(){System.out.println("roar...");}

    @Override
    public String  eat(String str) {
        System.out.println("Lion eats the Non Veg Food");
        return "";
    }
}
class TestInheritance{
    public static void main(String args[]){
        Dog d=new Dog();
        d.bark();  //from the derived class
        d.eat("veg"); //getting this class from the base class
        Lion lion=new Lion();
        lion.eat("Non veg");
    }}