package com.example.Exercise4.runners;

import com.example.Exercise4.pojo.DummyLogger;
import com.example.Exercise4.pojo.ListUtil;
import com.example.Exercise4.pojo.StringUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class MyRunner implements CommandLineRunner {

    private final DummyLogger dummyLogger;

    private final ListUtil listUtil;

    private final StringUtil stringUtil;

//    public MyRunner(final DummyLogger dummyLogger, final ListUtil listUtil) {
//        this.dummyLogger = dummyLogger;
//        this.listUtil = listUtil;
//    }

    @Override
    public void run(String... args) throws Exception {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        int sumIntegerList = listUtil.sumElements(integerList);
        log.info(String.valueOf(sumIntegerList));

        dummyLogger.sayHi();

        List<String> words = new ArrayList<>();
        words.add("Aceasta");
        words.add("este");
        words.add("propoziția");
        words.add("pe");
        words.add("care");
        words.add("o");
        words.add("vom");
        words.add("afla");
        words.add("la");
        words.add("Runtime");
        String sentence = stringUtil.formSentence(words);
        log.info(sentence);


    }
}
