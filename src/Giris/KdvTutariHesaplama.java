package Giris;
import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOran, kdv1 = 0.18, kdv2 = 0.08;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();
        kdvOran = ( tutar >= 1000 ) ? kdv2:kdv1;
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar :" + tutar);
        System.out.println("KDV Oranı :" + kdvOran);
        System.out.println("KDV Tutarı :" + kdvTutar);
        System.out.println("KDV'li Tutar :" + kdvliTutar);







    }
}
