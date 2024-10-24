
package days053.java;

import java.util.Scanner;
public class Days053 {
    public static void main(String[] args) {
        // looping for
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka = ");
         int a = input.nextInt();
        
        for (int i = 1; i <= a; i++) {
            if ( i % 2 == 0 && i % 3 != 0){
                System.out.print(i + " ");
            }
            
        }
    }
    
}
