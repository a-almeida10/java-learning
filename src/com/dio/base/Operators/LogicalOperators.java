package com.dio.base.Operators;
/* Exploring Logical opertators 
 * && Logical AND
 * || Logical OR
 * ! Logical NOT
*/
public class LogicalOperators {

    public static void main(String[] args){

      //create variables

      int a = 10;

      int b = 3;
      
        //&& operator

        System.out.println((a > 0) && (a > b)); //Check if a is greater than 0 AND a is greater than b

         //|| operator

         System.out.println((a > 0) || (a > b)); //Check if a is greater than 0 OR a is greater than b

           //|| operator

           System.out.println(!(a>b)); //Check if a is NOT greater than b
           System.out.println(!(b>a)); //Check if b is NOT greater than a
    }
    
}
