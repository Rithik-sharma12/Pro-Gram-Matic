import java.util.*;

class Mark{
    private int chem , phy , math;
    void setMark(int chem , int phy , int math){
        this.phy=phy;
        this.chem=chem;
        this.math=math;
    }
    void getMark(){
        System.out.println("Chem :"+chem+"\nphy :"+phy+"\nmath :"+math );
    }
}


public class First {
    public static void main(String[] args){
        Mark s1 = new Mark();
        s1.setMark(89,80,59);
        s1.getMark();
    }
}
