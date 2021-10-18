package com.perscholas;

public class Main {

    public static void main(String[] args) {

            {
            // driver method

                // create an object of Sedan class with
                // speed = 300, regular price = 850000.0, color = "Black" and length = 15
                Sedan obj1 = new Sedan(300, 850000.0, "Black", 15);

                // Similarly, create two objects of Ford class
                Ford obj2 = new Ford(350, 2050000.0, "Red", 2020, 50000);
                Ford obj3 = new Ford(360, 2550000.0, "White", 2021, 250000);

                // now, call getSalePrice() methods of Sedan and Ford class
                // using respective objects to print updated prices of objects
                System.out.println(obj1.getSalePrice());
                System.out.println(obj2.getSalePrice());
                System.out.println(obj3.getSalePrice());
            }
        }
    }



