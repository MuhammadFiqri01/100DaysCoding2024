
package days066;

import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        //Pola Persegi dan Persegi Panjang
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka = ");
        int a = input.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
