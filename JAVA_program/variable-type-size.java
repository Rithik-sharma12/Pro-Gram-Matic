// java program for variable declaration and maximum and minimum size for each data-type

class VariableTypes {
    public static void main(String[] args) {
        
        byte myByte = 127; // -128 to 127 has (1 byte)
        
        boolean myBool = true; // 1 byte T || F (1 byte)
        
        char myChar = 'R'; // Stores a single character/letter or ASCII values (2 bytes)
        
        short myShort = 32767 ; //  -32,768 to 32,767 (2 bytes)
        
        int myNum = 2147483647; // -2,147,483,648 to 2,147,483,647 (4 bytes)
        
        float myFloat = 1.1234567F ;
        // Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits (4 bytes)
        
        double myDouble = 1.123456789012345D ;
        // Stores fractional numbers. Sufficient for storing 15 decimal digits (8 bytes)
        
        long myLong = 9223372036854775807L; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (8 bytes)
        
        System.out.println(myByte);
        System.out.println(myBool);
        System.out.println(myChar);
        System.out.println(myShort);
        System.out.println(myNum);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myLong);
        
    }
}
