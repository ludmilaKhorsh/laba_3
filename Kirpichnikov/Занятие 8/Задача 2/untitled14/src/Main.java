import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько на улице? ");
        int temp = scanner.nextInt();
        if (temp > 3) {
            System.out.println("Сегодня без шапки!");
        } else {
            System.out.println("Сегодня нужно идти в шапке...");
        }




    }
}
