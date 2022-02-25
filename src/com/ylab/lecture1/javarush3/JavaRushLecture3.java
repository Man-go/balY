package com.ylab.lecture1.javarush3;

import java.util.Scanner;

public class JavaRushLecture3 {

    public static void main(String[] args) {
        printBirthDat("MAY 1 2012");
        printProduct();
        printSumSeries();

        String[] wordsArray = new String[]{"Mама", "Мыла", "Раму"};
        printAllVariations(wordsArray);

//        multiplicationTable(10);
//
//        printColors();
//        printPath();
//
//        printJapanHieroglyph("日本語");
//
//        printCaptureTheWorld();
//
//        printSalary();

//        printSponsor();
//        printPureLove();
        printFutureSalary();

    }


    /**
     * Вывести на экран дату своего рождения в виде: MAY 1 2012.
     * @param value input String.
     */
    public static void printBirthDat(String value) {
        System.out.println(value);
    }

    /**
     * Вывести на экран произведение чисел от 1 до 10.
     */
    public static void printProduct() {
        int result = 1;
        for (int i = 1; i <= 10; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    /**
     * Вывести на экран сумму чисел от 1 до 10 построчно.
     */
    public static void printSumSeries() {
        for (int i = 1; i <= 10; i++) {
            System.out.println((1 + i) * i / 2);
        }
    }

    /**
     * Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
     * Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять.
     * @param wordsArray input array String.
     */
    public static void printAllVariations(String[] wordsArray) {
        int len = wordsArray.length;
        int[] intArray = new int[len];
        for (int i = 0; i < len; i++) {
            intArray[i] = i;
        }
        int[][] allPermutationArray = printAllPermutation(intArray);

        for (int[] ints : allPermutationArray) {
            for (int item : ints) {
                System.out.print(wordsArray[item]);
            }
            System.out.println();
        }
    }

    /**
     * Возвращает двумерный массив int[][] всех возможных пермутаций от 0 до n,
     * @param array input array [0, 1, ... , n]
     * @return return int[][] all permutation
     */
    private static int[][] printAllPermutation(int[] array) {
        int len = (int) factorialRecursive(array.length);
        int[][] allPermutationArray = new int[len][];
        int index = 0;
        int k = array.length - 1;
        int n = k;
        allPermutationArray[index++] = array;
        for (; k > 0;) {
            array = leftShift(array, k);
            if (array[k] != k) {
                allPermutationArray[index++] = array;
                k = n;
            } else {
                k = k - 1;
            }
        }
        return allPermutationArray;
    }

    /**
     * Вспомогательный метод для реализации метода printAllPermutation.
     * @param array input int[].
     * @param k length input array int[]
     * @return array after shifting
     */
    private static int[] leftShift(int[] array, int k) {
        int[] tempArray = array.clone();
        int temp = tempArray[0];
        for (int i = 0; i < k; i++) {
            tempArray[i] = tempArray[i + 1];
        }
        tempArray[k] = temp;
        return tempArray;
    }

    /**
     * возвращает факториал числа
     * @param number input int number for factorial
     * @return long n!
     */
    private static long factorialRecursive(int number) {
        if (number < 0 || number > 20) {
            throw new IllegalArgumentException();
        }
        if (number == 1 || number == 0) {
            return 1;
        }
        return number * factorialRecursive(number - 1);
    }

    /**
     * Выведи на экран таблицу умножения 10 на 10 в следующем виде:
     * @param n input number for multiplication table type NxN
     */
    public static void multiplicationTable(int n) {
        int[] oneRow = new int[n];
        for (int i = 0; i < n; i++) {
            oneRow[i] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(oneRow[i] * (j + 1) + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Создать 7 объектов, чтобы на экран вывелись 7 цветов радуги (ROYGBIV).
     * Каждый объект при создании выводит на экран определенный цвет.
     */
    private static void printColors() {
        Red red = new Red();
        System.out.println();
        Orange orange = new Orange();
        System.out.println();
        Yellow yellow = new Yellow();
        System.out.println();
        Green green = new Green();
        System.out.println();
        Indigo indigo = new Indigo();
        System.out.println();
        Violet violet = new Violet();
        System.out.println();
    }

    /**
     * Экранирование символов
     */
    public static void printPath() {
        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println("It's Java string: \"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\"");
    }

    /**
     * Выведи на экран 日本語
     * @param string input string
     */
    public static void printJapanHieroglyph(String string) {
        System.out.println(string);
    }

    /**
     * Ввести с клавиатуры число и имя, вывести на экран строку:
     * «имя» захватит мир через «число» лет. Му-ха-ха!
     * ( Последовательность вводимых данных имеет большое значение.)
     */
    public static void printCaptureTheWorld() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите количество лет: ");
        int years = scanner.nextInt();
        System.out.printf("%s захватит мир через %d лет. Му-ха-ха!%n", name, years);
    }

    /**
     * Ввести с клавиатуры отдельно Имя, число1, число2.
     * Вывести надпись: «Имя» получает «число1» через «число2» лет.
     */
    public static void printSalaryAfterYears() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите заработок: ");
        int salary = scanner.nextInt();
        System.out.print("Введите количество лет: ");
        int years = scanner.nextInt();
        System.out.printf("%s захватит мир через %d лет. Му-ха-ха!%n", name, years);
    }

    /**
     * Ввести с клавиатуры имя и вывести надпись: name зарабатывает $5,000. Ха-ха-ха!
     */
    public static void printSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.printf("%s зарабатывает $5,000. Ха-ха-ха!%n", name);
    }

    /**
     * Ввести с клавиатуры два имени и вывести надпись:
     * name1 проспонсировал name2, и она стала известной певицей.
     */
    public static void printSponsor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя спонсора: ");
        String sponsor = scanner.nextLine();
        System.out.print("Введите имя спонсируемого: ");
        String sponsored = scanner.nextLine();
        System.out.printf("%s проспонсировал %s, и она стала известной певицей.", sponsor, sponsored);
    }

    public static void printPureLove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя влюбленного: ");
        String lover1 = scanner.nextLine();
        System.out.print("Введите имя влюбленного: ");
        String lover2 = scanner.nextLine();
        System.out.print("Введите имя влюбленного: ");
        String lover3 = scanner.nextLine();
        System.out.printf("%s + %s + %s = Чистая любовь, да-да!", lover1, lover2, lover3);
    }

    /**
     * Вывести на экран надпись «Жить хорошо, а хорошо жить еще лучше»
     */
    public static void printGoodLove() {
        System.out.println("Жить хорошо, а хорошо жить еще лучше");

    }

    /**
     * Я не хочу изучать Java, я хочу большую зарплату
     */
    public static void printDontLoveJava() {
        System.out.println("Я не хочу изучать Java, я хочу большую зарплату");

    }

    /**
     * Ввести с клавиатуры число n. Вывести на экран надпись «Я буду зарабатывать $n в час».
     */
    public static void printFutureSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите будущую зарплату в час: ");
        int salary = scanner.nextInt();
        System.out.printf("Я буду зарабатывать $%d в час%n.", salary);
    }
}
