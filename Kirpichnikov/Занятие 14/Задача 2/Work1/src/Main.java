import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Здравствуйте, введите число: ");
        int n = sc.nextInt();

        int sum = SUMMA(n);
        System.out.println("Сумма от 1 до n "+ sum);

    }
    public static int SUMMA(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 2); //возвести в степень 2
        }
        return sum;
    }



}

