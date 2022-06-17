package com.dio.base.loops;

import java.util.Scanner;

/*Faça um programa que leia 5 números e
informe o maior número
 e a média entre eles */
public class greater {  
    public static void main(String[] args) {
       
        int total = 0;
        int greater = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <=5 ; i++) { //Repeats the loop 5 times
            System.out.println("Enter a number: ");
            int numi = scan.nextInt(); //Receives a number from the keyboard and assigns it to a variable
            total += numi; //adds the input to the total
            if (numi > greater)   greater = numi;
              //compares and assigns the greater value to the variable "greater"
    
        } 

            System.out.println(" The total is: " + total );
            System.out.println(" The greater is: " + greater );
            System.out.println(" The average is: " + (total/5) );
           

    }
    
}
