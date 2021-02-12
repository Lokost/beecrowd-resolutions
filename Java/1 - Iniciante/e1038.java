import java.io.IOException;

public class e1038 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt();
        double c = 0.0 , t;

        if (a == 1) {
            c = 4.00;
        } else if (a == 2) {
            c = 4.50;
        } else if (a == 3) {
            c = 5.00;
        } else if (a == 4){
            c = 2.00;
        } else if (a == 5) {
            c = 1.50;
        }

        t = c * b;

        System.out.printf("Total: R$ %.2f%n" , t);

    }
}