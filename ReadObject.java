package homework_five;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream fis = new FileInputStream("box.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Box box1 = (Box) ois.readObject();
            Box box2 = (Box) ois.readObject();
            Box box3 = (Box) ois.readObject();
            Box box4 = (Box) ois.readObject();
            Box box5 = (Box) ois.readObject();

            System.out.println(box1);
            System.out.println(box2);
            System.out.println(box3);
            System.out.println(box4);
            System.out.println(box5);

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
