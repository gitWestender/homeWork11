import java.util.Scanner;

public class Main {

    static int counter = 1;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.printf("\nЗадание %d:\n", counter++);
        System.out.println("Введите год: ");

        int year = scan.nextInt();
        isLeapYear(year);
    }

    static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}