package io.characterstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//
//The classes based on InputStream andOutputStream use non-buffered input/output. This means that any read or write request is handled directly by the underlying operating system. This can make the program much less efficient, as each request like that often allows disk access, network activity, or other costly operation.
//
//        In order to reduce this kind of overhead, the Java platform implements buffered I/O streams. Buffered input streams read data from an area of memory known as buffer.
//
//        The program can convert an unbuffered stream to a buffered stream using classes such as: BufferedReader,BufferedWriter, which enable caching of character streams. Classes such as BufferedInputStream andBufferedOutputStream can stream bytes.

public class CharacterStream {
    public static void main(String[] args) throws IOException {

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("D:\\Work\\SDAcademy\\Spring\\Advanced\\Advanced\\src\\io\\characterstream\\characterstream.txt");
            out = new FileWriter("D:\\Work\\SDAcademy\\Spring\\Advanced\\Advanced\\src\\io\\characterstream\\characterstream_output.txt");

            int c;
            int nextChar;
            while ((nextChar = in.read()) != -1) {
                out.append((char) nextChar);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
