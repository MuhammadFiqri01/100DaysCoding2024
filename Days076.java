
package days076;

import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        //String Method toUpperCase()
        Scanner input = new Scanner(System.in);   
        System.out.print("Masukkan kata = ");
        String d = input.nextLine();
        int a = 0;
        int b = 0;  
        for (int i = 0; i < d.length(); i++) {
            char c = d.charAt(i);
            if (Character.isUpperCase(c)) {
                a++;
            } else if (Character.isLowerCase(c)) {
                b++;
            }
        }
        String e;
        if ( a > b ) {
            e = d.toUpperCase(); 
        } else {
            e = d.toLowerCase(); 
        }
        System.out.println("Hasil perubahan = " + e);
    }
}
