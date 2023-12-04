import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Добро пожаловать в программу по шифрованию пароля.");
        System.out.println("Введите пароль из 5 символов ( латинские буквы и цифры) ");

        String pass = sc.nextLine();

        String encripcPass = "";

        if (pass.length() != 5) System.out.println("Пароль должен содержать минимум 5 символов!");
        for (int i = 0; i < pass.length() ; i++){
            char c = pass.charAt(i);
            if ((c >= 'a' && c <= 'z')|| (c>= 'A'&& c<= 'Z')){
                encripcPass += (int)c;
            }
            else if(Character.isDigit(c))
            {
                int dig = Character.getNumericValue(c);
                encripcPass += (dig +1);

            }
            else
            {
                System.out.println("Пароль должен содержать только латинский буквы и цифры!"); return;
            }
        }
        System.out.println("Зашифрованный пароль "+ encripcPass);
    }

}




