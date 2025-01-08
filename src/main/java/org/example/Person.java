package org.example;

public class Person {
    String firstName;
    String lastName;
    String address;
    String occupation;
    int salary;
    int age;


    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName, String address, String occupation, int salary, int age ){
        this(firstName, lastName, age);
        this.address = address;
        this.occupation = occupation;
        this.salary = salary;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public boolean isTeen(){
        return age >= 13 && age <= 19;
    }
}
