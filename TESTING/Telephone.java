class Phone{

    void call(){
        System.out.println("Calling");
    }

    void cut(){
        System.out.println("Cutting the Call");
    }
}

class ButtonPhone extends Phone{
    void press(){
        System.out.println("the button is pressed");
        super.call();
        super.cut();
    }
    void play(){
        System.out.println("Snake Game");
    }
}

class SmartPhone extends ButtonPhone{

    void camera(){
        System.out.println("The Camera is opened");
    }
    
}

public class Telephone{
    public static void main(String[] args){
        ButtonPhone b1 = new ButtonPhone();
        b1.press();

    }
}