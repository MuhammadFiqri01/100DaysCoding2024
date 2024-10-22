
package days051;

import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        //Switch Case
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan hasil lemparan dadu = ");
        int dadu = input.nextInt();
        
        System.out.print("Masukan hasil kartu yang ditarik = ");
        int kartu = input.nextInt();
        
        switch (dadu){
            case 1:
            case 2:
                if(kartu >= 1 && kartu <= 5) System.out.println("Firebal");
                else if(kartu >= 6 && kartu <= 10)System.out.println("Lightning Bolt");
                else if (kartu >=11 && kartu <= 13)System.out.println("teleportation");
                break;
            case 3:
            case 4:
                if (kartu >= 1 && kartu <=3)System.out.println("Ice shard");
                else if(kartu >=4 && kartu <= 8)System.out.println("Wind Blast");
                else if(kartu >=9 && kartu <=13)System.out.println("Earthquake");
                break;
            case 5:
            case 6:
                if(kartu >= 1 && kartu <= 7)System.out.println("Water wave");
                else if(kartu >=8 && kartu <=13)System.out.println("Stone wall");
                break;
            default:
                System.out.println("Nilai dadu maupun kartu tidak valid");
        }
    }
 
}
  
