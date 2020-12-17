package com.test.inheritance;

class Vehicle {
    String engine;
    String Type;
    String location="India";
    public void VechicleType(String type) throws Exception {

        System.out.println("Vechile Type" + type);
    }

    public void engineType(String type) {

        System.out.println("Engine Type" + type);
    }


}