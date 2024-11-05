
package days065;
import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        // Nested loop
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif = ");
        int a = input.nextInt();
        if (a <= 0) {
            System.out.println("masukkan bilangan bulat positif");
            return;
        }
        while (a >= 10) {
            int b = 0; 
            while (a > 0) { 
                b += a % 10; 
                a /= 10; 
            }
            a = b;
        }
        System.out.println(a);
    } 
}
