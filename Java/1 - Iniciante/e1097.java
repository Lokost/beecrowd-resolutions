import java.io.IOException;

public class e1097 {

    public static void main(String[] args) throws IOException {

        //Funcional no URI
        int j = 7;
        for (int i = 1; i <= 9; i += 2) {
            for (int a = 0; a < 3; a++) {
                System.out.println("I=" + i + " J=" + j);
                j--;
            }
            j += 5;
        }

    }
}