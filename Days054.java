
package days054;

import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        // looping for increment
        Scanner input = new Scanner(System.in);
          System.out.print("Masukan angka = ");
        int a = input.nextInt();
        
        int Genap = 0;
        int Ganjil = 0;
        
        for (int i = 1; i <= a; i++) {
            if ( i % 2 == 0){
                Genap += i;
            }else  {
                Ganjil += i;
            }  
        }
                System.out.println( Genap + " " );
                System.out.print( Ganjil + " " );
    }
    
}
