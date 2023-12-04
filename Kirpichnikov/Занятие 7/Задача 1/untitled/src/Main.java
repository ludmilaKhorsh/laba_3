import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Здравствуйте, введите заработок 1 IT специалиста");
        int a = scan.nextInt();
        System.out.println("Введите заработок 2го IT специалиста");
        int b = scan.nextInt();
        System.out.println("Введите заработок 3 IT специалиста");
        int c = scan.nextInt();
        System.out.println("Расчёт...");
        int s = a+b+c;
        int q = s/3;
        System.out.println("Средняя зп = " + q);






    }
}