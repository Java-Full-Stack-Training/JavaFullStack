package com.test.inheritance;


class Bike extends Vehicle {
    @Override
    public void VechicleType(String type) throws Exception {

        super.VechicleType(type);
    }

    public void engineType() {
        System.out.println(super.location);
        super.engineType("type");
    }


    public void sports(String sport) {  //additional methods in the derived class
        System.out.println("Sport" + sport);
    }
}
