/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buskutuphane;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mbura
 */
public class Odeme {
     String uyeAd,kitapAd;
    int fiyat;

    public Odeme(String uyeAd, String kitapAd, int fiyat) {
        this.uyeAd = uyeAd;
        this.kitapAd = kitapAd;
        this.fiyat = fiyat;
    }
 public void odemeTamam() throws IOException{
      File file = new File("odeme.txt");
        if (!file.exists()) {
            file.createNewFile();
             
        }
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(uyeAd + "  " + kitapAd + "  " + fiyat + "\n");
        bWriter.close();
 }
   
    
}
