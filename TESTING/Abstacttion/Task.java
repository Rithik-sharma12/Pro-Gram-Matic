/*

interface of Animal , bird 
bird = fly() -> sparrow
dog = walk() -> dog
*/

interface Animal{
    void walk();
}

abstract class Bird implements Animal{
    abstract void fly();
}

class Sparrow extends Bird{
    public void fly(){
        System.out.println("Sparrow is flying");
    }
    public void walk(){
        System.out.println("Sparrow is walking");
    }
}

class Dog implements Animal{
    public void walk(){
        System.out.println("Dog is walking");
    }
}

public class Task {
    public static void main(String[] args){
        Bird b = new Sparrow(); // Upcasting
        b.fly();

        Animal a = new Dog(); // Upcasting
        a.walk();
    }   
}
