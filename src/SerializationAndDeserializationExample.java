import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationAndDeserializationExample {

    public static void  example(){
        try {
            // Create a list of names to serialize
            ArrayList<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");

            // Serialization
            FileOutputStream fos = new FileOutputStream("./test/file");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(names);
            oos.close();
            fos.close();
            System.out.println("Serialization completed!");

            // Deserialization
            FileInputStream fis = new FileInputStream("./test/file");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<String> list = (ArrayList<String>) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Deserialization completed!");
            System.out.println("Deserialized List: " + list);

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }

}
