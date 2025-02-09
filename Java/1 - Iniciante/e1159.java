// Funcional no beecrowd
import java.util.*;

class e1159 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            int sum = 0, r = 0, x;
            
            x = in.nextInt();

            if (x == 0) {
                break;
            } else {
                while(true) {
                    if(x % 2 == 0) {
                        sum += x;
                        r ++;
                    }
                    x++;

                    if(r == 5) {
                        break;
                    }
                }
            }
            System.out.println(sum);
        }
        in.close();
    }
}