package org.example;
import java.util.Scanner;
public class Get2Inputs {
    public static void main () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = sc.nextInt();
        System.out.println("Enter the Last Number");
        int b = sc.nextInt();
        System.out.println("Sum = " + (a + b));
        System.out.println("Difference = " + (a - b));
        System.out.println("Product = " + (a * b));
        System.out.println("Division = " + (a / b));
    }
}
