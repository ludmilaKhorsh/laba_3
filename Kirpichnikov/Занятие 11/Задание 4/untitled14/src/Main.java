
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Добро пожаловать в программу шифрования данных.");

        System.out.println("Введите ключ для шифрования");
        int key = sc.nextInt();

        System.out.println("Введите текст для шифрования");
        String orig = sc.next();

        String txt = decrypt(orig, key);
        System.out.println("Зашифрованный текст " + txt);

        String dec = decrypt(txt, key);
        System.out.println("Расшифрованный текст " + dec);
    }
    public static String decrypt(String txt, int key) {
        String res = "";

        for (int i = 0; i < txt.length(); i++) {
            char ch = txt.charAt(i);
            res += (char) (ch ^ (char) key);
        }
        return res;
    }

}


