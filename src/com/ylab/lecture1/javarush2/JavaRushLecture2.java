package com.ylab.lecture1.javarush2;

public class JavaRushLecture2 {

    public static void main(String[] args) {

        /**
         * Создать объект типа Cat 2 раза.
         */
        Cat murzik = new Cat();
        Cat arsik = new Cat();

        /**
         * Создать 3 объекта типа Dog (собака) и присвоить им имена "Max", "Bella", "Jack".
         */
        Dog max = new Dog();
        Dog bella = new Dog();
        Dog jack = new Dog();

        /**
         * Напиши программу, которая выводит на экран надпись:
         * «Мне так плохо! Хочу, чтобы все умерли!».
         */
        System.out.println("Мне так плохо! Хочу, чтобы все умерли!");

        /**
         * Закоментарь несколько строк, чтобы на экран вывелось число 19.
         */
        //System.out.println(20);
        System.out.println(19);
        //System.out.println(18);

        /**
         * Создайте 10 переменных типа Cat и 8 объектов типа Cat.
         */
        Cat cat1;
        Cat cat2;
        Cat cat3;
        Cat cat4;
        Cat cat5;
        Cat cat6;
        Cat cat7;
        Cat cat8;
        Cat cat9;
        Cat cat10;
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();

        /**
         * Создайте объект типа Cat(кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
         * Присвойте каждому животному владельца (owner).
         */
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman woman = new Woman();
        cat.setOwner(new Person("Mark", 15));
        dog.setOwner(new Person("Eva", 25));
        fish.setOwner(new Person("Kate", 37));

        System.out.println(getMin(5, 27));
        System.out.println(getMax(5, 27));
    }

    /**
     * Написать функцию, которая возвращает минимум из двух чисел.
     * @param left first input int number.
     * @param right second input int number.
     * @return min.
     */
    public static int getMin(int left, int right) {
        //return Math.min(left, right);
        return left <= right ? left : right;
    }

    /**
     * Написать функцию, которая вычисляет максимум из двух чисел.
     * @param left first input int number.
     * @param right second input int number.
     * @return max.
     */
    public static int getMax(int left, int right) {
        //return Math.max(left, right);
        return left >= right ? left : right;
    }

    /**
     * Написать функцию, которая вычисляет минимум из трёх чисел.
     * @param left first input int number.
     * @param mid second input int number.
     * @param right third input int number.
     * @return max from 3 values.
     */
    public static int getMax(int left, int mid, int right) {
        return getMax(getMax(left, mid), right);
    }

    /**
     * Написать функцию, которая вычисляет минимум из четырёх чисел.
     * Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b).
     * @param left first input int number.
     * @param mid1 second input int number.
     * @param mid2 third input int number.
     * @param right fourth input int number.
     * @return max from 4 values.
     */
    public static int getMax(int left, int mid1, int mid2, int right) {
        return getMax(getMax(left, mid1), getMax(mid2, right));
    }

    /**
     * Написать функцию, которая выводит переданную строку на экран три раза, каждый раз с новой строки.
     * @param string print input string 3 times.
     */
    public static void pringDublicate(String string) {
        for (int i = 0; i < 3; i++) {
            System.out.println(string);
        }
    }

    /**
     * Написать функцию, которая выводит переданную строку (слово) на экран три раза,
     * но в одной строке. Слова должны быть разделены пробелом и не должны сливаться в одно.
     * @param word print input string 3 times in one line with space delimiter.
     */
    public static void printWords(String word) {
        for (int i = 0; i < 3; i++) {
            System.out.print(word + " ");
        }
    }
}
