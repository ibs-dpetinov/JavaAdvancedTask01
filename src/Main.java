import java.util.Scanner;
/**
 * This is a simple calculator program that performs basic arithmetic operations on two fractions.
 * The user is prompted to select an operation and enter the numerators and denominators of two fractions.
 * The program then performs the selected operation and displays the result.
 * If the denominator is zero, the program displays an error message.
 * The result is displayed with four decimal places of precision.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите арифметическую операцию:");
        System.out.println("1.Сложение");
        System.out.println("2.Вычитание");
        System.out.println("3.Умножение");
        System.out.println("4.Деление");

        int choice = scanner.nextInt();

        System.out.println("Введите числитель первой дроби: ");
        int num1 = scanner.nextInt();

        System.out.println("Введите знаменатель первой дроби: ");
        int num2 = scanner.nextInt();

        System.out.println("Введите числитель второй дроби: ");
        int num3 = scanner.nextInt();

        System.out.println("Введите знаменатель второй дроби: ");
        int num4 = scanner.nextInt();
        float result = 0;
        if (num2 != 0) {
            switch (choice) {
                case 1:
                    if (num4 != 0) {
                        result = (float) (num1 * num4 + num2 * num3) / (num2 * num4);
                        System.out.printf("%d/%d + %d/%d = %.4f", num1, num2, num3, num4, result);
                    } else {
                        System.out.println("Ой-ой-ой! На ноль делить нельзя.");
                    }
                    break;
                case 2:
                    if (num4 != 0) {
                        result = (float) (num1 * num4 - num2 * num3) / (num2 * num4);
                        System.out.printf("%d/%d - %d/%d = %.4f", num1, num2, num3, num4, result);
                    } else {
                        System.out.println("Ой-ой-ой! На ноль делить нельзя.");
                    }
                    break;
                case 3:
                    if (num4 != 0) {
                        result = (float) (num1 * num3) / (num2 * num4);
                        System.out.printf("(%d/%d) * (%d/%d) = %.4f", num1, num2, num3, num4, result);
                    } else {
                        System.out.println("Ой-ой-ой! На ноль делить нельзя.");
                    }
                    break;
                case 4:
                    if (num3 != 0) {
                        result = (float) (num1 * num4) / (num2 * num3);
                        System.out.printf("(%d/%d) / (%d/%d) = %.4f", num1, num2, num3, num4, result);
                    } else {
                        System.out.println("Ой-ой-ой! На ноль делить нельзя.");
                    }
                    break;
                default:
                    System.out.println("Не то");
            }
        } else {
            System.out.println("Ой-ой-ой! На ноль делить нельзя.");
        }
    }
}

