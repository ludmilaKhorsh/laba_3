import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        System.out.println("Здравствуйте, введите ваши оценки");

        int a = scan.nextInt();
        int sum = 0; int count = 0;
        while (a!=0)
        {
            sum += a;
            count++;
            a= scan.nextInt();
            if (count >0) {
                double avage = (double) sum / count;
                System.out.println("Средняя оценка "+avage);
            }
        }
        System.out.println("Оценки не введены.");


    }

}

