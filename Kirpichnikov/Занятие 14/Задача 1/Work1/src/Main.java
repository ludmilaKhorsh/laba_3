import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Здравствуйте, введите номер вашей квартиры ");
        int app = sc.nextInt();
        int q = app / 3;
        if (app % 3 != 0) {
            q++;
            if (app % 3 == 1)System.out.println("Слева на " + q + " этаже");
            System.out.println("Посередине на " + q + " этаже");
        }
        else System.out.println("Справа на " + q + " этаже");
    }


}

