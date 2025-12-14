import java.util.*;
public class rev_stack{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            stack.push(str.charAt(i));
        }
        String rev_str="";
        while(!stack.isEmpty()) 
        {
            rev_str+=stack.pop();
        }
        System.out.println("Reversed string: " + rev_str);
        Stack<Character> a = new Stack<>();
        String ch = sc.nextLine();
        for(int i =0; i<a.length();i++)
        {
            stack.push(ch.charAt(i));
        }

    }
}