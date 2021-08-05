package com.tts;

public class Main {

    public static void main(String[] args) {

        String myString = "Hello world";
        System.out.println(myString.getClass());

        Person person = new Person("Jimmy", 11, "USA");
        Person otherPerson = new Person("Arnold");
        Person catDog = new Person(
                "Cat",
                20,
                "USA",
                new Person("Dog"));

        // println will immediately invoke an object's toString() method
        System.out.println(person);
        System.out.println(otherPerson);
        System.out.println(catDog);

    }

}
