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
