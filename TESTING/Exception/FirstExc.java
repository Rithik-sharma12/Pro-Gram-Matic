public class FirstExc {
    public static void main(String[] args) {
        try{
            int[] arr = new int[]{1,2,3,4,5,6};
            for(int i=0 ; i <= arr.length ; i++){
            System.out.println(arr[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){ System.out.println("Array out of bound"); }
        catch(Exception e){ System.out.println("error"); }
        System.out.println("after exception");    
    }
}
