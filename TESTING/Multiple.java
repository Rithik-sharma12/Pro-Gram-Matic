interface A {
    default void fly() {
        System.out.println("Bird is flying");
    }
}

interface C {
    default void eat() {
        System.out.println("Bird is eating");
    }
}

class B implements A, C {
    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }
}

public class Multiple {
    public static void main(String[] args) {
        // A a1 = new A(); // Cannot instantiate an interface
        B b1 = new B();
        
        // Calling method from interface A (overridden in B)
        b1.fly();
        
        // Calling method from interface C (default implementation)
        b1.eat();
    }
}
