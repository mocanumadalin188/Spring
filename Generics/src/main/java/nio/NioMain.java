package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Collectors;

public class NioMain {

    public static void main(String[] args) throws IOException {


        Path path = Paths.get("/Users/romuluschitic/Spring/Generics/src/main/java/nio/data.txt");
        Files.deleteIfExists(path);
        Files.createFile(path);
        Path pathCopy = Paths.get("/Users/romuluschitic/Spring/Generics/src/main/java/nio/data_copy.txt");
        Files.delete(pathCopy);
        Files.copy(path, pathCopy);
        Files.write(pathCopy, "Test\n".getBytes(), StandardOpenOption.WRITE);
        Files.write(pathCopy, "Test\n".getBytes(), StandardOpenOption.APPEND);
        String str = Files.readAllLines(pathCopy).stream().map(line -> String.valueOf(line.length())).collect(Collectors.joining(","));
        System.out.println(str);


    }

}
