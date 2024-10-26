
package days055;
import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        //Looping for Increment
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        
        for(int i = a; i >= 1 ; i--){
            if(a % i == 0){
                System.out.print(i + " ");
            }      
            
        }
    }
    
}
