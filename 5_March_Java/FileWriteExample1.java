import java.io.FileOutputStream;

public class FileWriteExample1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("First.txt", true);
            String str = "Good Afternoon ";
            byte b[] = str.getBytes();
            fos.write(b);
            System.out.println("File Written Successfully ");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
