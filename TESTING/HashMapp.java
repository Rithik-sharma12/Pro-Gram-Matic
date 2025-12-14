import java.util.HashMap;


public class HashMapp {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("c", 1);
        map.put("b", 2);
        map.put("a",3);

        System.out.println(map.get("a"));
        System.out.println(map.get("b"));
        System.out.println(map.get("c"));

        System.out.println(map.containsKey("a"));
        System.out.println(map.containsValue(2));
    }
}
