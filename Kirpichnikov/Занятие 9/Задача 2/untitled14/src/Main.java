import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите процент взлома");
        int a = scan.nextInt();
        System.out.println("Введите шаг");
        int b = scan.nextInt();
        int c = 0;

        while (c <= a){
            System.out.println("Система взломана на " + c +"%");
            c += b;
        }
    }
}
