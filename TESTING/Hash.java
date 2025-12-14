import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<>();
        st.add(5);
        st.add(5);
        st.add(7);
        // st.get(i); // HashSet does not support get by index
        st.remove(5);
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println(st.size());
    }
}
