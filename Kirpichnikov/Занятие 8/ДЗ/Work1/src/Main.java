import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите стоимость работ");

        double work = scan.nextDouble();
        System.out.println("Введите стоимость материалов в рублях");
        double mat = scan.nextDouble();
        System.out.println("Введите скидку в процентах в рублях");
        double skidka = scan.nextDouble();
        System.out.println("Введите бюджет в рублях");
        double budget = scan.nextDouble();
        double total = work + mat;
        double sales = (total * skidka) / 100;

        double sum = total - sales;


        System.out.println("стоимость проекта со скидкой " + sum + " рублей");

        if (sum <= budget) System.out.println("у заказчика деньги есть!");
        else System.out.println("Денег нет.");
    }
}


