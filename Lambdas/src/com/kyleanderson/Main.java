package com.kyleanderson;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    new Thread(()-> {
	        System.out.println("Printing from the Runnable");
            System.out.println("Line 2");
            System.out.format("This is line %d\n",3);
        }).start();

	    Employee john = new Employee("John Doe", 30);
	    Employee tim = new Employee("Tim Bulchalk", 21);
	    Employee jack = new Employee("Jack Hill", 40);
	    Employee snow = new Employee("Snow White", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
    }

}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



