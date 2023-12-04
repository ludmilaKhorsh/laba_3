import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста, введите число ");
        int number = scanner.nextInt();
        int q = number / 100;
        int w = number % 10;

        if (q == w) {
            System.out.println(number + " счастливое число");
        } else {
            System.out.println(number + " не является счастливым :-(");
        }
    }
}
