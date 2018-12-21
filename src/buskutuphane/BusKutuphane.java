/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buskutuphane;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mbura
 */
public class BusKutuphane{
static String uyeAd,uyeAdres,kitapAd,kitapYazar,tur,secilenKitap;
static int fiyat;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         int sec;
         ArrayList<Roman> kitaplar = new ArrayList<>();
         String[] kitap = new String[4];
          File file;
          BufferedReader reader = null;
          String satir;
        do {
            System.out.println("1.Üyelik\n2.Kitap Listesi\n3.Kitap Seçme\n4.Sipariş Oluşturma\n5.Kitap Satışı\n6.Ödeme\nYapmak istediğiniz işlemi seçiniz:");
            Scanner scanner = new Scanner(System.in);
            sec = Integer.parseInt(scanner.nextLine());

            switch (sec){
                case 1:
                    System.out.println("1.Üyelik\n");
                    
                        System.out.println("Üye Kaydı\nAd Giriniz:");
                        uyeAd = scanner.nextLine();
                        System.out.println("\nAdres Giriniz:");
                        uyeAdres = scanner.nextLine();
                        Uye uye = new Uye(uyeAd,uyeAdres);
                        uye.uyeEkle();
                        System.out.println("\n"+ uyeAd + " üye eklendi");
                    
                    break;
                case 2:
                   System.out.println("2.Kitap Listesi\n");
                   System.out.println("Kitap Adi - Yazar Adi - Tur - Fiyat\n");
                    file = new File("kitap.txt");
                    reader = null;
                    reader = new BufferedReader(new FileReader(file));
                    satir = reader.readLine();
                        
                    while (satir!=null) {
                        System.out.println(satir);
                        satir = reader.readLine();
                        
                        
                    }
                    break;
                case 3:
                    System.out.println("3.Kitap Seçme\n");
                    System.out.println("Secmek istediginiz kitabin adini eksiksiz giriniz\n");
                    kitapAd = scanner.nextLine();
                    file = new File("kitap.txt");
                    reader = new BufferedReader(new FileReader(file));
                      satir = reader.readLine();
                    while (satir!=null) {
                         kitap = satir.split("-");
                        if(kitapAd.matches(kitap[0])){
                            System.out.println("secilen kitap : " +kitap[0] +" ücret:"+kitap[3]);
                            break;
                        }else{
                        System.out.println(satir);
                        satir = reader.readLine();
                        }
                    }
                    
                    
                    break;
                case 4:
                    System.out.println("4.Sipariş Oluşturma\n");
                    SiparisOlustur siparis = new SiparisOlustur(uyeAd, kitap[0], Integer.parseInt(kitap[3]));
                    siparis.SiparisOlustur();
                    break;
                case 5:
                    System.out.println("5.Kitap Satışı\n");
                    break;
                case 6:
                    System.out.println("6.Ödeme\n");
                    Odeme odeme = new Odeme(uyeAd, kitap[0], Integer.parseInt(kitap[3]));
                    odeme.odemeTamam();
                     System.out.println("Odeme tamamlandi");
                    break;

                case 7:
                     System.out.println("2.Kitap ekle\n");
                     System.out.println("Kitap Kaydı\nAd Giriniz:");
                       kitapAd = scanner.nextLine();
                        System.out.println("\nYazar Adı Giriniz:");
                       kitapYazar = scanner.nextLine();
                       System.out.println("\nTur Adı Giriniz: (hikaye veya roman)");
                       tur = scanner.nextLine();
                       if(tur.matches("roman")){
                           Roman roman = new Roman(kitapAd,kitapYazar);
                           roman.kitapEkle();
                       }else if(tur.matches("hikaye")){
                           Hikaye hikaye = new Hikaye(kitapAd,kitapYazar);
                           hikaye.kitapEkle();
                       }else{
                           System.out.println("yanlış tür");
                       }
                       break;
            }
        }while (sec!=0);
    }



    

   
    
}
