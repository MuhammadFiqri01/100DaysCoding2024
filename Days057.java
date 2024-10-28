
package days057;
import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        
        if (a < 1) {
            System.out.println("Invalid input");
        } else {
            int b = 1;
            while (b <= a) {
                System.out.print(b + " ");
                b *= 2; 
            }
            System.out.println("");
        }
    }  
}
