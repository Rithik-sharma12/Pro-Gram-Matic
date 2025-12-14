class ABC{
    final int a;
    ABC(int a){
        this.a=a;
    }
}

class BCD extends ABC{
    BCD(){
        ABC(9);
    }
}


public class Final {
    public void main(String[] args){
        ABC obj = new ABC(8);
    }
    
}
