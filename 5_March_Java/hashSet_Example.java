import java.util.ArrayList;
import java.util.HashSet;

public class hashSet_Example {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(123);
        set.add(123);
        set.add(1233);
        set.add(1234);
        set.add(1230);

        // System.out.println(set);

        ArrayList lst = new ArrayList();
        lst.add(123);
        lst.add(123);
        lst.add(123);
        lst.add(1223);
        lst.add(12323);
        System.out.println("LIST " + lst);
        HashSet set1 = new HashSet(lst);
        System.out.println(set1);
        set1.add(set);
        System.out.println(set1);
    }
}
