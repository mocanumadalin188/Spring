package string.scanner;

import java.util.Scanner;

public class ScannerMain {
    // scanner - clasa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vom introduce un string de la tastatura");
        String s = null;
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < 5; i++){
            builder.append(scanner.nextInt());
        }
        System.out.println(builder.toString());
    }
}
