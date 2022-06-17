package com.dio.base.loops;
/*Faça um program que calcule o fatorial de um número inteiro
 * Ex: 5! = 120 ( 5 x 4 x 3 x 2 x 1)
 */

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check its factorial: ");
        int number = scan.nextInt();
        int factorial = 1;

        for (int i = number; i > 0 ; i--) { // i =5 ; i =4; i =3 ... i =1
            factorial = (i * factorial); // factorial = 5 * 1 = 5;  * 4 = 20; * 3 = 60
            
        
        } System.out.println("The factorial of " + number + " is " + factorial);

    }

}

