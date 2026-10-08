import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введіть оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean isValid = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Помилка: ділення на нуль!");
                    isValid = false;
                }
                break;
            default:
                System.out.println("Помилка: невідомий оператор!");
                isValid = false;
        }

        if (isValid) {
            System.out.println("Результат: " + result);
        }

        scanner.close();
    }
}
