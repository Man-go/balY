package com.ylab.lecture1;

public class JavaRushLecture1 {

    public static void main(String[] args) {

        /**
         * Объявите переменные name1, name2, name3 типа String.
         * Сразу же в строке объявления присвойте им какие-нибудь значения.
         * Значениями могут быть любые строки.
         */
        String name1 = "valueString1";
        String name2 = "valueString2";
        String name3 = "valueString3";

        /**
         * Напиши программу, которая выводит на экран надпись:
         * «Когда я вырасту, то хочу быть паровым экскаватором!» 10 раз.
         */
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". Когда я вырасту, то хочу быть паровым экскаватором!");
        }

        System.out.println(System.lineSeparator());

        /**
         * написать программу, которая выводит на экран строки:
         */
        int[] salary = new int[]{800, 1500, 2200, 2700, 3200};
        for (int value : salary) {
            System.out.println(String.format("Я согласен на зарплату $%d/месяц в первый год.", value));
        }

        System.out.println(System.lineSeparator());

        /**
         * Напиши программу, которая выводит на экран надпись: «Слава Роботам! Убить всех человеков!» 16 раз.
         */
        for (int i = 0; i < 16; i++) {
            System.out.println((i + 1) + ". Слава Роботам! Убить всех человеков!");
        }

    }
}
