package org.example.HomeWork5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.*;

public class AllTasks {
    public static void main(String[] args) {
        // 1. Подсчет количества слов в файле
        countWords("input.txt");

        // 2. Замена слова в файле
        replaceWord("input.txt", "старое", "новое", "output.txt");

        // 3. Деление двух чисел с обработкой исключений
        divideNumbers("10 2"); // Корректный ввод
        divideNumbers("10 a"); // Ошибка ввода
        divideNumbers("10 0"); // Деление на ноль

        // 4. Обработка исключений при чтении файла
        processFile("numbers.txt");

        // 5. Поиск номеров телефонов в файле
        extractPhoneNumbers("input.txt", "phones.txt");

        // 6. Извлечение дат из строки
        extractDates("Сегодня 12.05.2023 и завтра 31.12.2022 важные даты.");

        // 7. Поиск слов с заглавной буквы
        findCapitalizedWords("Сегодня отличный День для прогулки.");

        // 8. Проверка, состоит ли строка только из цифр
        System.out.println(isNumeric("12345")); // true
        System.out.println(isNumeric("123a45")); // false
    }

    // 1. Подсчет количества слов в файле
    public static void countWords(String filename) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(filename)));
            String[] words = content.split("\\s+"); // Разделяем по пробелам
            System.out.println("Количество слов: " + words.length);
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }

    // 2. Замена слова в файле
    public static void replaceWord(String inputFile, String oldWord, String newWord, String outputFile) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(inputFile)));
            content = content.replaceAll(oldWord, newWord);
            Files.write(Paths.get(outputFile), content.getBytes());
            System.out.println("Файл успешно обновлен.");
        } catch (IOException e) {
            System.out.println("Ошибка обработки файла: " + e.getMessage());
        }
    }

    // 3. Деление двух чисел с обработкой исключений
    public static void divideNumbers(String input) {
        try {
            String[] parts = input.split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            System.out.println("Результат: " + (a / b));
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: некорректный ввод числа.");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль.");
        }
    }

    // 4. Обработка исключений при чтении файла
    public static void processFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {
                lineNumber++;
                try {
                    Integer.parseInt(line);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка в строке " + lineNumber + ": не число.");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: файл не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }

    // 5. Поиск номеров телефонов в файле
    public static void extractPhoneNumbers(String inputFile, String outputFile) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(inputFile));
            Pattern pattern = Pattern.compile("\\+7-\\d{3}-\\d{3}-\\d{2}-\\d{2}");
            StringBuilder result = new StringBuilder();
            for (String line : lines) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    result.append(matcher.group()).append("\n");
                }
            }
            Files.write(Paths.get(outputFile), result.toString().getBytes());
            System.out.println("Телефоны сохранены в " + outputFile);
        } catch (IOException e) {
            System.out.println("Ошибка обработки файла: " + e.getMessage());
        }
    }

    // 6. Извлечение дат из строки
    public static void extractDates(String text) {
        Pattern pattern = Pattern.compile("\\b(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.\\d{4}\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Найденная дата: " + matcher.group());
        }
    }

    // 7. Поиск слов с заглавной буквы
    public static void findCapitalizedWords(String text) {
        Pattern pattern = Pattern.compile("\\b[A-ZА-Я][a-zа-я]*\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Слово с заглавной буквы: " + matcher.group());
        }
    }

    // 8. Проверка, состоит ли строка только из цифр
    public static boolean isNumeric(String text) {
        return text.matches("\\d+");
    }
}