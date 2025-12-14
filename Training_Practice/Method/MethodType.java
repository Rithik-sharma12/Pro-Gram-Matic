class InstanceMethod{
    void insMethod(){
        System.out.println("This is an Instance Method");
    }
}

class StaticMethod{
    static void statMethod(){
        System.out.println("This is a Static Method");
    }
}

class UserDefinedMethod{
    void userMethod(){
        System.out.println("This is a User Defined Method");
    }
}

abstract class AbstractMethod{
    abstract void absMethod();
}

class PredefinedMethod{
    void preMethod(){
        System.out.println("This is a Predefined Method");
    }
}


public class MethodType {
    public static void main(String[] args) {
        /*
        Types of methods
        1. Instance Method
        2. Static Method
        3. User Defined Method
        4. Abstract Method
        5. Predefined Method
        */
           // Instance Method
        InstanceMethod im = new InstanceMethod();
        im.insMethod();

        // Static Method
        StaticMethod.statMethod();

        // User Defined Method
        UserDefinedMethod udm = new UserDefinedMethod();
        udm.userMethod();
        
        // Abstract Method
        AbstractMethod am = new AbstractMethod() {
            @Override
            void absMethod() {
                System.out.println("This is an Abstract Method");
            }
        };
        am.absMethod();

        // Predefined Method
        PredefinedMethod pm = new PredefinedMethod();
        pm.preMethod();

    }
}
