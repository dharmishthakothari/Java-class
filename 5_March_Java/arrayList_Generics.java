import java.util.ArrayList;
import java.util.Iterator;

public class arrayList_Generics {
    public static void main(String[] args) {
        ArrayList<String> lstCity = new ArrayList<String>();
        ArrayList<String> lstRevCity = new ArrayList<String>();
        lstCity.add("Ahmedabbad");
        lstCity.add("Baroda");
        lstCity.add("Surat");

        Iterator<String> i = lstCity.iterator();
        while (i.hasNext()) {
            // String str = i.next();
            StringBuffer sb = new StringBuffer(i.next());
            lstRevCity.add(sb.reverse().toString());

        }
        System.out.println(lstRevCity);
    }
}
