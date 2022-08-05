package lab2.exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Example3 {
    void testMethod(int num) throws IOException, ArithmeticException {
        if (num == 1) {
            throw new IOException("IOException !");
        } else {
            throw new ArithmeticException("ArithmeticException !");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        try {
            new Example3().testMethod(num);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
