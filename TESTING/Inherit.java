import java.util.*;

class Car{
    void start(){
        System.out.println("Starting the car");
    }
    void breaks(){
        System.out.println("Break is pressed");
    }
    void stop(){
        System.out.println("Car is stopped");
    }
}

class Tata extends Car{
    void show(){
        System.out.println("The is TATA Car");
    }
   
}

class Mahendra extends Car{
    void show(){
        System.out.println("This is MAHENDRA Car");
    }
    
}

class Tesla extends Car{
    void show(){
        System.out.println("This is TESLA Car");
    }
    
}


public class Inherit {
    public static void main(String[] args) {
        Tata t1 = new Tata();
        t1.show();
        t1.start();
        t1.breaks();
        t1.stop();
       
    }
}
