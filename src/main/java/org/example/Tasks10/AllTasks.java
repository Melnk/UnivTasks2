package org.example.Tasks10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class AllTasks {

    // 1. Чтение и вывод всех строк файла
    public static void readFile(String filename) throws IOException {
        Files.lines(Paths.get(filename)).forEach(System.out::println);
    }

    // 2. Подсчёт количества строк в файле
    public static long countLines(String filename) throws IOException {
        return Files.lines(Paths.get(filename)).count();
    }

    // 3. Чтение файла с номерами строк
    public static void readFileWithLineNumbers(String filename) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filename));
        for (int i = 0; i < lines.size(); i++) {
            System.out.println((i + 1) + ". " + lines.get(i));
        }
    }

    // 4. Подсчёт вхождений слова в файле
    public static long countWordOccurrences(String filename, String word) throws IOException {
        return Files.lines(Paths.get(filename))
                .flatMap(line -> List.of(line.split("\\s+")).stream())
                .filter(w -> w.equals(word))
                .count();
    }

    // 5. Копирование файла
    public static void copyFile(String source, String destination) throws IOException {
        Files.copy(Paths.get(source), Paths.get(destination), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
    }

    // 6. Подсчёт количества слов в файле
    public static long countWords(String filename) throws IOException {
        return Files.lines(Paths.get(filename))
                .flatMap(line -> List.of(line.split("\\s+")).stream())
                .count();
    }

    // 7. Замена слова в файле и запись в новый
    public static void replaceWordInFile(String filename, String oldWord, String newWord, String outputFile) throws IOException {
        List<String> lines = Files.lines(Paths.get(filename))
                .map(line -> line.replaceAll(oldWord, newWord))
                .collect(Collectors.toList());
        Files.write(Paths.get(outputFile), lines);
    }

    // 8. Деление с обработкой исключения
    public static void divideNumbers(int a, int b) {
        try {
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!");
        }
    }

    // 9. Чтение файла с обработкой FileNotFoundException
    public static void safeReadFile(String filename) {
        try {
            readFile(filename);
        } catch (IOException e) {
            System.out.println("Файл не найден. Введите другой путь.");
        }
    }

    // 10. Деление с обработкой двух исключений
    public static void safeDivide(String num1, String num2) {
        try {
            int a = Integer.parseInt(num1);
            int b = Integer.parseInt(num2);
            divideNumbers(a, b);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Некорректный ввод числа.");
        }
    }

    // 11. Преобразование строк в числа с обработкой исключений
    public static void convertStringsToNumbers(String[] numbers) {
        for (String num : numbers) {
            try {
                int value = Integer.parseInt(num);
                System.out.println("Число: " + value);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Невозможно преобразовать '" + num + "' в число.");
            }
        }
    }

    // 12. Исключение при отрицательном числе
    static class NegativeNumberException extends Exception {
        public NegativeNumberException(String message) {
            super(message);
        }
    }

    public static void checkNegativeNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Число не должно быть отрицательным!");
        }
    }

    // 13. Чтение файла с разными исключениями
    static class EmptyFileException extends Exception {
        public EmptyFileException(String message) {
            super(message);
        }
    }

    public static void advancedFileRead(String filename) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filename));
            if (lines.isEmpty()) throw new EmptyFileException("Файл пуст!");
            for (int i = 0; i < lines.size(); i++) {
                try {
                    Integer.parseInt(lines.get(i));
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка в строке " + (i + 1));
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка: файл не найден!");
        } catch (EmptyFileException e) {
            System.out.println(e.getMessage());
        }
    }

    // 14. Регулярное выражение для почтовых адресов
    public static boolean isValidEmail(String email) {
        return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }

    // 15. Поиск номеров телефонов
    public static void extractPhoneNumbers(String filename, String outputFile) throws IOException {
        Pattern pattern = Pattern.compile("\\+7-\\d{3}-\\d{3}-\\d{2}-\\d{2}");
        List<String> phones = new ArrayList<>();

        for (String line : Files.readAllLines(Paths.get(filename))) {
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                phones.add(matcher.group());
            }
        }

        Files.write(Paths.get(outputFile), phones);
    }


    // 16. Поиск дат в формате DD.MM.YYYY
    public static void extractDates(String text) {
        Matcher matcher = Pattern.compile("\\b(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.\\d{4}\\b").matcher(text);
        while (matcher.find()) {
            System.out.println("Дата: " + matcher.group());
        }
    }

    // 17. Поиск слов с заглавной буквы
    public static void findCapitalizedWords(String text) {
        Matcher matcher = Pattern.compile("\\b[A-ZА-Я][a-zа-я]*\\b").matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    // 18. Проверка, состоит ли строка только из цифр
    public static boolean isNumeric(String text) {
        return text.matches("\\d+");
    }
}