package Giris;
import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double kilo,boy,indeks;

        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu Giriniz(kg):");
        kilo = input.nextDouble();
        System.out.print("Boyunuzu Giriniz(m):");
        boy = input.nextDouble();
        indeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);

    }
}
