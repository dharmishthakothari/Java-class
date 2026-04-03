import java.io.FileReader;

public class FileReadingWithChar {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("FileExample2.java");
            char characters[] = new char[100];
            reader.read(characters);

            // for (int i = 0; i < characters.length; i++)
            // System.out.print(characters[i]);

            String str = new String(characters);
            System.out.println(str);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
