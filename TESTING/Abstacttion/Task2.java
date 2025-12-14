interface Animal{
    void walk();
}

interface Bird{
    void fly();
}

class Sparrow implements Animal, Bird{
    public void walk(){
        System.out.println("walking");
    }
    public void fly(){
        System.out.println("Flying");
    }
}

public class Task2 {
    public static void main(String[] args){
        Animal a1 = new Sparrow();
        a1.walk();
        a1.fly();  // Animal don't know about the Bird class ERRP

        Sparrow s1 = new Sparrow();

        s1.walk();
        s1.fly();
    }
}
