import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Здравствуйте, введите строку: ");
        String str = sc.nextLine();
        System.out.print("Введите подстроку для замены ");
        String old = sc.nextLine();
        System.out.print("Введите новую подстроку: ");
        String neww = sc.nextLine();
        String result = str.replace(old, neww);
        System.out.println("Итого " + result);

    }


}

