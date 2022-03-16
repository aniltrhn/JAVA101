package Giris;
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total, start = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi Km Cinsinden Giriniz : ");
        km = input.nextInt();
        total = start + (km * perKm);

        total = (total<20) ? 20 : total;
        System.out.println("Toplam Tutar : "+ total);




    }
}
