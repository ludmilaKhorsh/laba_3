import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Здравствуйте, введите пожалуйста слово: ");
        String slovo = scanner.nextLine();

        String result = zamena(slovo);
        if (slovo != "")
            System.out.println("Результат замены: " + result);
        System.out.println("Оценки не введены.");


    }
    public static String zamena(String slovo) {
        if (slovo.length() <= 2) {
            return slovo;
        }

        char pervoe = slovo.charAt(0);
        char poslednee = slovo.charAt(slovo.length() - 1);

        String zamenit = "";
        for (int i = 1; i < slovo.length() - 1; i++) {
            zamenit =  "*";
        }

        return pervoe + zamenit + poslednee;
    }


}

