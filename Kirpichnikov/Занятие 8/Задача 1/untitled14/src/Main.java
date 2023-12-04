import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы голодны?");
        boolean golod = scanner.nextBoolean();
        if (golod) {
            System.out.println("Вот ваш обед");
        }
        System.out.println("Можно идти гулять!");


    }
}
