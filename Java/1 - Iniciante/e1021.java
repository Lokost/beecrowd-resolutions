import java.io.IOException;

public class e1021 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
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

        System.out.println("NOTAS:");
        System.out.println(n100 + " nota(s) de R$ 100.00");
        System.out.println(n50 + " nota(s) de R$ 50.00");
        System.out.println(n20 + " nota(s) de R$ 20.00");
        System.out.println(n10 + " nota(s) de R$ 10.00");
        System.out.println(n5 + " nota(s) de R$ 5.00");
        System.out.println(n2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(n + " moeda(s) de R$ 1.00");
        System.out.println(m50 + " moeda(s) de R$ 0.50");
        System.out.println(m25 + " moeda(s) de R$ 0.25");
        System.out.println(m10 + " moeda(s) de R$ 0.10");
        System.out.println(m5 + " moeda(s) de R$ 0.05");
        System.out.println(m + " moeda(s) de R$ 0.01");

    }
}