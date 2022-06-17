package com.dio.base.arrays;
import java.util.Random;
import java.util.random.*;


/*Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9 */


public class multidimensionalArrays {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] M = new int[4][4];

            for(int i =0; i < M.length; i++){ //ACCESSES THE FIRST LINE 
                for (int j = 0; j < M[i].length; j++) { //ACCESSES THE FIRST COLUMN IN THE FIRST LINE
                    M[i][j] = random.nextInt(9); //generates a random number up to 9 inside the position [i][j]
                        }


            } 
              System.out.println("Matrix : ");
                for( int[] line : M ) { //for each line inside M
                    for( int columnElement : line ){ // for each element of the column inside each line
                        System.out.print(columnElement + " "); //print the element
                    }
                      System.out.println();//skip a line between each line
            }
    }
    
}
