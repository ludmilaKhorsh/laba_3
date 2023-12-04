import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста, введите год: ");
        int god = scanner.nextInt();

        if (god % 4 == 0) {
            if (god % 100 == 0) {
                if (god % 400 == 0) {
                    System.out.println(god + " год является високосным");
                } else {
                    System.out.println(god + " год не является високосным");
                }
            } else {
                System.out.println(god + " год является високосным");
            }
        } else {
            System.out.println(god + " год не является високосным");
        }
    }
}