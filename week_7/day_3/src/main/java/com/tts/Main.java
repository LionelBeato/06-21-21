package com.tts;

//import java.lang.Integer;
//import java.util.*;
import com.tts.example.Example;
import com.tts.vehicle.Car;
import static com.tts.vehicle.Car.TYPE_FAMILY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public Integer myInt = 26;

    public static void main(String[] args) {

        Main myMain = new Main();
        System.out.println(myMain.myInt);

       System.out.println(Example.x);
       System.out.println(com.tts.other.Example.x);

        Arrays.stream(args)
                .forEach(string -> System.out.println(string));


        /*
         we can use classes from other classes
         by referring to it by its full path,
         instead of importing it at the top of the file
         */
        java.lang.Integer myInt = new Integer(2);

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        arrayList.add("Hello");
        arrayList.add("World");

        System.out.println("This is the size of my arraylist: " + arrayList.size());
        System.out.println(arrayList);

        Car car = new Car("blue", 4);
//        car.color = "blue";
//        car.numberOfDoors = 4;

//        car.setColor("blue");
        System.out.println(car.getColor());
        System.out.println(car.getNumberOfDoors());


        car.start();
        car.drive();
        car.drive("Boston");
//        System.out.println(car.MAX_DOORS);
//        System.out.println(Car.MAX_DOORS);

//        car.setCarType(Car.TYPE_FAMILY);
        car.setCarType(TYPE_FAMILY);



        ArrayList<Integer> integers = null;
        System.out.println(integers);

        boolean result = Car.areDoorsEqual(car, new Car("red", 2));

        System.out.println("Result of the method areDoorsEqual(): " + result);

        car.grossWeightInLbs = 2000;

        System.out.println("Here is my car's weight in kilos: " + Example.convertGrossWeightToKgs(car));







    }

}
