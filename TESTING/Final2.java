import java.util.Arrays;

public class Final2 {
    public static void main(String[] args) {
        final int arr[] = {1,2,3};
        System.out.println(Arrays.toString(arr));
        arr[0] = 10; // Allowed: modifying the contents of the array
        System.out.println(Arrays.toString(arr)); // Output: [10, 2, 3]
        arr = new int[]{4,5,6}; // Not Allowed: cannot reassign a final reference
        System.out.println(Arrays.toString(arr)); // This line will cause a compilation error
    }
}
