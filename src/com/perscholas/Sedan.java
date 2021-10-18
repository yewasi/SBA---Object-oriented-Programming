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
            if (length > 20) {
                final double v1 = super.getSalePrice() * 0.05;
            }
            else {
                final double v = 0.1 * super.getSalePrice();
            }
        }
    }

