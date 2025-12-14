public class Car{
    void displayParent(){
        System.out.println("IM From Parent Class");
    }
}

class Mannual extends Car{
    String name;
    void displayChild(){
        super.displayParent();
    }
}

public class Inherit2 {
    public static void main(String[] args){
        Mannual m1 = new Mannual();
        m1.displayChild();

    }
}
