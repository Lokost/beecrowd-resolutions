import java.io.IOException;

public class e1008 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int n, h;
        double sal, tsal;
        n = scan.nextInt();
        h = scan.nextInt();
        sal = scan.nextDouble();
        tsal = sal * h;
        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n" , n, tsal);

    }
}