
package days064.java;

public class NewClass {
    public static void main(String[] args) {
         outerLoop: 
            for (int j = 1; j <= 5; j++) {
                System.out.println( j );
                if (j == 3) {
                    System.out.println(" break pada " + j);
                    break outerLoop;
                }
            }
        System.out.println("Program selesai.");
    }
}
