import java.util.*;

class Person{
    int age = 3;
    void checkVote(){
        if(age >= 18){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("Not Eligible for voting");
        }
    }
}

public class Vote {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.checkVote();
    }
}
