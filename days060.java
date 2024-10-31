
package Days060;

import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
            int b = 0;  
            int c;      
        do {
            System.out.print("Masukkan angka 0 untuk berhenti = ");
            c = a.nextInt(); 
            if (c > 0) {
                b += c; 
            }
        } while (c != 0); 
        System.out.println("Total dari semua angka positif yang dimasukka = " + b);   
    }
    
}
