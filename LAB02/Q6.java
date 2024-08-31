//Lab Task 6: Propagating Exceptions
//Objective: Illustrate how exceptions can be propagated in Java.
//Instructions: Create a method that throws an IOException. Call this
//method from the main method and handle the exception in the main
//method using a try-catch block. Explain how the exception is propagated
//and handled.

import java.io.IOException;

public class Q6 {

        // Method that throws IOException
        public static void method() throws IOException {
            // Simulate an I/O operation that throws an IOException
            throw new IOException("An error occurred in method.");
        }

        public static void main(String[] args) {
            System.out.println("22K-4824");
            try {
                // Call the method that throws an exception
                method();
            } catch (IOException e) {
                // Handle the IOException here
                System.out.println("Caught an IOException: " + e.getMessage());
            }
        }
    }


