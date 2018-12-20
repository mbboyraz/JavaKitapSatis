package bus.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sec;
        do {
            System.out.println("1.Üyelik\n2.Kitap Listesi\n3.Kitap Seçme\n4.Sipariş Oluşturma\n5.Kitap Satışı\n6.Ödeme\nYapmak istediğiniz işlemi seçiniz:");
            Scanner scanner = new Scanner(System.in);
            sec = Integer.parseInt(scanner.nextLine());

            switch (sec){
                case 1:
                    System.out.println("1.Üyelik\n");
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
