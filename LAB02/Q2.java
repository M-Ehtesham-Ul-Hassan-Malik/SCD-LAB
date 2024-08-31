//Lab Task 2: ArithmeticException
//Objective: Implement nested try-catch blocks to handle exceptions
//occurring at different levels.
//Steps:
//Write a program that has a try-catch block inside another try-catch block.
//In the inner try block, handle xxxException by converting a string to a
//number.
//In the outer try block, handle xxxException by performing a division
//operation.
//Print different messages depending on which exception occurs.


import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("22K-4824");
        try {

            try{

                System.out.println("Enter a number:");
                String num = scanner.next();
                int converted = Integer.parseInt(num);

            }catch (NumberFormatException e){
                System.out.println("Input is not integer.");
            }


            System.out.println("Enter a integer to be divided by zero:");
            int num1 = scanner.nextInt();
            int infinity = num1 / 0;

        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");

        }
    }
}
