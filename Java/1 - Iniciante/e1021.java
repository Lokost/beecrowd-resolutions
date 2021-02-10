import java.io.IOException;

public class e1021 {

    public static void main(String[] args) throws IOException {

        java.util.Scanner scan = new java.util.Scanner(System.in);
        double a = scan.nextDouble();
        int n = (int) a;
        int m = (int) ((a - n) * 100);
        int n100 = n / 100;
        n -= n100 * 100;
        int n50 = n / 50;
        n -= n50 * 50;
        int n20 = n / 20;
        n -= n20 * 20;
        int n10 = n / 10;
        n -= n10 * 10;
        int n5 = n / 5;
        n -= n5 * 5;
        int n2 = n / 2;
        n -= n2 * 2;

        int m50 = m / 50;
        m -= m50 * 50;
        int m25 = m / 25;
        m -= m25 * 25;
        int m10 = m / 10;
        m -= m10 * 10;
        int m5 = m / 5;
        m -= m5 * 5;

        System.out.printf("NOTAS:%n%d nota(s) de R$ 100.00%n%d nota(s) de R$ 50.00%n%d nota(s) de R$ 20.00%n%d nota(s) de R$ 10.00%n%d nota(s) de R$ 5.00%n%d nota(s) de R$ 2.00%nMOEDAS:%n%d moeda(s) de R$ 1.00%n%d moeda(s) de R$ 0.50%n%d moeda(s) de R$ 0.25%n%d moeda(s) de R$ 0.10%n%d moeda(s) de R$ 0.05%n%d moeda(s) de R$ 0.01%n", n100, n50, n20, n10, n5, n2, n, m50, m25, m10, m5, m);


    }
}