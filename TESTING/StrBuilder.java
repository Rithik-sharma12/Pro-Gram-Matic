import java.util.*;

public class StrBuilder {
    public static void main(String[] args) {
        System.out.println("Enter the String :");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);

        sb.reverse();
        if(s.toLowerCase().equals(sb.toString().toLowerCase())){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not a PAlindrom");
        }

        sc.close();

    }
}
