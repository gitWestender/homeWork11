import java.util.Scanner;

public class Main {

    static int counter = 1;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.printf("\nЗадание %d:\n", counter++);
        System.out.println("Введите год: ");

        int year = scan.nextInt();

        isLeapYear(year);
    }

    public static void task2() {
        System.out.printf("\nЗадание %d:\n", counter++);
        System.out.println("Введите OS и год выпуска вашего телефона: "
                + "\nOS вида iOS или Android");

        String clientOS = scan.next();
        int manufactureDate = scan.nextInt();

        whichVersion(clientOS, manufactureDate);
    }

    public static void task3() {
        System.out.printf("\nЗадание %d:\n", counter++);
        System.out.println("Укажите расстояние от офиса до адреса доставки (в КМ):");

        int deliveryDistance = scan.nextInt();

        whichDays(deliveryDistance);
    }

    static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    static void whichVersion(String clientOS, int manufactureDate) {
        switch (clientOS) {
            case "iOS":
                if (manufactureDate < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case "Android":
                if (manufactureDate < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Под вашу операционную систему нечего скачивать");
        }
    }

    static void whichDays(int distance) {
        int daysToGo;

        if (distance < 20) {
            daysToGo = 1;
            System.out.println("Потребуется дней: " + daysToGo);
        } else if (distance >= 20 && distance < 60) {
            daysToGo = 2;
            System.out.println("Потребуется дней: " + daysToGo);
        } else if (distance >= 60 && distance < 100) {
            daysToGo = 3;
            System.out.println("Потребуется дней: " + daysToGo);
        } else {
            System.out.println("Доставки нет");
        }
    }

}