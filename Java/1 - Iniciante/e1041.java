import java.io.IOException;

public class e1041 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double x = scan.nextDouble(), y = scan.nextDouble();

        if (x == 0 && y != 0) {
            System.out.println("Eixo Y");
        } else if (x != 0 && y == 0){
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else if (x > 0.0 && y < 0.0) {
            System.out.println("Q4");
        } else {
            System.out.println("Origem");
        }

    }
}