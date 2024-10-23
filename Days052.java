package days052;

import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        //Ternary
        Scanner input = new Scanner(System.in);
        System.out.print("Nilai mahasiswa = ");
        int a = input.nextInt();

        char b = ( a >= 70 && a <= 75 || a > 85 ) ? 'A':
                     ( a >= 60 && a <= 85 || a == 50 ) ? 'B' : 'C';
                   
        System.out.println("nilai akhirnya " + b);
    }
    
}
