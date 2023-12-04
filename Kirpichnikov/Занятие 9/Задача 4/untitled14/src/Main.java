import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scan.nextInt();
        while (a >0){
            if (a % 2 == 0) System.out.println("Число пложительное и четное");break;

        }
        System.out.println("введеное число не удовлетворяет условию");
    }
}
