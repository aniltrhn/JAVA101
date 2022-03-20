package Giris;
import java.util.Scanner;
public class DaireninAlani {
    public static void main(String[] args) {
      int r;
      double pi = 3.14;

        System.out.print("Yarıçapı giriniz : ");


      Scanner input = new Scanner(System.in);
      r = input.nextInt();
      double alan = pi * r * r;
      double cevre = 2 * pi * r ;

        System.out.print("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);





    }
}
