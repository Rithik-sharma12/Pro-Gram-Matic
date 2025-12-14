class ButtonPhone{
    void makeCall(){
        System.out.println("Making a call");
    }
}

class SmartPhone extends ButtonPhone{
    @Override
    void makeCall(){
        System.out.println("Making a call using SmartPhone");
    }
}



public class Overriding {
    public static void main(String[] args){
        ButtonPhone b1 = new ButtonPhone(); // parent class reference to parent class object
        b1.makeCall();
        ButtonPhone b2 = new SmartPhone(); // Upcasting , parent class reference to child class object
        b2.makeCall();
    }
}
