package org.example;

public class Person {
    String firstname;
    String lastname;
    int age;
    double weight;
    double height;
    String favLang;


    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Person(String firstname, String lastname, int age, double weight, double height, String favLang) {
        this(firstname, lastname, age);
        this.weight = weight;
        this.height = height;
        this.favLang = favLang;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        if (this.age < 19 && this.age >= 13) {
            return true;
        }
        return false;
    }
}
