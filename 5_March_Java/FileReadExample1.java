import java.io.FileInputStream;

public class FileReadExample1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Exception3.java");
            // while (true) {
            // int data = fis.read();
            // if (data == -1)
            // break;
            // System.out.print((char) data);

            // }
            // Second method
            // byte[] b = new byte[5];
            // fis.read(b);
            // String str = new String(b);
            // System.out.println(str);

            byte b[] = new byte[5];

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}
