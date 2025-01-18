package org.example.HomeWork;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        String regex = "\\b\\w+\\b";

        String text = "Hello world! This is the longest word.";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        String longestWord = "";

        while (matcher.find()) {
            String currentWord = matcher.group();
            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
            }
        }

        System.out.println("Самое длинное слово: " + longestWord);

    }
}
