import java.util.*;

class StringTypes {
    public static void main(String[] args) {
        
        //string concat
        String name ="Rithik";
        System.out.println("hi"+"Everyone");
        System.out.println("My name is "+name);
        
        // string concat in variable 
        String first = "Rithik";
        String last = "Hacker";
        String fullName = first+last;
        System.out.println(fullName);
        
        
        //string input
        String nam;
        System.out.print("Enter your name :");
        Scanner sc = new Scanner(System.in);
        nam = sc.nextLine();
        System.out.println("Your name is "+ nam);

        
        // upper to lower vice-verse
        String txt ="UPPER to lower";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        
        // Finding a Character in a String (Index of string)
        System.out.println(txt.indexOf("to"));
        
        //  (string length)
        System.out.println(txt.length());
        
        //strings and number 
        String x ="10";
        int y = 20;
        System.out.println(x+y); // ans 1024
        
        //Special characters in print statement
        System.out.println("We are the proud \" Indian\"");
        System.out.println("I\'m\' finding a job ");
        System.out.println("This is a backslash \\");
        System.out.println("\n this line is printed in new line");// \n - new line
        // \r - Carriage Return 
        String ne = "First\rSecond";
        System.out.println(ne);
        
        // \t - tab
        System.out.println("this is tab \t !");
        }
}
