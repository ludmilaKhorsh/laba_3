import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String put = "D://file.txt";

        int lastIndex = put.lastIndexOf("/");

        String name = put.substring(lastIndex + 1);

        System.out.println("Полное имя файла: " + name);
    }


}

