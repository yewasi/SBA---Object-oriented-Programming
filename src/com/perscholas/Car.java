package com.perscholas;

    public class Car {

        int speed;
        double regularPrice;
        String color;

        Car(int speed, double regularPrice, String color) {
            this.speed = speed;
            this.regularPrice = regularPrice;
            this.color = color;
        }

        public Car(int speed) {

        }

        public Car(String color, Class<Integer> integerClass) {

        }

        public double getSalePrice() {
            return regularPrice;
        }
    }
