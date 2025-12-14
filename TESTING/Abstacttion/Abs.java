interface Cycle{
    void ride();
    void stop();
}

abstract class Bike implements Cycle{
    public void ride(){
        System.out.println("Riding the bike");
    }
}

class Pulsar extends Bike{
    public void stop(){
        System.out.println("Stopping the bike");
    }
}

public interface Abs {
    public static void main(String[] args){
        Cycle p = new Pulsar(); // Upcasting 
        p.ride();
        p.stop();
    }
}

/*

*/