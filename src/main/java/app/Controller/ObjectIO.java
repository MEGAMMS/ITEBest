package main.java.app.Controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIO {
    public static Object LoudObjectFromFile(String filepath) throws  IOException, ClassNotFoundException {

        ObjectInputStream os = new ObjectInputStream(new FileInputStream(filepath));
        Object out = os.readObject();
        os.close();
        System.out.println("The Object was succesfully louded from the file");
        return out;
    }

    public static void WriteObjectToFile(Object serObj, String filepath) throws IOException {
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.err.println(serObj);
            System.out.println("The Object  was succesfully written to a file.");
    }
}
