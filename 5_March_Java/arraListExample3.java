import java.util.ArrayList;
import java.util.Iterator;

public class arraListExample3 {
    public static void main(String[] args) {
        ArrayList lstNumber = new ArrayList();
        lstNumber.add(12);
        lstNumber.add(23.23);
        lstNumber.add("tst");
        lstNumber.add(4545.34f);
        lstNumber.add(67);
        Iterator i = lstNumber.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
