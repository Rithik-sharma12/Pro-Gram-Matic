abstract class BankAbstract{
    String name;
    BankAbstract(String name){
        this.name = name ;
    }
    abstract void display();
}

class ICICI extends BankAbstract{
    ICICI(String name){
        super(name);
    }
    void display(){
        System.out.println(super.name);
    }
    void show(){ System.out.println("this is ICICI Bank"); }
}

public class AbsConst {
    public static void main(String[] args) {
        BankAbstract b1 = new ICICI("ICICI BANK");
        b1.display();
        b1.show();  // we cannot access show method because reference is of abstract class
    }
}
