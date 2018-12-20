package buskutuphane;

public class Roman extends Kitap {

    public Roman(int id,String ad,String yazar,boolean cilt) {
       yazar(yazar);
       ad(ad);
       cilt(cilt);
       fiyatCiltli();
       fiyatCiltsiz();
    }

    @Override
    public String yazar(String ad) {
        return ad;
    }

    @Override
    public int fiyatCiltli() {
        return 20;
    }

    @Override
    public int fiyatCiltsiz() {
        return 10;
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
