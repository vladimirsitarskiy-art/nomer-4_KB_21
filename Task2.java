import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int b = scanner.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("Числа повинні бути додатними!");
            scanner.close();
            return;
        }

        int num1 = a;
        int num2 = b;

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        System.out.println("НСД чисел " + num1 + " та " + num2 + " дорівнює: " + a);

        scanner.close();
    }
}
