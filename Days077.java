
package days077;
import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        //String Method equals()
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah pernyataan = ");
        int a = input.nextInt();
        int b = 0;
        for (int i = 0; i < a; i++) {
            System.out.print("Masukkan pernyataan = ");
            String c = input.next();
            if (c.equals("++X") || c.equals("X++")) {
                b += 1; 
            } else if (c.equals("--X") || c.equals("X--")) {
                b -= 1; 
            }
        }
        System.out.println("Nilai akhir dari x adalah = " + b);
    } 
}
