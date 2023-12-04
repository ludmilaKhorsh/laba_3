import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean a = false;
        for (int b = 10; b>0; b--){
            System.out.println("обратный отчет:"+b ); a = true;
        }
        if (a == true)
            System.out.println("бУМ");
    }
}
