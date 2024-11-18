
package days078;
import java.util.Scanner;
public class java {
     public static void main(String[] args) {
         //String Method : equalsIgnoreCase()
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kata Berland  = ");
        String a = input.nextLine();
        System.out.print("Masukkan kata Birland  = ");
        String b = input.nextLine();
        String c = new StringBuilder(a).reverse().toString();
        if (c.equalsIgnoreCase(b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
     }  
}
