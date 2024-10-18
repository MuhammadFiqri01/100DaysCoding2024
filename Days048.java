

package days048.java;
import java.util.Scanner;
public class Days048Java {

    public static void main(String[] args) {
        // percabangan if else
         Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka = ");
        int a = input.nextInt();
        if( a >= 60 ){
            System.out.println("lansia");
        }
        if (a >= 18 && a <=59){
            System.out.println("Dewasa");
        }
        if ( a > 12 && a <= 17){
            System.out.println("Remaja");
        }
          else {   
        }
        if (a <= 12 && a >= 0){
            System.out.println("anak-anak"); 
        }
       
    }
}
