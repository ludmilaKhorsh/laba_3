import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Здравствуйте, введите число N ");
        int chislo = sc.nextInt();
        int fac = calculate(chislo);
        System.out.println("Факториал равен " + fac);
    }

    public static int calculate(int chislo) {
        if (chislo < 0) {
            System.out.println("Число должно быть меньшим или равным нулю!"); return 0;
        }
        if (chislo >= 13) {
            System.out.println("Число превышает численное значение в ячейке памяти!"); return 0;
        }

        int fac = 1;
        /// Факториалом натурального числа n называется произведение всех натуральных чисел от 1 до n.
        /// формула нахождения n! = 1 * 2 * 3 × ... * (n - 1) * n
        for (int i = 2; i <= chislo; i++) {
            fac *= i;
        }
        return fac;
    }
}
