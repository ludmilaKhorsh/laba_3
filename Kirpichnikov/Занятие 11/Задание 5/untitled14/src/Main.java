import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в проверку четности числа.\n");
        System.out.print("Введите число ");
        int num = scanner.nextInt();

        if (num % 2 == 0) System.out.println(num + " - четное число");
        else System.out.println(num + " - нечетное число");

    }
}



