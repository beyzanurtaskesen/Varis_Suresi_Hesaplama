
import java.util.Scanner;
public class Varis_Suresi {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int yol,saat;
        System.out.println("Yol mesafesini giriniz : " + "(km)");
        yol = scanner.nextInt();
        System.out.println("Gitmek istediğiniz süreyi giriniz :  " + "(saat)");
        saat = scanner.nextInt();
        System.out.println(" Gitmeniz gereken  ortalama hız " + (yol/saat)+ " (km/sn)");
    }
}
