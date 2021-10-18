package com.perscholas;



    public class Sedan extends Car {
        private int length;

        public Sedan (int Speed,double regularPrice,String color, int length) {
            super (Speed,regularPrice,color);
            this.length = length;
        }

        public Sedan(String color, Class<Integer> integerClass) {
            super(color, integerClass);
        }

        public double getSalePrice() {
            return super.getSalePrice() ;
        }
    }

