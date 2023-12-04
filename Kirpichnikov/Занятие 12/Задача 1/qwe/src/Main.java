import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();

        String result = replaceCharacters(word);
        System.out.println("Результат замены: " + result);



    }
    public static String replaceCharacters(String word) {
        if (word.length() <= 2) {
            return word;
        }

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);

        String middleCharacters = "";
        for (int i = 1; i < word.length() - 1; i++) {
            middleCharacters += "*";
        }

        return firstChar + middleCharacters + lastChar;



    }