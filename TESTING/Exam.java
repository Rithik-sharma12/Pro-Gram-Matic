import java.util.*;

class Sample extends Object{
    String name;
    Sample(String s){
        this.name = s;
    }
    public String toString(){
        return name;
    }
}

public class Exam {
    public static void main(String[] args) {

        ArrayList<Sample> obj = new ArrayList<>();
        obj.add(new Sample("Alpha"));
        obj.add(new Sample("Beta"));
        obj.add(new Sample("Gamma"));

        System.out.println(obj);
    }
}
