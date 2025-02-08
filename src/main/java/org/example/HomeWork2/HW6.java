package org.example.HomeWork2;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        double resultG = 0;
        for (int i = 0; i <= n; i++){
            resultG += (1/(Math.pow(a, Math.pow(2, i))));
        }
        System.out.println(resultG);
        double resultD = a;
        for (int i = 1; i <= n; i++){
            resultD += (a - n * i);
        }
        System.out.println(resultD);
    }
}
