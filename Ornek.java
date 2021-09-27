public class Ornek {
    public double faktoriyelAl(double sayi){
        //yerel sinifi cevreleyen metot
        double sonuc;
        class faktoriyelAlma implements Fonksiyonlar{
            //yerel sinif
            private double sonuc2 = 1;
            @Override
            public double faktoriyelAl(double sayi2){
                for (int i = 1; i <= sayi2; i++) {
                    sonuc2 = sonuc2*i;
                }
                return sonuc2;
            }           
        }
        faktoriyelAlma f1 = new faktoriyelAlma();
        sonuc = f1.faktoriyelAl(sayi);
        return sonuc;
    }

    public void hesaplama(){
        //faktoriyelAlma f2 = new faktoriyelAlma();
        //sinifimizi tanimadigindan dolayi hata veriyor bu islem gerceklesmiyor
    }

    public static void main(String[] args) {
        Ornek y = new Ornek();
        System.out.println("5 sayisinin faktoriyeli = " + y.faktoriyelAl(5));
    }

}
interface Fonksiyonlar{
    public double faktoriyelAl(double sayi);
}
