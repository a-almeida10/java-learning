package com.dio.base.Operators;
/* Examples using operators*/

public class Operators {
    public static void main(String[] args) {

        System.out.println("Prepost");
        prePost();
        System.out.println("Aritimetic");
        aritmetic();
        System.out.println("Assign");
        assign();
        System.out.println("Preceed");
        preceed();
    
    }
    
    private static void prePost(){
        int k = 10;
        int i = ++k;
        int j = k--;
        int x = k;

        System.out.println("i:"+ i);
        System.out.println("j:"+ j);
        System.out.println("x:"+ x);


    }
    private static void aritmetic(){

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;


        int r1 = a+b;
        int r2 = c-a;
        int r3 = d*b;
        int r4 = e/a;
        int r5 = c%b;

        System.out.println("a+b = "+ r1);
        System.out.println("c-a = "+ r2);
        System.out.println("dxb = "+ r3);
        System.out.println("e/a = "+ r4);
        System.out.println("c%b = "+ r5);



    }
    private static void assign(){
        int i = 1500;
        short j = 15;
        long  l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        i += 5; // i = i + 5
        j -= 3; // j = j - 3
        d /= 2.7d; // d = d /2.7d
        l *= 3; // l = l * 3
        k %= 2; // k = k % 2

        System.out.println("i:"+ i);
        System.out.println("j:"+ j);
        System.out.println("d:"+ d);
        System.out.println("l:"+ l);
        System.out.println("k:"+ k);


    }
    private static void preceed(){

        int  i = 10;
        int  j = 20;
        int  k = 30;

        int a = i++ + --j * k; // i++ --->Pós-fixado, ele só vai somar no final da opera
        /* 10  + 19 * 30 --> 580  depois que executar toda essa expressão o i recebe +1 */
        System.out.println("i++  + j-- * k ="  + a);
        System.out.println("i++ =" + i); // i = 11

        int b = k / --i % 3 + 1; // i = 11 -1
        /* b = 30 / 10 % 3 + 1  ---> 3 % 4 ---> 1 */
        System.out.println("k / --i % 3 + 1 = " + b);
        System.out.println("i++ =" + i); // i = 10

        int c = 2;

        c *= i += 5; // c = 2 * (i + 5) ---> 2 * (15) ---> c = 30

        System.out.println("i = " + i);
        System.out.println("c *= i += 5= " + c);

        

    }
}
