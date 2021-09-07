/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        String length = input.nextLine(); //Reads the length input in ft.
        System.out.print("What is the width of the room in feet? ");
        String width = input.nextLine(); //Reads the width input in ft.

        int i = Integer.parseInt(length); //Converting string into int.
        int j = Integer.parseInt(width);
        int k = i*j; //Calculating f2 area.
        double c = 0.09290304; //Conversion from f2 to m2 constant.
        double z = k*c; //Converting from f2 to m2.

        System.out.printf("You entered dimensions of %s feet by %s feet.%n", i, j);
        System.out.printf("The area is" + "\r\n" + k + " square feet" + "\r\n" + z + " square meters");
    }
    }