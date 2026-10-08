import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число N: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("У діапазоні немає простих чисел.");
            scanner.close();
            return;
        }

        System.out.println("Прості числа у діапазоні від 1 до " + n + ":");

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; 
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        scanner.close();
    }
}
