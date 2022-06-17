package com.dio.base.flow;
/* Working with different types of Flow Control 
 * if..else
 */

public class IfElse{


    public static void main(String[] args) {
        StudentMedia();       
    }

    public static void StudentMedia(){
        float test1 = 42.5f;
        float test2 = 25.5f;
        float test3 = 60.5f;
        float finaltest =89.3f;
        float media = ((test1 + test2 + test3)/3);
        float mediafinal = ((finaltest + media)/2);

        if(media > 60.0){
            System.out.println("Student approved with media: " + media);
            } else if (mediafinal > 60.0){

            System.out.println("Student approved in final exam with media "  + mediafinal);
         } else { System.out.println("Not aprroved, final media: " + mediafinal);
        }  
     }
        


}
