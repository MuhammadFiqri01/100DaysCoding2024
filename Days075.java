
package days075;
import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        // String Method toLowerCase()
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan teks = ");
        String a = input.nextLine();
        System.out.print("Masukkan karakter target = ");
        char b = input.next().charAt(0);
        String teksLower = a.toLowerCase();
        char targetLower = Character.toLowerCase(b);
        int c = 0;
        for (int i = 0; i < teksLower.length(); i++) {
            if (teksLower.charAt(i) == targetLower) {
                c++;
            }
        }
        System.out.println("Frekuensi huruf '" + b + "' dalam teks adalah = " + c);
    }
}
