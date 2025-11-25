package org.example;
import java.util.Random;
import java.util.Scanner;
public class RandomGame {
    public static void main (String[] args)
    {
        Random ran = new Random();
        int num = ran.nextInt(500) + 1;
        Scanner sc = new Scanner(System.in);
        int guess;
        int chance =0;
        do {
            System.out.println("Enter the number between 1 to 500");
            guess = sc.nextInt();
            chance ++;

            if (num > guess) {
                System.out.println("Your Number is Small");
            }
            else if (num < guess) {
                System.out.println("Your number is Big");
                
            }
            else {
                System.out.println("Your number is correct");
            }
        }while (guess != num);
    }
}

