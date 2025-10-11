package serialization;

import java.io.File;

public class FileExample {
    public static void example(String[] args) {
        File file = new File("test.txt");
        if (file.exists()) {
            System.out.println("File exists: " + file.getAbsolutePath());
        } else {
            System.out.println("File does not exist.");
        }
    }
}
