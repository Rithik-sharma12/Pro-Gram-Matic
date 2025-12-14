import java.util.*;

public class UniqueHash {
    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0 ; i < arr.length; i++ ){
            arr[i] = sc.nextInt();
        }

        for(int i : arr){
            st.add(i);
        }
        System.out.println(st);
        System.out.println(st.size());
    }
}

/*
number of unique elements in a collection */