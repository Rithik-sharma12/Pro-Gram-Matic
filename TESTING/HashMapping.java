import java.util.HashMap;
public class HashMapping {
    public static void main(String[] args) {
        // Changed Key type from String to Integer to match the int[] array usage below
        HashMap<Integer, Integer> map = new HashMap<>();
        // occurence of each character in a string
        // String str = "9042515977";
        // for(int i = 0; i < str.length(); i++){
        //     char ch = str.charAt(i);
        //     String key = String.valueOf(ch);
        //     if(map.containsKey(key)){
        //         map.put(key, map.get(key) + 1);
        //     } else {
        //         map.put(key, 1);
        //     }
        // }
        // System.out.println(map);
        // System.out.println(map.get("a"));
        // System.out.println(map.get("b"));
        // System.out.println(map.get("c"));
        // System.out.println(map.get("d"));
        // System.out.println(map.containsKey("a"));
        // System.out.println(map.containsValue(2));
        
        // int[] arr = new int[]{9,3,6,3,4,6,0,4,9,9};
        // for(int i : arr){
        //     map.put(i, map.getOrDefault(i, 0) + 1);
        // }

        // for(int i : map.keySet()){
        //     System.out.println(i + "---> " + map.get(i));
        // }

        int[] arr = new int[]{9,3,6,4,4,6,0,4,9,9};
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1); // getOrDefault(key, defaultValue)
            // if key is present, return its value else return defaultValue
        }
        int maxFreq = 0;
        int ele = 0 ;
        for(int i: map.keySet()){
            if(map.get(i) > maxFreq){
                maxFreq = map.get(i);
                ele = i;
            }
        }
        System.out.println(ele + "---->" + maxFreq);
    }
    
}
