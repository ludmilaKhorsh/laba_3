import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int q = 1;
        while (q <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.print(q * j + " ");
                j++;
            }
            System.out.println();
            q++;
        }
    }
}
