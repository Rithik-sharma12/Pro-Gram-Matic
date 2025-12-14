import java.util.Stack;

class ValidParan{
    static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if((c == ')' && top != '(') ||
                   (c == '}' && top != '{') ||
                   (c == ']' && top != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

public class StackRev{
    public static void main(String[] args) {
        String s = "{[()}";
        if(ValidParan.isValid(s)){
            System.out.println(s + " is valid.");
        } else {
            System.out.println(s + " is not valid.");
        }
        
    }
}