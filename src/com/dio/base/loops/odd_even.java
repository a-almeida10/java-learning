
package com.dio.base.loops;
import java.util.Scanner;
/*Faça um programa que receba N números inteiros e retorne 
a quantidade de números pores e de números ímpares.
 */




public class odd_even {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the total quantitiy of numbers: ");
        n = scan.nextInt(); //The variable "n" receives the quantity of numbers the user types
        int counter = 0;
        int even = 0;
        int odd = 0;

        while (counter < n) { //the loop is executed n times
            System.out.println("Enter a number: ");
            int number = scan.nextInt();
            number = ((number % 2)== 0) ? even++ : odd++; // if (number % 2) == 0; then, 1 is added to the variable "even"; else, 1 is added to the variable "odd"
           
            counter++;  
        }  
        System.out.println("The total of even numbers is: " + even);
           System.out.println("The total of odd numbers is: " + odd);
    

      








    }
}
