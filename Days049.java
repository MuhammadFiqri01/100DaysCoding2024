
package days049;

import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        // percabangan if-else if
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka = ");
        int a = input.nextInt();
        if ( a >= 1 && a < 10 ){
            System.out.println("SATUAN");
        }
        else if ( a >= 10 && a < 100 ){
            System.out.println("PULUHAN");
        }
        else if ( a >= 100 && a < 1000 ){
            System.out.println("RATUSAN");
        }
        else if( a >= 1000 && a < 10000 ){
            System.out.println("RIBUAN");
        }
        else if ( a >= 10000 && a <100000 ){
            System.out.println("PULUHAN RIBU");
        }
    }
    
}
