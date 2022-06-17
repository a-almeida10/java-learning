package com.dio.base.arrays;

import java.lang.reflect.Array;

/* Crie um vetor de 6 números inteiroes e mostre-os na ordem inversa.
 */
public class order {
    
    public static void main(String[] args) {
        
        int[] myNumbers = {1 , 0 , 8 , 6 , 123, -3};

        for ( int i = (myNumbers.length - 1) ;  i >= 0 ; i--) {
            System.out.println(myNumbers[i]);
        }
    }
}
