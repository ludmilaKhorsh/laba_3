class Main {
    public static void main(String[] args) {
        int sum = 0;
        int n = 15;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ": ");
            for (int j = 1; j <= i; j++) {
                if (i % j == 0){
                    System.out.print(j + " ");
                    sum+=j;}
            }
            System.out.println(" Сумма "+sum);
            sum=0;
        }
    }
}