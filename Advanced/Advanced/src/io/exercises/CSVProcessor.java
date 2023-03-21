package io.exercises;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CSVProcessor {

    public static void main(String[] args) {
        System.out.println(processInputFile("D:\\Work\\SDAcademy\\Spring\\Advanced\\Advanced\\src\\io\\exercises\\input.csv"));
    }

    private static List<Person> processInputFile(String inputFilePath) {

        List<Person> inputList = new ArrayList<Person>();

        try {
            File inputF = new File(inputFilePath);
            InputStream inputFS = new FileInputStream(inputF);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));

            // skip the header of the csv
            inputList = br.lines().skip(1).map(line -> {
                String[] p = line.split(",");// a CSV has comma separated lines

                Person person = new Person();

                person.setAge(Integer.parseInt(p[0]));//<-- this is the first column in the csv file
                person.setName(p[1]);
                person.setCNP(p[2]);

                return person;
            }).collect(Collectors.toList());
            br.close();
        } catch (IOException e) {

        }

        return inputList;
    }
}
