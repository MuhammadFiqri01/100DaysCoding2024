
package Days062;
import java.util.Scanner;
public class java {
    public static void main(String[] args) {
       // keyword break
       Scanner input = new Scanner(System.in);
        // Memasukkan nilai k
        System.out.print("Masukkan nilai k = ");
            int a = input.nextInt();
        
        if(a <= 0){
            System.out.println("k harus bernilai positif");
        }else {           
            while(true){
                int b = input.nextInt();
                
                if (b == 0){
                    System.out.println("Tidak ada kelipatan dari " + a);  
                    break;
                }
                if (b % a == 0 && b > 0){
                    System.out.println(b);
                    break;
                }
            }
        }
    }
}
