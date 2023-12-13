package main.java.app.Controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIO {
    public Object LoudObjectFromFile(String filepath) {
        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream(filepath));
            Object out = os.readObject();
            os.close();
            return out;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void WriteObjectToFile(Object serObj,String filepath) {

        try {

            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
