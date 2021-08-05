package com.tts.day_4;

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
    /*
        In java, classes can have instances variables
        that are of the same class

        While the use of this pattern may not be immediately apparent,
        there are indeed edge cases where one would need to have this
        functionality

        Can you think of any examples yourself?
     */
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

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    /*
        note the String name in the parans
        this is our parameter and it dictates the shape
        of our arguments
     */
    public void sayHello(String name) {
        System.out.println("Hello there, " + name);
    }

    public Integer ageNextYear() {
        /*
            var is a newer keyword in Java
            which allows us to forgo mentioning a variables type
            it is only legal within local scopes

            var is not always recommended, but it's good when you
            don't want to be concerned with the types being passed/defined
            within a local scope
         */
        var modifiedAge = age + 1;
        return modifiedAge;
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
        return this.name;
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
