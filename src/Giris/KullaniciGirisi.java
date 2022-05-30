package Giris;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, kayitliUserName, kayitliPassword, girilenUserName , girilenPassword , yeniPassword;
        kayitliUserName = "";
        kayitliPassword = "";
        int sifreYenilemeSecimi;
        boolean loginUserNameCheck;
        boolean loginPasswordCheck;
        boolean hasQuit = false;


        while (!hasQuit) {
            System.out.print("Hoşgeldiniz...\n" +
                    "\n1) Giriş Yap.\n " +
                    "2) Kayıt Ol.\n " +
                    "3) Çıkış Yap.\n " +
                    "\nLütfen Seçiminizi Belirtiniz : \n");
            Scanner input = new Scanner(System.in);
            int secim = input.nextInt();
            input.nextLine();

            switch (secim) {

                case 1:
                    System.out.print("Kullanıcı Adı : ");
                    girilenUserName = input.nextLine();
                    loginUserNameCheck = (kayitliUserName.equals(girilenUserName));

                    if (!loginUserNameCheck) {
                        System.out.println("Kullanıcı Adı Bulunamadı!\n" + "Lütfen Kayıt Olunuz.\n");
                    }

                    if (loginUserNameCheck) {
                        System.out.print("Şifrenizi Giriniz : ");
                        girilenPassword = input.nextLine();
                        loginPasswordCheck = (kayitliPassword.equals(girilenPassword));
                        System.out.println(loginPasswordCheck ? "Giriş Başarılı." : "");
                        if (!loginPasswordCheck) {
                            System.out.println("Şifreniz Yanlış!\n" +
                                    "Şifrenizi Sıfırlamak İster Misiniz?\n" +
                                    "1)Evet.\n" +
                                    "2)Hayır.Yeni Kayıt Oluştur.\n");
                            sifreYenilemeSecimi = input.nextInt();
                            input.nextLine();
                            if (sifreYenilemeSecimi == 1) {
                                System.out.print("Yeni Şifre : ");
                                yeniPassword = input.nextLine();
                                if (yeniPassword.equals(kayitliPassword)) {
                                    System.out.println("Yeni şifre ile eski şifreniz aynı olamaz.Lütfen farklı bir şifre giriniz");
                                    System.out.println("Yeni şifre oluşturunuz : ");
                                    yeniPassword = input.nextLine();
                                    System.out.println("Şifreniz başarıyla oluşturuldu.");
                                }

                                kayitliPassword = yeniPassword;
                            }
                            if (sifreYenilemeSecimi == 2) {
                                secim = 2;
                            }

                        }
                    }
                    break;
                case 2:

                    System.out.print("Yeni kullanıcı adınız :");
                    userName = input.nextLine();
                    while (userName == kayitliUserName) {
                        System.out.println("Kullanıcı adı kayıtlı. Başka bir kullanıcı adı giriniz : ");
                        userName = input.nextLine();
                    }
                    kayitliUserName = userName;
                    System.out.println("Yeni şifre : ");
                    password = input.nextLine();
                    System.out.println("Kayıt başarıyla gerçekleşti.");
                    while (password == kayitliPassword) {
                        System.out.println("Kullanıcı adı daha önceden alınmış.Lütfen yeni kullanıcı adı giriniz : ");
                    }
                    kayitliPassword = password;
                    break;
                case 3:
                    hasQuit = true;


            }

        }
    }
}