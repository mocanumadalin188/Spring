package io.bytestream;

//https://stackoverflow.com/questions/21641551/what-is-the-difference-between-fileinputstream-and-bufferedinputstream-in-java
//FileReader, FileWriter -> text char by char
//FileInputStream, FileOutputStream -> bytes . used for reading streams of raw bytes of data byte by byte
//BufferedInputStream, BufferedOutputStream -> uses a buffer
//BufferedInputStream reads from another InputStream, but a FileInputStream reads from a file1.
//In practice, this means that every call to FileInputStream.read() will perform a syscall (expensive) ... whereas most calls to BufferedInputStream.read() will return data from the buffer. In short, if you are doing "small" reads, putting a BufferedInputStream into your stream stack will improve performance.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("D:\\Work\\SDAcademy\\Spring\\Advanced\\Advanced\\src\\io\\bytestream\\bytestream.txt");
            out = new FileOutputStream("D:\\Work\\SDAcademy\\Spring\\Advanced\\Advanced\\src\\io\\bytestream\\bytestream_output.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
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
