public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_460_000) {
            total = total + salary;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(" " + a + " ");
        }
        System.out.println();
        int b = 11;
        for (; b > 1; ) {
            b = b - 1;
            System.out.print(" " + b + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;;
        int year = 0;
        while (year < 10) {
            int birthRate = 17 * (population / 1000);
            int mortality = 8 * (population / 1000);
            population = population + birthRate - mortality;
            year = year + 1;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int savings = 15000;
        int total = 0;
        for (int i = 0; total <= 12_000_000; i++) {
            int bet = total / 100 * 7;
            total = total + bet;
            total = savings + total;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int savings = 15000;
        int total = 0;
        for (int i = 0; total <= 12_000_000; i++) {
            int bet = total / 100 * 7;
            total = total + bet;
            total = savings + total;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int savings = 15000;
        int total = 0;
        int term = 9;
        for (int i = 0; i <= (12 * term); i++) {
            int bet = total / 100 * 7;
            total = total + bet;
            total = savings + total;
            if (i % 6 == 0) {
                System.out.println("Сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int Friday = 5;
        int d = 0;
        while (d <= 31) {
            d = d + 1;
            if (d % Friday == 0) {
                System.out.println("Сегодня пятница, " + d + "-е число. Необходимо подготовить отчет");
            }
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int real = 2023;
        int thePast = real - 200;
        int future = real + 100;
        int d = 0;
        while (d <= future) {
            d += 79;;
            if (d > thePast && d < future) {
                System.out.println(d);
                }
            }
        }
    }

