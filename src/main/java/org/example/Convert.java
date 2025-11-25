package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Convert {
   public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input");
        int sec = sc.nextInt();
        int hours = sec / 3600;
        int minutes = hours / 60;
        int second= minutes / 60;
        System.out.print( hours + ":" + minutes + ":" + second );
    }
}
