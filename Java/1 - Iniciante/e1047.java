import java.io.IOException;

public class e1047 {

    public static void main(String[] args) throws IOException {

        // Em revisão (Wrong Answer)
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt(), d = scan.nextInt(), h, m;
        if (a > c) {
            h = (24 - a) + c;
            if (b > d) {
                m = 60 - (b - d);
                h -= 1;
            } else if (b < d) {
                m = d - b;
            } else {
                m = 0;
            }
        } else if (a < c) {
            h = c - a;
            if (b > d) {
                m = 60 - (b - d);
                h -= 1;
            } else if (b < d) {
                m = d - b;
            } else {
                m = 0;
            }
        } else {
            h = 24;
            if (b > d) {
                m = 60 - (b - d);
                h = 23;
            } else if (b < d) {
                m = d - b;
            } else {
                m = 0;
            }
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n" , h, m);

    }
}