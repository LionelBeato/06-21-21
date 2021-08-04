package com.tts.example;

import com.tts.vehicle.Car;

public class Example {

    public static int x = 1;

    public static int convertGrossWeightToKgs(Car c) {
        double kgs = c.grossWeightInLbs/2.2;
        return (int) kgs;
    }


}
