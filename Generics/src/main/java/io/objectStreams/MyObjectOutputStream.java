package io.objectStreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MyObjectOutputStream {

    public static void main(String[] args) throws IOException {

        Movie movie = new Movie(1, "Gone With The Wind", "romance");

        ObjectOutputStream ous = new ObjectOutputStream(
                new FileOutputStream("/Users/romuluschitic/Spring/Generics/src/main/java/io/objectStreams/objectStream.txt"));

        ous.writeObject(movie);
        ous.flush();
        ous.close();



    }


}
