import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Добро пожаловать в игру 'Камень, ножницы, бумага'");
        System.out.println("Выберите из доступных вариантов для победы");
        System.out.println("1. Камень");
        System.out.println("2. Ножницы");
        System.out.println("3. Бумага");

        int vibor = scanner.nextInt();

        int viporPC = 1 + (int) (Math.random() * 3);

        System.out.println("Вы выбрали: " + name(vibor));

        System.out.println("Компьютер выбрал: " + name(viporPC));

        String result = win(vibor, viporPC);
        System.out.println(result);
    }

    public static String name(int choice) {
        return switch (choice) {
            case 1 -> "Камень";
            case 2 -> "Ножницы";
            default -> "Бумага";
        };
    }

    public static String win(int vibor, int viporPC) {
        if (vibor == viporPC) {
            return "Ничья!";
        } else if ((vibor == 1 && viporPC == 2) ||
                (vibor == 2 && viporPC == 3) ||
                (vibor == 3 && viporPC == 1)) {
            return "Вы победили!";
        }
        else
        {
            return "Компьютер победил!";
        }
    }
}




