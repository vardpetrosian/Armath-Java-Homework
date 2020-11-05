package com.company;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* System.out.print("Input the first number = ");
        double firstNum = scanner.nextDouble();
        System.out.print("Input second number = ");
        double secondNum = scanner.nextDouble();
        System.out.print("Input the third number = ");
        double thirdNum = scanner.nextDouble();
        System.out.print("The average value is = ");
        System.out.println(getAverage(firstNum, secondNum, thirdNum));

        System.out.println(isPositive(firstNum));

        System.out.print("Input number ");
        int num = scanner.nextInt();

        System.out.println(isEvenOrOdd(num));

        System.out.print("Input length ");
        double length = scanner.nextDouble();
        System.out.print("Input width ");
        double width = scanner.nextDouble();
        System.out.println("The rectangle perimetr is " + getRectPerimetr(length, width));
        System.out.println("The rectangle area is " + getRectArea(length, width));

        System.out.print("Input radius length ");
        double radius = scanner.nextDouble();
        System.out.println("The circule area is " + getCirculeArea(radius));
        System.out.println("The circule length is " + getCirculeLength(radius));

        System.out.print("Input a= ");
        double a = scanner.nextDouble();
        System.out.print("Input b= ");
        double b = scanner.nextDouble();
        System.out.print("Input c= ");
        double c = scanner.nextDouble();
        System.out.println(getQuadraticFormulaRoots(a, c, b));*/

        System.out.print("Input number ");
        int day = scanner.nextInt();
        System.out.println(isWeekday(day));
    }

    public static double getAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static boolean isPositive(double a) {
        if (a > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String isEvenOrOdd(int i) {
        if (i % 2 == 0) {
            return "the number is even";
        } else {
            return "the number is odd";
        }
    }

    public static double getRectPerimetr(double x, double y) {
        return 2 * (x + y);
    }

    public static double getRectArea(double x, double y) {
        return x * y;
    }

    public static double getCirculeArea(double r) {
        return 3.14 * r * r;
    }

    public static double getCirculeLength(double r) {
        return 2 * 3.14 * r;
    }

    public static double getQuadraticFormulaRoots(double a, double b, double c) {
        if (a <= 0) {
            System.out.println("Error message: the quadratic formula hasn't roots");
        } else {
            double d = b * b - 4 * a * c;
            if (d >= 0) {
                double x1 = (-b + sqrt(d)) / (2 * a);
                double x2 = (-b - sqrt(d)) / (2 * a);
                System.out.print("the quadratic formula's root are" + " " + x1 + " " + x2);
            } else System.out.println("Error message: the quadratic formula's roots are complex numbers");
        }
        return 0;
    }

    public static char isWeekday(int day)
    {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("there is no similar weekday");
                break;
        }
        return 0;
    }

    public static boolean isPrime(int a){
        return false; // aranc cikli lucum chgta
    }
}
