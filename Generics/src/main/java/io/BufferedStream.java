package io;

import java.io.*;

public class BufferedStream {
    public static void main(String[] args) throws IOException{
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream("/Users/romuluschitic/Spring/Generics/src/main/java/io/bufferedStream.txt"));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("/Users/romuluschitic/Spring/Generics/src/main/java/io/bufferedStream_out.txt"));
            int nextByte;
            while ((nextByte = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(nextByte);
            }
        } finally {
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
        }
    }
}
