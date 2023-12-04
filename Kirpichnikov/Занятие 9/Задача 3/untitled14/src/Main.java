import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scan.nextInt();
        System.out.println("Введите второе число");
        int b = scan.nextInt();
        int c = 0;
        while (a >0){
            c += a%10;
            a /=10;
        }
        while(b>0){
            c +=b%10;
            b /=10;
        }
        System.out.println("Сумма двух чисел равна "+ c);
    }
}
