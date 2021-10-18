package com.perscholas;

public class Truck extends Car {

    // child class Truck inherits Car class

    private final int weight;

    private final int length;

    {
        // instance variable
        int weight;
        int speed = 0;
        double regularPrice = 0;
        String color = "";
        // child class constructor that invokes parent class constructor
        getClass();
        final Sedan sedan = new Sedan(color,
                int.class);


        this.speed = 0;
        this.regularPrice = 0;
        this.color = "";

        int length = 0;
        super(speed, regularPrice, color);
        this.length = length;
        {

            super(speed = 0);
            new String(color);


            this.weight = weight;
        }

        double getSalePrice;
        {
            if (weight > 2000) {
                final double v = regularPrice - regularPrice * 0.1;
                return v;
            } else {
                return regularPrice - regularPrice * 0.2;
            }
        }
    }

    private void supper() {

    }

    Truck(int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
    }
}




