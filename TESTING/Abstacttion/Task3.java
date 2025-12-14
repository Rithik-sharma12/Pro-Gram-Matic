interface Animal{
    void walk();
}

interface Bird extends Animal {
    abstract void fly();
}


class Sparrow extends Bird implements Animal{
    public void walk(){ System.out.println("Sparrow if Flying"); }
    public void fly(){ System.out.println(Sparrow is walking);}
}
public class Task3 {
    public static void main(String[] args){
        
    }   
}

/*

interface to interfacre ---> can Extends
class to class ---> can extends
classs to interface ---> cannot extends
*/