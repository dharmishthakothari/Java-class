import java.io.File;

public class FileExample2 {
    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\Admin\\Documents\\10Feb_SE_10_11\\Example1.c");
        if (file1.isDirectory()) {
            String[] lstFile = file1.list();
            for (String i : lstFile) {
                System.out.println(i);
            }
        } else {
            System.out.println("This is not Directory ");
        }
    }
}
