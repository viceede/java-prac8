import java.util.InputMismatchException;
import java.util.Scanner;

public class MonthDaysProgram {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner input = new Scanner(System.in);
        int monthNumber = 0;

        try {
            System.out.print("Введите номер месяца (1–12): ");
            monthNumber = input.nextInt();

            int index = monthNumber - 1;
            System.out.println("Месяц: " + months[index]);
            System.out.println("Количество дней: " + dom[index]);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не целое число.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Недопустимое число месяца.");
        } finally {
            input.close();
        }
    }
}