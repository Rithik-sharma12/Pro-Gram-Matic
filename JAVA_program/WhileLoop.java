class WhileLoop{
    public static void main(String[] args) {
        int i=0;
        /*while (condition) {
        code block to be executed
        }
        */
        while(i<5){
            System.out.println("Printing while loop");
            i++;
        }
        
        /*do {
        code block to be executed
        }while (condition);
        */
        
        int j=0;
        do{
            System.out.println("Printing do while loop");
            j++;
        }while(j<5);
        
        //real life example
        int count=3;
        while(count>0){
            System.out.println(count);
            count--;
        }
        System.out.println("Happy new year");
        
        //Print "Yatzy!" If the dice number is 6
        int dice = 1;
        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
            dice = dice + 1;
        }
    }
}
