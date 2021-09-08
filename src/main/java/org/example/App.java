package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //variable declarations
        double maxNormalWeight = 25;
        double minNormalWeight = 18.5;

        System.out.println("\nWhat is your height in inches? "); //ask the user's height
        Scanner userHeightInput = new Scanner(System.in); //scan for the user's height
        while (!userHeightInput.hasNextDouble()) { //to check if the user is inputting a numeric value
            System.out.println("\nPlease input a numeric value.");
            userHeightInput = new Scanner(System.in);
        }
        double userHeight = userHeightInput.nextDouble();

        System.out.println("\nWhat is your weight in pounds? "); //ask the user's weight
        Scanner userWeightInput = new Scanner(System.in); //scan for the user's weight
        while (!userWeightInput.hasNextDouble()) { //to check if the user is inputting a numeric value
            System.out.println("\nPlease input a numeric value.");
            userWeightInput = new Scanner(System.in);
        }
        double userWeight = userWeightInput.nextDouble();

        double BMI = (userWeight / (userHeight * userHeight)) * 703; //calculate the user's BMI

        if ((BMI >= minNormalWeight) && (BMI <= maxNormalWeight)) {
            System.out.println("\nYour BMI is " + String.format("%.1f",BMI) + ".\nYou are within the ideal weight range.");
        }
        else if (BMI < minNormalWeight) {
            System.out.println("\nYour BMI is " + String.format("%.1f",BMI) + ".\nYou are underweight. You should go see your doctor.");
        }
        else {
            System.out.println("\nYour BMI is " + String.format("%.1f",BMI) + ".\nYou are overweight. You should go see your doctor.");
        }
    }
}