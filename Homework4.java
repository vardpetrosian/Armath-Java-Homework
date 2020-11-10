package com.company;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number = ");
        int num = scanner.nextInt();
        System.out.println("Facrorial of" + " " + num + " " + "is equal" + " " + printFactorial(num));

        printFibonacciSeries(num);

        System.out.print("Input number = ");
        int number = scanner.nextInt();
        reverseNumber(number);

        System.out.print("Input size of array = ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }
        printArrayElements(a, n);
        System.out.println("The summary of positive elements is =  " + getSum(a, n));
        System.out.println("The minimum element of array is =  " + getMinimumElementOfArray(a, n));

        System.out.print("Input specific value = ");
        int val = scanner.nextInt();
        System.out.println("Is" + " " + val + " " + "in array" + " - " + isInArray(a, n, val));

        String word = scanner.next();
        isPolindrome(word);

    }

    public static int printFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void printFibonacciSeries(int n) {
        int f1 = 1;
        int f2 = 1;
        int f;
        System.out.print(f1 + " " + f2);
        for (int i = 2; i < n; ++i) {
            f = f1 + f2;
            System.out.print(" " + f);
            f1 = f2;
            f2 = f;
        }
    }

    public static void reverseNumber(int number) {
        int rev = 0;
        while (number != 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed Number: " + rev);
    }

    public static int getSum(int[] a, int size) {
        int s = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] > 0) {
                s += a[i];
            }
        }
        return s;
    }

    public static void printArrayElements(int[] a, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
    }

    public static int getMinimumElementOfArray(int[] a, int size) {
        int min = a[0];
        for (int i = 1; i < size; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static boolean isInArray(int[] a, int size, int v) {
        boolean b = false;
        for (int i = 0; i < size; i++) {
            if (a[i] == v) {
                b = true;
            }
        }
        return b;
    }

    public static void isPolindrome(String word) {
        boolean isPalindrome = true;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                isPalindrome = false;
            }
        }
        if (isPalindrome) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
