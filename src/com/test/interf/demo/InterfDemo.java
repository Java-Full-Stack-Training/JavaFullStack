package com.test.interf.demo;

class Dog implements Animal {
    @Override
    public String eat(String eatingHabit) {    //different behaviour
        //
        return eatingHabit;
    }

    @Override
    public String mammel(String animmalType) {
        return null;
    }
}
class Lion implements Animal {    //different
    Lion()   // new Lion
    {
        System.out.println("This is the Lion class called");
    }
    @Override
    public String eat(String eatingHabit) {

        //
        return eatingHabit;
    }

    @Override
    public String mammel(String animmalType) {
        return null;
    }
}

public class InterfDemo {
    public static void main(String[] args) {
        Animal obj = new Dog();  //indirect  //run time
        //reference
        System.out.println(obj.eat("VEG"));

        Animal obj1=new Lion();
        System.out.println(obj1.eat("Non Veg"));

    }


}





