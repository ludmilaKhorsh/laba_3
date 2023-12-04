import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;
        int sum = dice1 + dice2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Здравствуйте, попробуйте догадаться, будет ли сумма нечетной или " +
                "четной ");
        String guess = scanner.next();

        System.out.println("Первая кость" + dice1);
        System.out.println("Вторая кость" + dice2);

        System.out.println("Сумма: " + sum);


        if (sum % 2 == 0 && guess.equalsIgnoreCase("Чётное")) System.out.println("Вы угадали!");
        if (sum % 2 !=0 && guess.equalsIgnoreCase("Нечётная")) System.out.println("Вы не угадали.");



    }



}

