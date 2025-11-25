package org.example;
import java.util.Scanner;
public class InputAndPrint
{

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name:");
            String username = sc.nextLine();
            System.out.println("Hello " + username);
        }
    }


