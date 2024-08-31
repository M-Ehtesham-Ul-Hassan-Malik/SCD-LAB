//Lab Task 3: Handling Multiple Exceptions
//Objective: Write a Java program that handles multiple exceptions (e.g.,
//xxxException and xxxxException).
//Instructions: Create a program that includes a division operation and an
//array. Use try-catch blocks to catch bothxxxException and xxxException.
//Display different messages for each exception.


public class Q3 {

    public static void main(String[] args) {


        System.out.println("22K-4824");

        try {
            int div = 30/0;
            System.out.println(div);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }


            try {
                int num[] = new int[2];
                num[3] = 1;

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException");
            }



    }
}
