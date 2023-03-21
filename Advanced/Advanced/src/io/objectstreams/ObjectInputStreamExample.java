package io.objectstreams;


// serialization
//writeObject()

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStreamExample {

    public static void main(String[] args) {
        try {
            Movie movieToSerialize = new Movie(1, "title", "type");
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\Work\\SDAcademy\\Spring\\Advanced\\Advanced\\src\\io\\objectstreams\\objectinputstream.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
            out.writeObject(movieToSerialize);
            out.flush();
            out.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
