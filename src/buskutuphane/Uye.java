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
import java.util.Scanner;

/**
 *
 * @author mbura
 */
public class Uye{
    String ad;
    String adres;

    public Uye(String ad, String adres) {
        this.ad = ad;
        this.adres = adres;
    }

    public void uyeEkle() throws IOException{
        File file = new File("uyeler.txt");
        if (!file.exists()) {
            file.createNewFile();
             
        }
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(ad + "  " + adres + "\n");
        bWriter.close();
     
    }


}
