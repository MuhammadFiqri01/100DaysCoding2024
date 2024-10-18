
package days047.java;

import java.util.Scanner;
public class Days047Java {

    public static void main(String[] args) {
        //percabangan if
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka = ");
        int a = input.nextInt();
          if(a % 2 == 1){
            System.out.println("Bilangan ganjil");
        }if (a % 2 == 0) {
        System.out.println("Bilangan genap");
    }
    }
    
}
