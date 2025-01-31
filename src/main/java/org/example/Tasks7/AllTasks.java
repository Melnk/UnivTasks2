package org.example.Tasks7;

import java.util.regex.*;

public class AllTasks {

    public static void main(String[] args) {

        // 1. Строка, содержащая хотя бы одну цифру
        String regex1 = ".*\\d.*";
        String input1 = "hello123";
        System.out.println("1. Содержит цифры? " + input1.matches(regex1));

        // 2. Телефонные номера в формате (123) 456-7890 или 123-456-7890
        String regex2 = "\\(?\\d{3}\\)?[- ]?\\d{3}[- ]?\\d{4}";
        String input2 = "(123) 456-7890";
        System.out.println("2. Телефонный номер: " + input2.matches(regex2));

        // 3. Самое длинное слово
        String regex3 = "\\b\\w+\\b";
        String input3 = "Find the longest word in this sentence";
        Pattern pattern = Pattern.compile(regex3);
        Matcher matcher = pattern.matcher(input3);
        String longestWord = "";
        while (matcher.find()) {
            if (matcher.group().length() > longestWord.length()) {
                longestWord = matcher.group();
            }
        }
        System.out.println("3. Самое длинное слово: " + longestWord);

        // 4. Проверка на целое число
        String regex4 = "[+-]?\\d+";
        String input4 = "-123";
        System.out.println("4. Целое число? " + input4.matches(regex4));

        // 5. Строка, которая начинается с числа и заканчивается на "end"
        String regex5 = "^[0-9].*end$";
        String input5 = "123 some text end";
        System.out.println("5. Начинается с числа и заканчивается 'end'? " + input5.matches(regex5));

        // 6. Проверка на вещественное число
        String regex6 = "[+-]?\\d*\\.\\d+";
        String input6 = "123.45";
        System.out.println("6. Вещественное число? " + input6.matches(regex6));

        // 7. Строки, которые содержат более 5 символов и заканчиваются знаком "?"
        String regex7 = ".{6,}\\?$";
        String input7 = "Is this a question?";
        System.out.println("7. Строка больше 5 символов и заканчивается '?': " + input7.matches(regex7));

        // 8. Строки, начинающиеся с любой буквы и заканчивающиеся на "?"
        String regex8 = "^[a-zA-Z].*\\?$";
        String input8 = "Are you sure?";
        System.out.println("8. Строка начинается с буквы и заканчивается '?': " + input8.matches(regex8));

        // 9. Строки, начинающиеся со слова "Start" и заканчивающиеся точкой
        String regex9 = "^Start.*\\.$";
        String input9 = "Start the task.";
        System.out.println("9. Начинается с 'Start' и заканчивается точкой: " + input9.matches(regex9));

        // 10. Строки, содержащие только буквы и пробелы
        String regex10 = "^[a-zA-Z ]+$";
        String input10 = "Hello world";
        System.out.println("10. Только буквы и пробелы: " + input10.matches(regex10));

        // 11. Строки, начинающиеся с заглавной буквы и заканчивающиеся восклицательным знаком
        String regex11 = "^[A-Z].*!$";
        String input11 = "Hello!";
        System.out.println("11. Начинается с заглавной буквы и заканчивается '!': " + input11.matches(regex11));

        // 12. Строки, начинающиеся с буквы и заканчивающиеся на слово "done"
        String regex12 = "^[a-zA-Z].*done$";
        String input12 = "Task is done";
        System.out.println("12. Строка начинается с буквы и заканчивается 'done': " + input12.matches(regex12));

        // 13. Строки, начинающиеся с фразы "Hello there" и заканчивающиеся знаком восклицания
        String regex13 = "^Hello there.*!$";
        String input13 = "Hello there, welcome!";
        System.out.println("13. Строка начинается с 'Hello there' и заканчивается '!': " + input13.matches(regex13));

        // 14. Строки, состоящие исключительно из цифр и заканчивающиеся словом "done"
        String regex14 = "^\\d+done$";
        String input14 = "123done";
        System.out.println("14. Только цифры и заканчивается 'done': " + input14.matches(regex14));

        // 15. Строки, начинающиеся с буквы, за которой идут числа, и заканчиваются на слово "complete"
        String regex15 = "^[a-zA-Z]\\d+complete$";
        String input15 = "a123complete";
        System.out.println("15. Строка начинается с буквы, затем числа, и заканчивается 'complete': " + input15.matches(regex15));

        // 16. Строки, начинающиеся с символа # и заканчивающиеся словом "done"
        String regex16 = "^#.*done$";
        String input16 = "#taskdone";
        System.out.println("16. Строка начинается с '#' и заканчивается 'done': " + input16.matches(regex16));

        // 17. Строки, начинающиеся с пробела и заканчивающиеся на слово "exit"
        String regex17 = "^ .+exit$";
        String input17 = " Hello world exit";
        System.out.println("17. Строка начинается с пробела и заканчивается 'exit': " + input17.matches(regex17));

        // 18. Строки, начинающиеся с маленькой буквы и заканчивающиеся на слово "done"
        String regex18 = "^[a-z].*done$";
        String input18 = "task is done";
        System.out.println("18. Строка начинается с маленькой буквы и заканчивается 'done': " + input18.matches(regex18));

        // 19. Строки, содержащие хотя бы одну прописную букву
        String regex19 = ".*[A-Z].*";
        String input19 = "helloWorld";
        System.out.println("19. Строка содержит хотя бы одну прописную букву: " + input19.matches(regex19));
    }
}
