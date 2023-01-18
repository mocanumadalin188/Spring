package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharactersStream {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("C:\\Users\\Cion\\Spring\\Generics\\src\\main\\java\\io\\charactersStream.txt");
            fileWriter = new FileWriter("C:\\Users\\Cion\\Spring\\Generics\\src\\main\\java\\io\\charactersStream_out.txt");
            int nextCharacter;
            while ((nextCharacter = fileReader.read()) != -1) {
                fileWriter.append((char) nextCharacter);
            }
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
        }


    }
}
