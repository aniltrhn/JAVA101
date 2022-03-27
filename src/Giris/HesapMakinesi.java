package Giris;
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz : ");
        n1 = input.nextInt();
        System.out.println(":İkinci Sayıyı Giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz : ");
        select = input.nextInt();

        if (select == 1) {
            System.out.println("Toplam : " + (n1 + n2));
        } else if (select == 2) {
            System.out.println("Çıkarma : " + (n1 - n2));
        } else if (select == 3) {
            System.out.println("Çarpma : " + (n1 * n2));
        } else if (select == 4) {
            if (n2 != 0) {
                System.out.println("Bölme : " + ((double) n1) / ((double) n2));

            } else {
                System.out.println("Bir Sayı 0'a Bölünemez!");
            }
        } else {
            System.out.println("Yanlış seçim yaptınız.Tekrar deneyiniz.");
        }
    }
}

