import java.util.Scanner ;
public class main extends Jarak{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        System.out.println("HELLO");
        System.out.println("MY NAME IS EVINURIA FILUYUNISTIARA");
        System.out.println("Today we are going to learn about");
        System.out.println("JARAK PADA PETA");
        Jarak main;
        main = new Jarak();
        System.out.println("Masukkan Jarak Sebenarnya (cm) = ");
        main.JS = input.nextInt();
        System.out.println("Masukkan Skala = 1 : ");
        main.Skala = input.nextInt();
        main.jarak();
    }
}