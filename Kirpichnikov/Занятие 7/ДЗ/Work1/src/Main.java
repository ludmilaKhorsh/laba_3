import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите зп первого:");
        int nomer1 = scan.nextInt();
        System.out.println("Введите зп второго:");
        int nomer2 = scan.nextInt();
        System.out.println("Введите зп третьего:");
        int nomer3 = scan.nextInt();
        int srednee = (nomer1 + nomer2 + nomer3) / 3;
        System.out.println("Средняя зарплата айтишника: " + srednee);

    }
}