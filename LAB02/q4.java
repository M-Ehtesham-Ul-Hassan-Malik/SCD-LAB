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

                q4 obj = new q4();
                obj.checkBalance(300,250);

            }catch (customException e) {
                System.err.println(e);
            }
    }
    }


