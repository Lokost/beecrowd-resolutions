import java.io.IOException;

public class e1046 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c;
        if (a > b) {
            c = 24 - (a - b);
        } else if (a < b) {
            c = b - a;
        } else {
            c = 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)%n" , c);

    }
}