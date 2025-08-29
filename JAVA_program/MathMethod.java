import java.util.*;

 //The Java Math class has many methods that allows you to perform mathematical tasks on numbers
 
class MathMethod{
    public static void main(String[] args) {
        //java maths class 
        //math max
        System.out.println(Math.max(10,100));
        
        //math min
        System.out.println(Math.min(9,99));
        
        //math square root
        System.out.println(Math.sqrt(36));
        
        //math absolute value negative to positive
        System.out.println(Math.abs(-4.7));
        
        //math random used to generate random number
        int randomNum = (int)(Math.random()*101);
        System.out.println(randomNum);
    }
}
