import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BuffereReader_input {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name ");
            String s = reader.readLine();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
