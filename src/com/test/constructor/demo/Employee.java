package com.test.constructor.demo;

public class Employee {

    int empId;   //class variables
    String empName; //class variables
    String location;
    int deptId;
    String deptName;

    //parameterized constructor with two parameters
    Employee(int empId, String name){
        this.empId = empId;
        this.empName = name;
    }
    Employee(int deptId, String deptName,String location){
        this.deptId = deptId;
        this.deptName = deptName;
        this.location= location;
    }
    void info(){
        System.out.println("Id: "+empId+" Name: "+empName);
        System.out.println("DeptId: "+deptId+" DeptName: "+deptName+":Dept Location"+location);
    }

    public static void main(String args[]){
        Employee obj1 = new Employee(10245,"Chaitanya");
        Employee obj2 = new Employee(92232,"Negan");
        Employee obj3 = new Employee(92232,"IT","Mumbai");
        obj1.info();
        obj2.info();
        obj3.info();


        char chararray[]={'A','E','I','O','U'};   //constructor accepts characterarray
        String str1=new String(chararray);

        String str2=new String("Test");
        String str=new String();  //default

    }
}