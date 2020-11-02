package com.company;

public class PrePostDemo {

    public static void main(String[] args) {
        int i = 3;
        i++;
        System.out.println(i); // "4"
        ++i;
        System.out.println(i); // "5"
        System.out.println(++i); // "5+1 =6" կտպի
        System.out.println(i++); //կտպի "6" քանի որ նախորդ քայլից դեռ 6 արժեքն
                                // է պահել հիշողությունում, հետո 6+1=7
        System.out.println(i); // "7"
    }
}

