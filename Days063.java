
package days063;
import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        // keyword continue
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 15 == 0) {
                continue;
            }
            if (i % 3 == 0 || i % 5 == 0) {
                b++;
            }
        }
        System.out.println(b);
    }
}
