//Lab Task 1: Basic Exception Handling
//Objective: Create a Java program that reads an integer from the user
//and handles the xxxxException if the user enters a non-integer value.
//Instructions: Write a program that prompts the user to enter an integer.
//Use a try-catch block to catch an xxxxException and display a message
//indicating that the input is invalid.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        System.out.println("22K-4824");

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter an integer value:");
            int value = scanner.nextInt();
            System.out.println(value);
        }catch (InputMismatchException e){
            System.out.println("Invalid input");
        }

    }

}
