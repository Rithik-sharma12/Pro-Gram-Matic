package AccessModifiers;

class PrivateClass{
    private int data = 40;
    public void setNum(int data){
        this.data = data;
    }
    public int getNum(){
        return data;
    }
}

class DefaultClass{
    int num = 50; // default access modifier
}

class ProtectedClass{
    protected int value = 60; // protected access modifier
    /*
    the protected access modifier is accessible within same package or subclass in different package
     */
}

class PublicClass{
    public int number = 70;
}
public class AccessMod {
    public static void main(String[] args) {
        /*
        1. Private 
        2. Default
        3. Protected
        4. Public
        */
       // Private Access Modifier
        PrivateClass pc = new PrivateClass();
        pc.setNum(100);
        System.out.println(pc.getNum());


    }
}
