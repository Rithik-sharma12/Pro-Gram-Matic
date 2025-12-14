import java.util.Scanner;

public class Divi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a , b;
        // for(;;){
            
        //     System.out.print("Enter the number A :");
        //     a = sc.nextInt();
        //     if(a == 0){
        //         break;
        //     }
        //     System.out.print("Enter the number B :");
        //     b = sc.nextInt();
        //     try{
        //         System.out.println(a/b);
        //     }
        //     catch(Exception e){
        //         System.out.println("Error for dividing by Zero");
        //     }
        //     System.out.println("The Exception handling for the Arthimetic is completed");
        // }

        String s = null;
        System.out.println(s.length());  // NullPointerException
        sc.close();
    }
}
/*
String s = null;
System.out.println(s.lenght); --> NullPointerException 

try {
}
catch(Exception e){ } --> Should placed at the end only

finally{} --> Always Execute


Multiple catch blocks are allowed

*/


