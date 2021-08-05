package com.tts;

/*
think of a class as a template
for your objects

they are composed of the following:
 - instance variables / fields (properties, nouns)
 - constructors
 - methods (actions, verbs)

 */
public class Person {

    private String name;
    private Integer age;
    private String location;
    private Person person;


/*
     here is my person constructor
     it is accepting arguments that represent my fields
     this constructor is our all-arg constructor
     */

    public Person(String name, Integer age, String location) {
        /*
            you can refer to the action below
            as data-binding
            we are setting up our instance variables
            to be exactly the same as the values passed in
            as arguments into our constructor
         */
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public Person(String name, Integer age, String location, Person person) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.person = person;
    }

    public Person(String name) {
        this.name = name;
    }

    /*
        below is a no-arg or default constructor
        these will be utilized heavily when we start
        working with something known as java beans
     */
    public Person() {

    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /*
     @Override is an annotation
     basically something that represents metadata associated
     with what it's annotating
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                "location='" + location + '\'' +
                "person='" + person + '\'' +
                ", age=" + age +
                '}';
    }


}
