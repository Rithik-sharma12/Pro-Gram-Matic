public class StringFun {
    public static void main(String[] args) {
        StringBuilder ssb1 = new StringBuilder();
        StringBuilder ssb2 = new StringBuilder();
        ssb1.append("Hello");
        ssb2.append("Hello");

        System.out.println(ssb1 == ssb2); // f
        System.out.println(ssb1.equals(ssb2)); // f 

        System.out.println(ssb1); //Hello

        StringBuffer sb1 = new StringBuffer(10); 
        StringBuffer sb2 = new StringBuffer(10);
        sb1.append("Rithik");
        sb2.append("Rithik");
        System.out.println(sb1); // Rithik

        System.out.println(sb1 == sb2); // f
        System.out.println(sb1.equals(sb2)); // f

        String s3 = new String("Rithik");
        String s1 = "Rithik";
        String s2 = "Rithik";

        System.out.println(s1 == s2); // t
        System.out.println(s1.equals(s2));  // t 

        System.out.println(s1.equals(s3));  // t

    }
}
