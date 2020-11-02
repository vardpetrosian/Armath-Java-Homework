package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        //1
        String name = "Varduhi";
        System.out.println("Hello");
        System.out.println(name);

        //2
        byte var1 = 2;
        short var2 = 1237;
        int var3 = 189025;
        long var4 = 29755L;
        float var5 = 29.5f;
        double var6 = 2.7;
        char ch = 'A';
        boolean b = true;
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(ch);
        System.out.println(b);

        //3
        int num1 = 20;
        int num2 = 3;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        //4
        int number1 = 258;
        int first = number1 / 100;
        int second = (number1 - first * 100) / 10;
        System.out.println(second);

        //5
        int kiloOfApple = 450;
        int kiloOfPear = 600;
        System.out.println(5 * kiloOfApple + 4 * kiloOfPear + " " + "dram");

        //6
        int valueInCentimets = 200;
        float valueInMeters = valueInCentimets / 10;
        System.out.println(valueInMeters + " " + "meter");

        //7
        int number = 1234;
        int firstDigit = number / 1000;
        System.out.println(firstDigit);
        int secondDigit = (number - firstDigit * 1000) / 100;
        System.out.println(secondDigit);
        int thirdDigit = (number - firstDigit * 1000 - secondDigit * 100) / 10;
        System.out.println(thirdDigit);
        int fourthDigit = number % 10;
        System.out.println(fourthDigit);
        System.out.print("The summary is = ");
        System.out.println(firstDigit + secondDigit + thirdDigit + fourthDigit);
    }
}
