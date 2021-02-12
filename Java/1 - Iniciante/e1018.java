import java.io.IOException;

public class e1018 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(a);
        int n100 = a / 100;
        a -= n100 * 100;
        int n50 = a / 50;
        a -= n50 * 50;
        int n20 = a / 20;
        a -= n20 * 20;
        int n10 = a / 10;
        a -= n10 * 10;
        int n5 = a / 5;
        a -= n5 * 5;
        int n2 = a / 2;
        a -= n2 * 2;

        System.out.printf("%d nota(s) de R$ 100,00%n%d nota(s) de R$ 50,00%n%d nota(s) de R$ 20,00%n%d nota(s) de R$ 10,00%n%d nota(s) de R$ 5,00%n%d nota(s) de R$ 2,00%n%d nota(s) de R$ 1,00%n", n100, n50, n20, n10, n5, n2, a);


    }
}