import java.util.*;

public class StringVowel {
    public static void main(String[] args) {
        String s = new String();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String here :");
        s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);
        for(int i=0 ; i < sb.length() ; i++){
            if(sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u'){
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(sb);
    }
}
