package Giris;

import java.util.Scanner;
public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfı tanımlandı
        Scanner inp = new Scanner(System.in);
        //kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya +turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız : " + sonuc);

        //ternary operator =  doğruysa sol yanlışsa sağı döndürür.
        //ifade şekli (koşul) ? Doğrunun sonucu : Yanlışın sonucu;
        String gectiMi = (sonuc>=60) ? "Geçtiniz." : "Kaldınız!";

        System.out.println(gectiMi);


    }

}
