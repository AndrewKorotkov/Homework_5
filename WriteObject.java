package homework_five;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args)  {
        Box box1 = new Box(1,2, 3);
        Box box2 = new Box(2,3, 4);
        Box box3 = new Box(3,4, 5);
        Box box4 = new Box(4,5, 6);
        Box box5 = new Box(5,6, 7);

        try {
            FileOutputStream fos = new FileOutputStream("box.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(box1);
            oos.writeObject(box2);
            oos.writeObject(box3);
            oos.writeObject(box4);
            oos.writeObject(box5);

            oos.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
