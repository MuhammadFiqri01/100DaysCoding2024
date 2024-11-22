package days082;
import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        //Method ceil(), floor() dan round()
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka desimal = ");
        double a = input.nextDouble();

        double b = Math.ceil(a);
        double c = Math.floor(a);
        long d = Math.round(a);

        System.out.println("Angka asli = " + a);
        System.out.println("Math.ceil() = " + b + " (dibulatkan ke atas)");
        System.out.println("Math.floor() = " + c + " (dibulatkan ke bawah)");
        System.out.println("Math.round() = " + d + " (dibulatkan ke nilai terdekat)");
        
    }
    
}
