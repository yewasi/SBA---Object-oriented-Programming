package com.perscholas;

public class Main {

    public static void main(String[] args) {

            {

                Sedan obj1 = new Sedan(300, 850000.0, "Black", 15);


                Ford obj2 = new Ford(350, 2050000.0, "Red", 2020, 50000);
                Ford obj3 = new Ford(360, 2550000.0, "White", 2021, 250000);


                System.out.println(obj1.getSalePrice());
                System.out.println(obj2.getSalePrice());
                System.out.println(obj3.getSalePrice());
            }
        }
    }



