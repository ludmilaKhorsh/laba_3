import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите зп ");
        int num = scanner.nextInt();
        System.out.print("Пожалуйста, введите начало диапазона ");
        int nachalo = scanner.nextInt();
        System.out.print("Пожалуйста, введите конец диапазона: ");
        int lonech = scanner.nextInt();

        if ((num - nachalo) * (num - lonech) == 0)
        {
            System.out.println("Эта вакансия мне подходит!");
        }
        else {
            System.out.println("Эта вакансия мне не подходит");
        }

    }
}
