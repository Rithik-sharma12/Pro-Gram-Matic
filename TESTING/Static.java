class Suma{
    int a = 10;
    static int b = 9;

}

public class Static {
    public static void main(String[] args){
        System.out.println(Suma.b); //recomended to access static variable directly using class name
        Suma s = new Suma();
        System.out.println(s.a); //non-static variable accessed through object reference
        System.out.println(Suma.b); //static variable accessed through class name
        s.b = 20; //static variable can be accessed through object reference, but not recommended
        System.out.println(Suma.b); //static variable still accessed through class name
        s.a = 15; //non-static variable can be modified through object reference
        System.out.println(s.a); //printing modified non-static variable
    }
}
