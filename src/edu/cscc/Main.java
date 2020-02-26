package edu.cscc;

import java.util.Scanner;
// Yogesh Acharya, 01/22/2020, In Class Lab 2: Determining numbers of digits in a Number
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        String result = "";
        System.out.print("Please enter a whole number between 1 and 5 digits: ");
        number = input.nextInt();
        if (number < 10 && number > 0) {
            result = "one";
        }
        else if (number <100 && number >9) {
            result = "two";
        }
        else if (number <1000 && number >99) {
            result = "three";
        }
        else if (number <10000 && number >999) {
            result = "four";
        }
        else if (number <100000 && number >9999) {
            result = "five";
        }
        if (number >0 && number <99999) {
            System.out.println("It's a " + result + " digit number.");
        }
        else {
            System.out.println("The number is not between 1 and 99999. ");



        }
    }
}
