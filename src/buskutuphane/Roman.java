package buskutuphane;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Roman extends Kitap {

    String ad,yazarAd;
    public Roman(String ad,String yazarAd) {
        this.ad = ad;
        this.yazarAd = yazarAd;
      
    }
    
    public void kitapEkle() throws IOException{
         File file = new File("kitap.txt");
        if (!file.exists()) {
            file.createNewFile();
             
        }
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(ad + "-" + yazarAd +"-" + tur() +"-" + fiyat() + "\n");
        bWriter.close();
        
    }

    @Override
    public String tur() {
        return "Roman";
    }

    @Override
    public int fiyat() {
        return 20;
    }

    
    
}
