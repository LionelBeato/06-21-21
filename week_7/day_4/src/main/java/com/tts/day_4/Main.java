package com.tts.day_4;

import com.tts.day_4.inheritance.Dog;

import java.util.List;

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

        Dog myDog = new Dog();
        myDog.doSpeak();

        person.sayHello();
        /*
            otherPerson.getName() is our argument
            it has to take the shape of the parameter
            defined in our Person class
         */
        person.sayHello(otherPerson.getName());

        System.out.println(person.getName() +
                " will be " +
                person.ageNextYear() +
                " years old next year");

        Book myBook = new Book();
        Book otherBook = new Book();
        myBook.author = "RL Stine";
        System.out.println(myBook.author);
        System.out.println(otherBook.author);

        int x;
        Integer y = 4;

        System.out.println(y.floatValue());

        Student student = new Student("Timmy",
                27,
                "USA",
                2022,
                true);

        System.out.println(student);

//        List<Student> studentList = new ArrayList<>();
        List<Student> studentList = List.of(
                new Student("Bob", 28, "USA", 2022, false),
                new Student("Susie", 21, "USA", 2024, false),
                new Student("Sam", 25, "USA", 2023, false)
                );

//        studentList
//                .forEach(el ->  el.setEnrolled(true));

//        System.out.println(studentList);
        studentList
//                .stream().filter(el -> el.getEnrolled())
                .forEach(el -> System.out.println(el));

        for (Student element : studentList) {
            System.out.println(element);
        }

        System.out.println(myBook);

        Person thirdPerson = new Person();

        System.out.println(thirdPerson);

    }

}
