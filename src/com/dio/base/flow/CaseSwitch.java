package com.dio.base.flow;
/* Working with different types of Flow Control 
 * if..else
 */

public class CaseSwitch{


    public static void main(String[] args) { 
        WeekDay("sunday"); 
        WeekDay("Sunday");
        WeekDay("tuesday"); 
        WeekDay("  ");      
    }

     public static void WeekDay(String a){
            
        switch (a) {
                case "sunday":
                case "saturday":
                 System.out.println("Enjoy your weekend!"); 
                    break;
                case "monday":
                case "tuesday":
                case "wednesday":
                case "thursday":
                System.out.println("Today is a working day.");
                    break; 
                    
            
                default:
                System.out.println("Unknown day");
                    break;
            }
     }
        


}
