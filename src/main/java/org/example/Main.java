package org.example;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Регулярное выражение для поиска номеров в указанных форматах
        String regex = "\\(\\d{3}\\) \\d{3}-\\d{4}|\\d{3}-\\d{3}-\\d{4}";
        Pattern pattern = Pattern.compile(regex);

        // Тестовые строки
        String[] testStrings = {
                "(123) 456-7890",
                "123-456-7890",
                "123 456 7890",
                "123 4567 890",
                "456789012",
                "(987) 654-3210"
        };

        System.out.println("Результаты для массива тестовых строк:");
        for (String test : testStrings) {
            Matcher matcher = pattern.matcher(test);

            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }

        // Текст для поиска номеров
        String text = "Здесь есть номера: (123) 456-7890 и 987-654-3210. Еще (321) 4123-4567 и 555-555-5555.";

        System.out.println("\nНайдены телефонные номера в тексте:");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}