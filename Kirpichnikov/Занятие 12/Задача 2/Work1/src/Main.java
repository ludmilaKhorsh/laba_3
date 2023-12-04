import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b = (int) ((byte) i + f); //добавили явное присвоение к типо byte
        System.out.println("Ответ: "+b);

    }

}

