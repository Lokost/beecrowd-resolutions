import java.io.IOException;

public class e1114 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int s = in.nextInt();
        while (s != 2002) {
            System.out.println("Senha Invalida");
            s = in.nextInt();
        }
        System.out.println("Acesso permitido");

    }
}