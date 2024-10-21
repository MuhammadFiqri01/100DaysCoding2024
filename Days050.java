
package days050;
import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        // percabangan if-else if-else
        Scanner input = new Scanner(System.in);
         System.out.print("Masukan angka = ");
        int a = input.nextInt();
        
        if( a % 2 == 1 && a < 30 ){
            System.out.println("ON");
        }
        else if( a % 2 == 0 ){
            if ( a < 12 ){
                System.out.println("OFF");
            }else if ( a >= 12 && a <=30 ){
                System.out.println("ON");
            }else if( a > 30 ){
                System.out.println("OFF");
            }
        }
        else {
            System.out.println("lain-lain");
        }
    }
    
}
