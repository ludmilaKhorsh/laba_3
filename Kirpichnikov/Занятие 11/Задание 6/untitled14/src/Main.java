import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");

        int num = scanner.nextInt();

        if ((num & (num - 1)) == 0) System.out.println(num + " является степенью 2");
        else System.out.println(num + " НЕ является степенью 2");
    }
}
