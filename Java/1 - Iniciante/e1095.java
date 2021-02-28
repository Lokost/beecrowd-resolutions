import java.io.IOException;

public class e1095 {

    public static void main(String[] args) throws IOException {

        int i = 1, j = 60;
        while (j >= 0) {
            System.out.println("I=" + i + " J=" + j);
            i += 3;
            j -= 5;
        }

    }
}