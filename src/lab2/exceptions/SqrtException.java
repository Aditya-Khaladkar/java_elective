package lab2.exceptions;

import java.util.Scanner;

public class SqrtException {
    void userDefineException(int num) throws ArithmeticException {
        if (num < 0) {
            throw new ArithmeticException(
                    "ArithmeticException: Cannot find Square root of Negative Number"
            );
        } else {
            System.out.println(Math.sqrt(num));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        new SqrtException().userDefineException(num);
    }
}
