import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = input.nextInt();

        int bin = 0;
        int p = 1;

        while (num > 0) {
            int r = num % 2;
            bin += r * p;
            num /= 2;
            p *= 10;
        }
        System.out.println("В двоичном виде " + bin);
    }
}
