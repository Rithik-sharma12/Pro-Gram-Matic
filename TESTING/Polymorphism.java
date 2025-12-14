class A{
    // method overriding
    void fly(int n){
        System.out.println("Bird is flying");
    }
    int fly(int n){
        System.out.println("Animal is flying");
        return 0;
    }
    // the function will get confused so this is not allowed
    double fly(int n, int n){
        System.out.println("In double");
        return 0.0;
    }

    double fly(double n, double n){
        System.out.println("In double");
        return 0.0;
    }

}


public class Polymorphism {
    public static void main(String[] args) {
        A a1 = new A();
        a1.fly(5);
    }
}
