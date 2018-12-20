package buskutuphane;

public class Ansiklopedi extends Kitap {

    public Ansiklopedi(int id,String ad,String yazar,boolean cilt) {
       yazar(yazar);
       ad(ad);
       cilt(cilt);
       fiyatCiltli();
       fiyatCiltsiz();
    }

    public String ekleAnsiklopedi(String ad,String yazar){
        
        return "0";
    }
    @Override
    public String yazar(String ad) {
        return ad;
    }

    @Override
    public int fiyatCiltli() {
        return 30;
    }

    @Override
    public int fiyatCiltsiz() {
        return 20;
    }

    @Override
    public boolean cilt(boolean cilt) {
        return cilt;
    }

    @Override
    public String ad(String ad) {
        return ad;
    }
}
