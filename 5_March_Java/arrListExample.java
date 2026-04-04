import java.util.ArrayList;
import java.util.Date;

public class arrListExample {
    public static void main(String[] args) {
        ArrayList lst = new ArrayList();
        lst.add("test");
        lst.add("ppppp");
        lst.add("cvxcvxcv");
        lst.add(12345);
        lst.add(34.67f);
        lst.add(new Date());
        // System.out.println(lst);
        // System.out.println(lst.get(2));
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }
        // i want add all integer numbers
        ArrayList lstNumber = new ArrayList();
        lstNumber.add(12);
        lstNumber.add(23);
        lstNumber.add(55);
        lstNumber.add(11);
        int sum = 0;
        for (int i = 0; i < lstNumber.size(); i++) {
            sum = sum + (int) lstNumber.get(i);
        }
        System.out.println("Sum of list elements " + sum);

    }
}
