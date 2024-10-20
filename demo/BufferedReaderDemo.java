import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
public class BufferedReaderDemo {
    public static void main(String args[]) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String value1;
        System.out.print("Value 1: ");
        value1 = dataIn.readLine();
        int val1 = Integer.parseInt(value1);
        System.out.println("Result: "+(5+val1));
    }
}