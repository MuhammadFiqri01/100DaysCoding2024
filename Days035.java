
package days035;
import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        // operator aritmatika penjumlahan dan pengurangan
        Scanner ac = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Uang Awal : ");
        byte a = ac.nextByte();
         System.out.print("Masukkan Pengeluaran Pertama : ");
        byte b = ac.nextByte();
         System.out.print("Masukkan Pemasukan Pertama : ");
        byte c = ac.nextByte();
         System.out.print("Masukkan Pengeluaran Kedua : ");
        byte d = ac.nextByte();
         System.out.print("Masukkan Pemasukan Kedua : ");
        byte e = ac.nextByte();
        System.out.println("Total Keseluruhan Uang Sekarang : " +(a-b+c-d+e));
        
    }
    
}
