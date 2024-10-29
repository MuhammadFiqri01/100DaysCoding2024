
package days058;

import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // looping while decrement
         int a = input.nextInt();

        if (a < 1) {
            System.out.println("Invalid input");
        } else {
            while (a >= 1) {
                System.out.print(a + " ");
                
                if (a % 2 == 0) {
                    a -= 2; 
                } else {
                    a -= 1; 
                }
            }
            System.out.println("1");
        }
    }
}
