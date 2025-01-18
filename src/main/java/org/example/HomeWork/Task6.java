package org.example.HomeWork;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        // Регулярное выражение для проверки вещественных чисел
        String regex = "[+-]?\\d+(\\.\\d+)?";

        String[] testStrings = {
                "123.45",    // корректное вещественное число
                "-456.78",   // корректное вещественное число
                "+0.99",     // корректное вещественное число
                "12.34.56",  // некорректное вещественное число
                "abc",       // некорректное вещественное число
                "123.",      // некорректное
                "-.123",     // некорректное
                "+123"       // корректное целое число
        };

        for (String s : testStrings) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(s);
            if (matcher.matches()) {
                System.out.println(s + " соответствует формату вещественного числа");
            } else {
                System.out.println(s + " не соответствует формату вещественного числа");
            }
        }
    }
}
