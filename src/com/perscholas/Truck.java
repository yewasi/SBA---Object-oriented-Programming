package com.perscholas;

public class Truck extends Car {

    // child class Truck inherits Car class

    private final int weight;

    {
        // instance variable
        int weight;
        int speed = 0;
        double regularPrice = 0;
        String color = "";
        // child class constructor that invokes parent class constructor
        getClass();
        new Sedan(color,
                int.class);
        super();
        this.speed = 0;
        this.regularPrice = 0;
        this.color = "";

        int length = 0;
        super(speed, regularPrice, color);
        this.length = length;
        {
            // pass speed, regularPrice, and color to super
            super(speed = 0);
            toString(color);

            // initialize weight here
            this.weight = weight;
        }

        // this method returns updated price based on weight
        // if weight is greater than 2000 then provide 10% discount
        // else provide 20% discount on regular Price
        double getSalePrice;
        {
            if (weight > 2000) {
                return regularPrice - regularPrice * 0.1;
            } else {
                return regularPrice - regularPrice * 0.2;
            }
        }
    }

    Truck(int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
    }
}




