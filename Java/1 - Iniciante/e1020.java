import java.io.IOException;

public class e1020 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int a = scan.nextInt();
        int ano = a / 365;
        a -= ano * 365;
        int mes = a / 30;
        a -= mes * 30;

        System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", ano, mes, a);

    }
}