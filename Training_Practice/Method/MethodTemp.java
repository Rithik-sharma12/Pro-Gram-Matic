package Method;

class MethodTemp{
    
    public static void A(){
        int a = 1;
        System.out.println("This is Method A");
    }

    public static void B(){
        float b = 3.14f;
        System.out.println("Method in B");
    }

    public static void C(){
        double c = 3.46788;
        System.out.println("Method in C");
    }

    public static void main(String[] args){
        System.out.println(".....Methods.....");
        // CallStackExample
        A();
        B();
        C();
    }
}
