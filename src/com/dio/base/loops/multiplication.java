package com.dio.base.loops;
import java.util.Scanner;
/*Desenvolva um gerador de tabuada capaz de gerar a tabuada de qqualquer inteiro entre 1 e 10
O usuário deve informar o número e receber um resultado como:
    Tabuada do 5

    5 x 1 = 5 
    5 x 2 = 10
     ...
 * 
 */

public class multiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter a number from 1 to 10");
        number = scan.nextInt();

         System.out.println("Tabuda do " + number); //prints the title
        for (int i = 1; i <= 10; i++) { //repeats the code 10 times
            System.out.println(number + " x " + i + " = " + (number *i)); //calculates and prints the multiplication table
        }

    }
    
}
