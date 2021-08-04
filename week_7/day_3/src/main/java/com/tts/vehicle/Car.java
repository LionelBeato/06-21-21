package com.tts.vehicle;

public class Car {


    // fields:
    // color
    // amount of doors
    private static final int MAX_DOORS = 6;
    private static final int MIN_DOORS = 1;

    public static final String TYPE_SPORTY = "Sporty";
    public static final String TYPE_FAMILY = "Family";

    private String carType;
    private String color;
    private int numberOfDoors;
    public int grossWeightInLbs;

    private int currentRPM;
    private int speed;

    // methods:
    // it can start
    // it can drive
    // it can stop

    public void start() {
        System.out.println("Car is starting...");
    }

    public void drive() {
        System.out.println("Car is driving...");
    }

    public void drive(int miles) {
        System.out.println("Driving for " + miles + " miles");
    }

    public void drive(String destination) {
        System.out.println("Driving to my destination: " + destination);
    }

    public void stop() {
        System.out.println("Car is stopping...");
    }

    public Car(String color, int numberOfDoors) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }

    public Car() {

    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        if ( numberOfDoors >= MIN_DOORS && numberOfDoors <= MAX_DOORS ) {
            this.numberOfDoors = numberOfDoors;
        } else {
            this.numberOfDoors = -1;
        }
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getCurrentRPM() {
        return currentRPM;
    }

    private void setCurrentRPM(int rpm) {
        currentRPM = rpm;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        setCurrentRPM(calculateRPM(speed));
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    private int calculateRPM(int speed) {
//        int rpm = speed * getBestGear(speed) * engineFactor();
        int rpm = speed * 3;
        return rpm;
    }

    public static boolean areDoorsEqual(Car carOne, Car carTwo) {
        return carOne.getNumberOfDoors() == carTwo.getNumberOfDoors();
    }





}
