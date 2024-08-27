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
