import java.util.*;

 //The Java Math class has many methods that allows you to perform mathematical tasks on numbers
 
class ConditionalStatement{
    public static void main(String[] args) {
        //if statement 
        /* SYNTAX
        if (condition) {
        block of code to be executed if the condition is true
        }
        */
         if(20>18){
             System.out.println("20 is greater than 18");
         }
        
        // if else
        /*if (condition) {
        block of code to be executed if the condition is true
        }       
        else {
        block of code to be executed if the condition is false
        }
        */
        if(20<18){
            System.out.println("200 is less than 188");
        }
        else{
            System.out.println("200 is greater than 188");
        }
        /*if (condition1) {
        // block of code to be executed if condition1 is true
        } else if (condition2) {
        // block of code to be executed if the condition1 is false and condition2 is true
        } else {
        // block of code to be executed if the condition1 is false and condition2 is false
        */
        int time=10;
        if(time>12){
            System.out.println("good afternoon");
        }
        else if(time>6){
            System.out.println("good morning");
        }
        else{
            System.out.println("good evening");
        }
        //short hand if else 
        // syntax {variable = (condition) ? expressionTrue :  expressionFalse;)}
        int myAge=20;
        String res = (myAge >= 18) ? "Major.":"Minor";
        System.out.println(res);
    }
}
