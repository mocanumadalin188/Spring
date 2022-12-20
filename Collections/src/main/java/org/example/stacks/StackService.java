package org.example.stacks;

import java.util.Stack;

public class StackService {

    public static String reverseString(String input){

        StringBuilder stringBuilder = new StringBuilder();

        Stack<Character> characters = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            characters.push(input.charAt(i));
        }

        while (!characters.isEmpty()){
            stringBuilder.append(characters.pop());
        }
        return stringBuilder.toString();
    }
}
