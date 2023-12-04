import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Здравствуйте, введите количество электричества в дневное время ");
        double day = sc.nextDouble();

        System.out.print("Введите количество электричества в ночное время ");
        double night = sc.nextDouble();

        double cost = day * 6.81;
        System.out.println("В день " + day);
        double ncost = night * 2.48;
        System.out.println("В ночь " + ncost);

        double vsego = cost + ncost;

        System.out.println("Сумма " + Math.ceil(vsego));


    }



}

