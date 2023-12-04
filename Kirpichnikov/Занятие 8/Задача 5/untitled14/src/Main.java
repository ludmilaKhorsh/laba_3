import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста, введите количество купленных товаров: ");
        int kolvo = scanner.nextInt();
        double skidka = 0;
        System.out.print("Сколько стоит 1 товар");
        double price = scanner.nextDouble();

        double vsego = kolvo * price;
        double vsegoSoSkidoy = vsego - (vsego * kolvo);

        System.out.println("Сумма заказа с учетом скидки составляет: " + vsegoSoSkidoy);

        if (kolvo == 1) {
            skidka = 0.05;
        }
        if (kolvo == 2) {
            skidka = 0.05;
        } else if (kolvo == 3) {
            skidka = 0.10;
        } else if (kolvo == 4) {
            skidka = 0.10;
        } else if (kolvo > 4) {
            skidka = 0.15;
        } else {
            System.out.println("Error");
        }

    }
}