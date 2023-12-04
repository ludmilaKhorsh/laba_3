import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Здравствуйте, введите текст который нужно зашифровать ");
        String q = sc.nextLine();
        System.out.print("Введите ключ шифрования ");
        int a = sc.nextInt();
        System.out.println( encrypt(q,a));

    }
    public static String encrypt(String q, int key) {
        String res = "";

        for (int i = 0; i < q.length(); i++) {
            char с = q.charAt(i); // цикл который проходит по всем символам строки
            // c - получаем каждый символ строки
            res += (char) (с ^ (char) key); // шифрование через XOR
        }
        return res; // возвращаем зашифрованную строку
    }


}
