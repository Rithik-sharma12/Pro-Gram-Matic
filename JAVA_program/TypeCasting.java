/* Java Type Casting
Type casting is when you assign a value of one primitive data type to another type.
In Java, there are two types of casting:
Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double
Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte  */

import java.util.*;
 
class TypeCasting{
    public static void main(String[] args) {
        //widening casting
        int myInt = 7;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);
        
        //narrow casting
        double myDouble1 = 3.14D;
        int myInt1 = (int) myDouble1;
        System.out.println(myDouble1);
        System.out.println(myInt1);
        
        // real life example
        int max=600;
        int myscore=507;
        float per = (float) myscore/max*100.0F;
        System.out.println("my percentage is "+per);
    }
}
