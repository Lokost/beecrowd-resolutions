import java.io.IOException;

public class e1131 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int op = 1, gremio = 0, inter = 0, grenal = 0, g_inter, g_grem, empate = 0;
        while (op != 2) {
            if (op == 1) {
                g_inter = in.nextInt();
                g_grem = in.nextInt();
                if (g_inter > g_grem) {
                    inter++;
                } else if (g_inter < g_grem) {
                    gremio++;
                } else {
                    empate++;
                }
                grenal++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            op = in.nextInt();
        }
        System.out.println(grenal + " grenais");
        System.out.println("Inter:" + inter);
        System.out.println("Gremio:" + gremio);
        System.out.println("Empates:" + empate);
        if (inter > gremio && gremio > empate) {
            System.out.println("Inter venceu mais");
        } else if (gremio > inter && inter > empate) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }

    }
}