package io.objectstreams;


import java.io.FileInputStream;
import java.io.ObjectInputStream;

//readObject()
//deserialization
public class ObjectOutputStreamExample {

    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("D:\\Work\\SDAcademy\\Spring\\Advanced\\Advanced\\src\\io\\objectstreams\\objectinputstream.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Movie movieToDeserialize = (Movie) in.readObject();
            in.close();
            fileIn.close();
            System.out.println(movieToDeserialize);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
