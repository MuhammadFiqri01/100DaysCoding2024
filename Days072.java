
package days072;

public class java {
     // Method rekursif 
    public static int a (int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * a (n - 1);
        }
    }
    public static void main(String[] args) {
        int angka = 5;
        int hasil = a (angka);
        System.out.println("Faktorial dari " + angka + " adalah= " + hasil);
    }
}
