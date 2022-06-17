package com.dio.base.loops;
/*
 * Faça um programa que peça uma nota de 0 a 10. Mostre uma mensagem de erro
 * caso a nota inserida seja inválida e continue pedindo até que receba uma nota válida
 */
import java.util.Scanner;

public class rating {        
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade;
        while (true) {
            System.out.println("Give your rate from 0 to 10:");
            grade = scan.nextInt(); 
            if (grade >= 0 && grade <=10) {
                System.out.println("Thanks for rating!");
                break;
            } else {
                System.out.println("Invalid rate. Try again.");
            }
        }
        



    }
    
}
