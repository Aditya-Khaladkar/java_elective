package lab2.exceptions;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            int res = arr[size + 1] / 2;
            System.out.println(res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
