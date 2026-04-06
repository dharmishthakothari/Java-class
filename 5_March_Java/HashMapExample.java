import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "dharmishtha");
        map.put(2, "Kavya");
        map.put(3, "Priyanshu");
        map.put(1, "Shivansh");
        map.put(79, "Ahemdabad");
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println((map.values()));
    }
}
