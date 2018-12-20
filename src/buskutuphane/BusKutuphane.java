/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buskutuphane;

import java.util.Scanner;

/**
 *
 * @author mbura
 */
public class BusKutuphane{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int sec;
         String uyeAd,uyeAdres;
        do {
            System.out.println("1.Üyelik\n2.Kitap Listesi\n3.Kitap Seçme\n4.Sipariş Oluşturma\n5.Kitap Satışı\n6.Ödeme\nYapmak istediğiniz işlemi seçiniz:");
            Scanner scanner = new Scanner(System.in);
            sec = Integer.parseInt(scanner.nextLine());

            switch (sec){
                case 1:
                    System.out.println("1.Üyelik\n");
                    do{
                        System.out.println("Üye Kaydı\nAd Giriniz:");
                        uyeAd = scanner.nextLine();
                        System.out.println("\nAdres Giriniz:");
                        uyeAdres = scanner.nextLine();
                        
                        
                    }while(sec!=0);
                    break;
                case 2:
                    System.out.println("2.Kitap Listesi\n");
                    break;
                case 3:
                    System.out.println("3.Kitap Seçme\n");
                    break;
                case 4:
                    System.out.println("4.Sipariş Oluşturma\n");
                    break;
                case 5:
                    System.out.println("5.Kitap Satışı\n");
                    break;
                case 6:
                    System.out.println("6.Ödeme\n");
                    break;

            }
        }while (sec!=0);
    }

   
    
}
