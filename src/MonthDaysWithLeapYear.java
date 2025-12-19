import java.util.InputMismatchException;
import java.util.Scanner;

public class MonthDaysWithLeapYear {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner input = new Scanner(System.in);
        int monthNumber = 0;
        int year = 0;

        try {
            System.out.print("Введите номер месяца (1–12): ");
            monthNumber = input.nextInt();

            if (monthNumber == 2) {
                System.out.print("Введите год: ");
                year = input.nextInt();
            }

            int index = monthNumber - 1;
            System.out.println("Месяц: " + months[index]);

            if (monthNumber == 2 && isLeapYear(year)) {
                System.out.println("Количество дней: 29 (високосный год)");
            } else {
                System.out.println("Количество дней: " + dom[index]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не целое число.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Недопустимое число месяца.");
        } finally {
            input.close();
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}