import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в программу по проверке тэга.\n");
        String message = "This is a #javaforever post. I love #coding in #javaforever.";
        String tag = "#javaforever";

        int index = message.lastIndexOf(tag);

        if (index != -1)
            System.out.println("Последнее появление хештега " + tag + " это индекс " + index);
        System.out.println(tag + " хештег не найден");


    }


}

