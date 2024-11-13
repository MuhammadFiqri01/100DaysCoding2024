
package days073.java;
public class Days073Java {
    public static void main(String[] args) {
        String a = "Belajar Java Programming";
        char b = a.charAt(0);   
        char c = a.charAt(4); 
        char d = a.charAt(a.length() - 1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("\nMencetak semua karakter dalam String = ");
        for (int i = 0; i < a.length(); i++) {
            System.out.println("Karakter pada indeks " + i + "= " + a.charAt(i));
        }
        try {
            char e = a.charAt(100); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("\nKesalahan = Indeks di luar batas " + e.getMessage());
        }
    }
}
