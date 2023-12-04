import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое имя:");
        String pervoeImya = scanner.nextLine();

        System.out.println("Введите второе имя:");
        String vtoroeImya = scanner.nextLine();

        if (pervoeImya.equalsIgnoreCase(vtoroeImya)) System.out.println("Эти люди являются близкими людьми");
        System.out.println("Эти люди не являются близкими людьми!");

    }


}

