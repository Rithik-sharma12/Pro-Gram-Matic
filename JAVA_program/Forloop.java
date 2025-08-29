class ForLoop{
    public static void main(String[] args) {
        /*for (statement 1; statement 2; statement 3) {
        code block to be executed
        }
        */
        int i=0;
        for(i=0;i<5;i++){
            System.out.println("Printing for loop");
        }
        
        //Nested loop
        // Outer loop
       for (int j = 1; j <= 2; j++) {
           System.out.println("Outer: " + j); // Executes 2 times
           // Inner loop
           for (int k = 1; k <= 3; k++) {
               System.out.println(" Inner: " + k); // Executes 6 times (2 *)
            }
       }
       
       //For each loop
       /*for (type variableName : arrayName) {
       // code block to be executed
       }
       */
       String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
       for (String a : cars) {
           System.out.println(a);
       }
    }
}
