package Giris;
import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double Armut = 2.14, Elma = 3.67, Domates = 1.11, Muz= 0.95,Patlican = 5;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        armutKg = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elmaKg = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        domatesKg = input.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        muzKg = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKg = input.nextDouble();

        System.out.println("Toplam Tutar : "
                + ((armutKg * Armut)
                + (elmaKg * Elma)
                + (domatesKg * Domates)
                + (muzKg * Muz)
                + (patlicanKg * Patlican))+ " TL ");









    }
}
