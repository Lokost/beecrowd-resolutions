import java.io.IOException;

public class e1009 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String n;
        double sal, ven, salb;
        n = scan.next();
        sal = scan.nextDouble();
        ven = scan.nextDouble();
        salb = sal + ((ven / 100) * 15);
        System.out.printf("TOTAL = R$ %.2f%n" , salb);

    }
}