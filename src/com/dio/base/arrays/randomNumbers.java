package com.dio.base.arrays;

import java.util.Random;

/* Faça um programa que leia 20 números aleatórios (entre 0 e 100)
e armazene-os em um vetor.
Ao final mostre os números e seus sucessores.
 * 
 */

public class randomNumbers {

    public static void main(String[] args) {

        Random random = new Random();//Class to generate random numbers
        
        int[] randomNumbers = new int[20]; //creates a new array with 20 positions

        for(int i = 0; i < randomNumbers.length; i++) {
            int number = random.nextInt(100);
            randomNumbers[i] = number;
        }
            System.out.print("Random numbers:  ");
            for (int n : randomNumbers) {
                System.out.print(n + " ");
                
            }
            System.out.print("\nRandom numbers Successors:  ");
            for (int n : randomNumbers) {
                System.out.print((n + 1) + " ");
                
            }

        
    }
    
}
