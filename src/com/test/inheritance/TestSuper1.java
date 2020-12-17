package com.test.inheritance;

class Animal{   //base class
    String color="white";
    void printColor(){
        System.out.println("base class");//prints color of Dog class
            }
}
class Dog extends Animal{  //derived class
    String color="black";    //derived class variable
    void printColor(){
        super.printColor();
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }
}
class TestSuper1{
    public static void main(String args[]){
        Dog d=new Dog();
        d.printColor();   //usinng superkeyword base class varable called
    }}