import java.util.ArrayList;

public class arrListExample2 {
    public static void main(String[] args) {
        ArrayList lstNumber = new ArrayList();
        lstNumber.add(12);
        lstNumber.add(23.23);
        lstNumber.add("tst");
        lstNumber.add(4545.34f);
        lstNumber.add(67);
        Float sum = 0f;
        Integer i1;
        Float f1;
        for (int i = 0; i < lstNumber.size(); i++) {
            if (lstNumber.get(i) instanceof Integer) {
                i1 = (Integer) lstNumber.get(i);
                sum = sum + i1;
            } else if (lstNumber.get(i) instanceof Float) {
                f1 = (Float) lstNumber.get(i);
                sum = sum + f1;
            }

        }
        System.out.println("Sum of list elements " + sum);
    }
}
