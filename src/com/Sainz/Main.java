package com.Sainz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        //boolean done = true; (have to change this to boolean done = false; to go into the loop
        boolean done = false;
        String result = "";
        // Our Integer class (below)
        Integer x = 0;
        ArrayList<Integer> numbers = new ArrayList<>();

        //Below - Integer - holds an array list of integers

        while (done != true) {
            x++;
            //have to define x
            numbers.add(x);

            System.out.println("Do you want to go again? (Y/N)");
            result = keyboard.nextLine();
            if (result.equalsIgnoreCase("Y")) {
                //stay in the loop
                done = false;
            } else {
                //leave the loop
                done = true;
            }
        }
        System.out.println("The loop is over. Print the ArrayList");
        //below - shortcut to printing array lists
        System.out.println(numbers);

        // A more elegant way to loop through and print an ArrayList
        // Get to for loop, it prints everything in a row: 1, 2, 3, 4, 5, 6, 7
        for (Integer z : numbers) {
            System.out.println(z);
        }
        System.out.println(); //print a blank line

        //The same thing as above with println
        for (Integer z : numbers) {
            System.out.println(z);
        }
    }
}
