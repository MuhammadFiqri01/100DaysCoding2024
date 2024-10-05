
package days034;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        // input dari keyboard
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Umur : ");
        byte umur = input.nextByte();
        System.out.print("Masukkan Jenis Kelamin : ");
        char jeniskelamin = input.next().charAt(0);
        System.out.print("Masukkan Tinggi Badan : ");
        float tinggi = input.nextFloat();
        System.out.print("Apakah Anda Sudah Menikah : ");
        boolean status = input.nextBoolean();
        System.out.println("\nFormulir Pendaftaran");
        System.out.println("====================");
        System.out.println("Nama            : " + nama);
        System.out.println("Umur            : " + umur + " Tahun");
        System.out.println("Jenis Kelamin   : " + jeniskelamin);
        System.out.println("Tinggi Badan    : " + tinggi + " Cm");
        System.out.println("Status          : " + status);
        
        
    }
    
}
