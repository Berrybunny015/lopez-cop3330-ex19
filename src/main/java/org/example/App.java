/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sabrina Lopez
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //variable declarations
        double maxNormalWeight = 25; //the maximum value for the user to be normal weight
        double minNormalWeight = 18.5; //the minimum value for the user to be normal weight

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

        if ((BMI >= minNormalWeight) && (BMI <= maxNormalWeight)) { //if the BMI shows that the user is a normal weight
            System.out.println("\nYour BMI is " + String.format("%.1f",BMI) + ".\nYou are within the ideal weight range.");
        }
        else if (BMI < minNormalWeight) { //if the BMI shows that the user is underweight
            System.out.println("\nYour BMI is " + String.format("%.1f",BMI) + ".\nYou are underweight. You should go see your doctor.");
        }
        else { //if the BMI shows that the user is overweight
            System.out.println("\nYour BMI is " + String.format("%.1f",BMI) + ".\nYou are overweight. You should go see your doctor.");
        }
    }
}