package org.example.Tasks6;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class AllTasks {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        // 1. Определить, четно или нет количество символов в названии города
        String city = "Kazan";
        System.out.println("1. Четное ли количество символов в названии города: " + (city.length() % 2 == 0));

        // 2. Дано два слова. Определить, какое из них длиннее.
        String word1 = "Hello", word2 = "World";
        System.out.println("2. Длиннее слово: " + (word1.length() > word2.length() ? word1 : word2));

        // 3. Даны названия трех городов. Вывести на экран самое длинное и самое короткое название.
        String city1 = "Kazan", city2 = "Moscow", city3 = "St. Petersburg";
        String longest = city1, shortest = city1;
        if (city2.length() > longest.length()) longest = city2;
        if (city3.length() > longest.length()) longest = city3;
        if (city2.length() < shortest.length()) shortest = city2;
        if (city3.length() < shortest.length()) shortest = city3;
        System.out.println("3. Самое длинное название: " + longest + ", самое короткое название: " + shortest);

        // 4. Дано слово. Вывести на экран его k-й символ.
        String word = "programming";
        int k = 5; // например, 5-й символ
        System.out.println("4. k-й символ слова: " + word.charAt(k - 1));

        // 5. Дано слово. Определить, одинаковы ли второй и четвертый символы.
        String testWord = "hello";
        System.out.println("5. Второй и четвертый символы одинаковы: " + (testWord.charAt(1) == testWord.charAt(3)));

        // 6. Дано слово. Верно ли, что оно начинается и оканчивается на одну и ту же букву?
        String wordToCheck = "radar";
        System.out.println("6. Слово начинается и заканчивается на одну и ту же букву: " +
                (wordToCheck.charAt(0) == wordToCheck.charAt(wordToCheck.length() - 1)));

        // 7. Дано два слова. Верно ли, что первое слово начинается на ту же букву, на которую заканчивается второе слово?
        String wordA = "apple", wordB = "orange";
        System.out.println("7. Первое слово начинается на ту же букву, на которую заканчивается второе: " +
                (wordA.charAt(0) == wordB.charAt(wordB.length() - 1)));

        // 8. Дано слово. Получить и вывести на экран буквосочетание, состоящее из его второго и четвертого символа.
        String wordForCombination = "happiness";
        System.out.println("8. Буквосочетание из второго и четвертого символов: " +
                wordForCombination.charAt(1) + "" + wordForCombination.charAt(3));

        // 9. Дано слово, состоящее из четного числа букв. Вывести на экран его первую половину, не используя оператор цикла.
        String evenWord = "computer";
        System.out.println("9. Первая половина слова: " + evenWord.substring(0, evenWord.length() / 2));

        // 10. Дан текст, в котором имеются цифры.
        String text = "abc123def456";
        // а) Найти их сумму
        int sum = 0;
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        System.out.println("10. Сумма цифр: " + sum);

        // б) Найти максимальную цифру
        int maxDigit = -1;
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                maxDigit = Math.max(maxDigit, Character.getNumericValue(c));
            }
        }
        System.out.println("Максимальная цифра: " + maxDigit);

        // 11. В заданной строке символов выделить в отдельную строку все имеющиеся цифры.
        StringBuilder digits = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            }
        }
        System.out.println("11. Все цифры из текста: " + digits.toString());

        // 12. Из слова яблоко путем "вырезок" и "склеек" его букв получить слова блок и око.
        String wordApple = "яблоко";
        String wordBlock = wordApple.substring(0, 1) + wordApple.substring(3, 4) + wordApple.substring(5, 6);
        String wordEye = wordApple.substring(2, 4) + wordApple.substring(4, 5);
        System.out.println("12. Слово блок: " + wordBlock + ", слово око: " + wordEye);

        // 13. Из слова информатика путем "вырезок" и "склеек" его букв получить слова форма и тик.
        String wordInformatics = "информатика";
        String wordForm = wordInformatics.substring(2, 6);
        String wordTick = wordInformatics.substring(6, 9);
        System.out.println("13. Слово форма: " + wordForm + ", слово тик: " + wordTick);

        // 14. Дано слово из четного числа букв. Поменять местами его половины.
        String evenLengthWord = "hellohello";
        int mid = evenLengthWord.length() / 2;
        String swapped = evenLengthWord.substring(mid) + evenLengthWord.substring(0, mid);
        System.out.println("14. Поменяли местами половины: " + swapped);

        // 15. Дано слово. Перенести первые k его букв в конец.
        String wordShift = "programming";
        int kShift = 4;  // пример
        String shiftedWord = wordShift.substring(kShift) + wordShift.substring(0, kShift);
        System.out.println("15. Перенос первых k букв в конец: " + shiftedWord);

        // 16. Дано название футбольного клуба. Напечатать его на экране "столбиком".
        String club = "Manchester";
        System.out.println("16. Футбольный клуб столбиком:");
        for (char c : club.toCharArray()) {
            System.out.println(c);
        }

        // 17. Составить программу, которая печатает заданное слово, начиная с последней буквы.
        String reverseWord = "hello";
        StringBuilder reversed = new StringBuilder(reverseWord).reverse();
        System.out.println("17. Слово в обратном порядке: " + reversed.toString());

        // 18. Дано слово s1. Получить слово s2, образованное нечетными буквами слова s1.
        String wordOdd = "abcdef";
        StringBuilder wordOddResult = new StringBuilder();
        for (int i = 0; i < wordOdd.length(); i += 2) {
            wordOddResult.append(wordOdd.charAt(i));
        }
        System.out.println("18. Слово из нечетных букв: " + wordOddResult.toString());

        // 19. Составить программу, формирующую строку, состоящую из любого заданного количества одинаковых символов.
        char repeatedChar = '*';
        int repeatCount = 5;
        String repeatedString = new String(new char[repeatCount]).replace('\0', repeatedChar);
        System.out.println("19. Строка из одинаковых символов: " + repeatedString);

        // 20. Дано слово. Добавить к нему в начале четыре символа "+" и в конце — пять символов "–".
        String wordForAdd = "text";
        String modifiedWord = "++++" + wordForAdd + "-----";
        System.out.println("20. Модифицированное слово: " + modifiedWord);

        // 21. Дано предложение. Составить программу, которая выводит все вхождения в предложение двух заданных символов.
        String sentence = "I love coding in Java.";
        char char1 = 'o', char2 = 'i';
        System.out.println("21. Вхождения символов: ");
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == char1 || sentence.charAt(i) == char2) {
                System.out.print(sentence.charAt(i) + " ");
            }
        }

        // 22. Задача не описана, пропустим.

        // 23. Дано предложение. Вывести все имеющиеся в нем буквосочетания.
        String sentenceForComb = "The quick brown fox";
        String[] words = sentenceForComb.split(" ");
        System.out.println("23. Буквосочетания в предложении:");
        for (String wordInSentence : words) {
            System.out.println(wordInSentence);
        }

        // 24. Дан текст. Сколько раз в нем встречается символ "+" и сколько раз символ "*".
        String textWithSymbols = "abc+def*ghi+jkl*";
        long plusCount = textWithSymbols.chars().filter(c -> c == '+').count();
        long starCount = textWithSymbols.chars().filter(c -> c == '*').count();
        System.out.println("24. Количество символов +: " + plusCount + ", количество символов *: " + starCount);

        // 25. Дано предложение. Напечатать все его символы, предшествующие первой запятой.
        String sentenceWithComma = "This is a sentence, with a comma.";
        System.out.println("25. Символы до первой запятой: " + sentenceWithComma.substring(0, sentenceWithComma.indexOf(',')));

        // 26. Дано предложение, в котором имеется несколько букв е. Найти:
        // а) порядковый номер первой из них;
        String sentenceForE = "elephant";
        System.out.println("26. Первая буква e находится на позиции: " + sentenceForE.indexOf('e'));

        // 27. Дано предложение. Заменить в нем все вхождения буквосочетания да на не.
        String sentenceForReplace = "да да да";
        System.out.println("27. После замены: " + sentenceForReplace.replace("да", "не"));

        // 28. Дано предложение. Заменить в нем все вхождения подстроки s1 на подстроку s2.
        String sentenceForReplace2 = "This is a sentence with s1 and s1.";
        System.out.println("28. После замены: " + sentenceForReplace2.replace("s1", "s2"));

        // 29. Поменять местами половины слова (с использованием оператора цикла).
        String evenLengthWordForSwap = "abcdef";
        char[] wordChars = evenLengthWordForSwap.toCharArray();
        for (int i = 0; i < wordChars.length / 2; i++) {
            char temp = wordChars[i];
            wordChars[i] = wordChars[wordChars.length - i - 1];
            wordChars[wordChars.length - i - 1] = temp;
        }
        System.out.println("29. После смены половин: " + new String(wordChars));

        // 30. Переставить буквы между k-й и s-й.
        String word15 = "abcdefghijklmno";
        int ki = 4, s = 10;
        char[] wordArray = word15.toCharArray();
        for (int i = ki; i < s / 2 + ki; i++) {
            char temp = wordArray[i];
            wordArray[i] = wordArray[s - i + ki];
            wordArray[s - i + ki] = temp;
        }
        System.out.println("30. После перестановки: " + new String(wordArray));

        // 31. Дан текст. Найти наибольшее количество идущих подряд одинаковых символов.
        String textForTask31 = "aaabbbccccdd";
        int maxCount = 1, currentCount = 1;
        for (int i = 1; i < textForTask31.length(); i++) {
            if (textForTask31.charAt(i) == textForTask31.charAt(i - 1)) {
                currentCount++;
            } else {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 1; // сбросить счетчик
            }
        }
        maxCount = Math.max(maxCount, currentCount); // проверка в конце
        System.out.println("31. Наибольшее количество подряд одинаковых символов: " + maxCount);

        // 32. Даны два слова. Для каждой буквы первого слова (в том числе для повторяющихся в этом слове букв) определить, входит ли она во второе слово.
        String wordForTask32a = "информация";
        String wordForTask32b = "процессор";
        System.out.print("32. Входят ли буквы первого слова во второе: ");
        for (int i = 0; i < wordForTask32a.length(); i++) {
            if (wordForTask32b.indexOf(wordForTask32a.charAt(i)) != -1) {
                System.out.print("да ");
            } else {
                System.out.print("нет ");
            }
        }
        System.out.println();

        // 33. Дано предложение из 10 слов. Заполнить ими массив из 10 элементов.
        String sentenceForTask33 = "This is a simple sentence with ten words in it exactly";
        String[] wordsArray = sentenceForTask33.split(" ");
        System.out.println("33. Массив слов: ");
        for (String wordi : wordsArray) {
            System.out.println(wordi);
        }

        // 34. Даны два предложения. Для каждого слова первого предложения (в том числе для повторяющихся в этом предложении слов) определить, входит ли оно во второе предложение.
        String sentenceForTask34a = "This is a simple sentence";
        String sentenceForTask34b = "Is this a simple example";
        String[] wordsFromFirstSentence = sentenceForTask34a.split(" ");
        String[] wordsFromSecondSentence = sentenceForTask34b.split(" ");

        System.out.println("34. Входят ли слова из первого предложения во второе:");
        for (String wordFromFirst : wordsFromFirstSentence) {
            if (sentenceForTask34b.contains(wordFromFirst)) {
                System.out.println(wordFromFirst + " - да");
            } else {
                System.out.println(wordFromFirst + " - нет");
            }
        }
    }
}
