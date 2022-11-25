public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Задача 2
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // Задача 3
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        // Задача 4
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // Задача 5
        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }

        // Задача 6
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        // Задача 7
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        // Задача 8
        System.out.println("Задача 8");
        int capital = 29_000;
        double sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum = sum + capital;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + sum + " рублей");
        }

        // Задача 9
        System.out.println("Задача 9");
        int capital1 = 29_000;
        double sum1 = 0;
        double percentagePerMonth = 0.01;
        for (int i = 1; i <= 12; i++) {
            sum1 = sum1 + sum1 * percentagePerMonth;
            sum1 = sum1 + capital1;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + sum1 + " рублей");
        }


    }
}