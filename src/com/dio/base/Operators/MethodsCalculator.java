//1- Calcule as 4 operações básicas. Sempre 2 valores devem ser passados

package com.dio.base.Operators;

public class MethodsCalculator {

    static int sum(int x, int y){
        return x + y;

    }
    static int minus(int x, int y){
        return x - y;

    }
    static int times(int x, int y){
        return x * y;

    }
    static float division(int x, int y){
        return x/y;

    }
    public static void main(String[] args) {
        System.out.println(sum(5, 3));
        System.out.println(minus(5, 3));
        System.out.println(times(5, 3));
        System.out.println(division(5, 3));
    }
}