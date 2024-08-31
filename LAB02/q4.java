//Lab Task 4: Custom Exception
//Objective: Create and use a custom exception class to handle
//insufficient balance in a bank account.
//Steps:
//Define a custom exception class: Create a class called
//InsufficientBalanceException that extends Exception.
//Write a method to check balance: Write a method that checks if a bank
//account balance is sufficient to make a withdrawal. Let&#39;s say the balance
//should not go below $100 after a withdrawal.
//Throw InsufficientBalanceException: If the withdrawal would cause the
//balance to drop below $100, throw InsufficientBalanceException.
//Use try-catch block: In the main program, call the withdrawal method
//inside a try-catch block. Handle the InsufficientBalanceException and
//print an appropriate message to the user.


import java.util.Scanner;

class customException extends Exception{
    customException (String str){
        super(str);
    }
}

public class q4 {
    public void checkBalance(int balance, int amount) throws customException {
        Scanner scanner = new Scanner(System.in);
        int remainingBalance = balance - amount;
        if (remainingBalance < 100) {
            throw new customException("Insufficent balance");
        }


    }
    public static void main(String[] args) {
            try {
                System.out.println("22K-4824");
                q4 obj = new q4();
                obj.checkBalance(300,250);

            }catch (customException e) {
                System.err.println(e);
            }
    }
    }


