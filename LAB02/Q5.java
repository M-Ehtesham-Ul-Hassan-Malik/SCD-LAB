import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q5 {
    public static void main(String[] args) {

        System.out.println("22K-4824");

        FileReader fileReader = null;

        try {
            fileReader = new FileReader("text.txt"); // Ensure the file name and path are correct
            int ch;
            while ((ch = fileReader.read()) != -1) {
                System.out.print((char) ch); // Read and print the file contents
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading the file");
        } finally {
            // Close the fileReader if it's not null
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println("Error closing the file");
                }
            }
        }
    }
}
