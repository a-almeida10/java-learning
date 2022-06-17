package com.dio.base.arrays;
/*
 *Crie um programa que leia um vetor de 6 carcteres e diga quantas consoantes 
 existem nesse vetor. Imprima as consoantes encontradas.
 */

import java.util.Scanner;

public class consonants {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

       String[] consonantArray = new String[6];
       int quantityConsonants = 0;
        int count = 0;
                do {
                    System.out.println("Type a letter: ");
                    String letter = scan.next();

                            if(!(letter.equalsIgnoreCase("a")||
                            letter.equalsIgnoreCase("e") ||
                            letter.equalsIgnoreCase("i")||
                            letter.equalsIgnoreCase("o")||
                            letter.equalsIgnoreCase("u"))) 
                            {
                                consonantArray[count] = letter;
                                quantityConsonants++;
                            }
                            count++;

                } while(count < consonantArray.length);

       System.out.println( "You typed " + quantityConsonants  + " consonants.  They were: "); 
             for (String consonString : consonantArray) { 
                         if (consonString != null) { //This condition stops the system from printing null for the vowels.
                                 System.out.println(consonString ); // prints the consonants
            
                                                   } 
        
                                                         }
      

        
    } 

    
}
