
package Days070;
public class java {
    // Method Parameter
    public static int hitungLuasPersegiPanjang(int panjang, int lebar) {
        int a = panjang * lebar;
        return a;
    }
    public static void tampilkanHasil(int panjang, int lebar) {
        int a = hitungLuasPersegiPanjang(panjang, lebar);
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas Persegi Panjang: " + a);
    }
    public static void main(String[] args) {
        tampilkanHasil(10,5);
        tampilkanHasil(7,3);
    }
}
