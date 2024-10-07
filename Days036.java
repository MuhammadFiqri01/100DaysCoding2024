
package days036;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        //Operator Aritmatika : Perkalian, Pembagian serta Modulo
        Scanner sa = new Scanner(System.in);
         System.out.print("Masukkan harga satu barang : ");
        float a = sa.nextFloat();
        System.out.print("Masukkan jumlah barang yang ingin dibeli : ");
        int b = sa.nextInt();
        System.out.print("Masukkan persentase diskon : ");
        double c = sa.nextDouble();
        System.out.print("Masukkan jumlah uang yang anda miliki : ");
        float d = sa.nextFloat();
        float totalsebelum = a*b;
        double totaldiskon = totalsebelum * (c/100);
        double totalsetelah = totalsebelum - totaldiskon;
        double sisaSetelahBayar = d - totalsetelah;
        double tidakDapatDibagiRp50k = sisaSetelahBayar % 50000;
       System.out.println("Total harga sebelum diskon: " + totalsebelum);
       System.out.println("Total harga setelah diskon: " + totalsetelah);
       System.out.println("Sisa uang setelah pembayaran: " + sisaSetelahBayar);
       System.out.println("Sisa uang yang tidak dapat dibagi dalam pecahan Rp50.000: " + tidakDapatDibagiRp50k);
        
    }
    
}
