package io.objectStreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MyObjectInputStream {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("/Users/romuluschitic/Spring/Generics/src/main/java/io/objectStreams/objectStream.txt"));

        Movie deserializedMovie = (Movie) ois.readObject();
        ois.close();

        System.out.println(deserializedMovie);

    }




}
