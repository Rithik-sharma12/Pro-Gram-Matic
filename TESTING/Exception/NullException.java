package Exception;

public class NullException {

    static void checkAge(int age){
        if(age < 18){
            throw new NullPointerException("Age is not valid to vote");
        }
        else{
            System.out.println("Welcome to vote");
        }
    }
    public static void main(String[] args) {
        String s = null;
        System.out.println(s.length());  // NullPointerException

    }
}
