package com.core.test;

abstract class AnimalClass{ //Parent
    public abstract String  eat(String eatingHabit);
    public abstract String  bark(String bark);
}
abstract class DogClass extends AnimalClass{   //10(5)
    @Override
    public String eat(String eatingHabit) {
        return null;
    }

}
class Puppy extends DogClass  //(5)
{

    @Override
    public String bark(String bark) {
        return null;
    }
}
public class AbstractDemo {
}
