import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\Documents\\Java_Backup.txt");
        System.out.println(file.exists());
        System.out.println(file.getParent() + "\t" + file.getPath());
        System.out.println(file.isFile() + "\t" + file.isDirectory());

    }
}
