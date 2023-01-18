package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("C:\\Users\\Cion\\Spring\\Generics\\src\\main\\java\\io\\byteStream.txt");
            fileOutputStream = new FileOutputStream("C:\\Users\\Cion\\Spring\\Generics\\src\\main\\java\\io\\byteStream_out.txt");
            int nextByte;
            while ((nextByte = fileInputStream.read()) != -1) {
                fileOutputStream.write(nextByte);
            }
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }
}
