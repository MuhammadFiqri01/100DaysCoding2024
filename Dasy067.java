
package Days067;
import java.util.Scanner;
public class java {
    //Method Void
    public static void konversiKeMenit(int detik) {
        int menit = detik / 60;
        System.out.println(detik + " detik sama dengan " + menit + " menit");
    }
    public static void konversiKeJam(int detik) {
        int jam = detik / 3600;
        System.out.println(detik + " detik sama dengan " + jam + " jam");
    }
    public static void konversiKeHari(int detik) {
        int hari = detik / 86400;
        System.out.println(detik + " detik sama dengan " + hari + " hari");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai waktu dalam detik = ");
        int detik = input.nextInt();
        System.out.print("Masukkan jenis waktu = ");
        String jenisKonversi = input.next();
        switch (jenisKonversi.toLowerCase()) {
            case "menit":
                konversiKeMenit(detik);
                break;
            case "jam":
                konversiKeJam(detik);
                break;
            case "hari":
                konversiKeHari(detik);
                break;
            default:
                System.out.println("Jenis konversi tidak valid ");
        }
    }  
}
