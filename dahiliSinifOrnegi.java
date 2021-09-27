import java.util.ArrayList;

public class dahiliSinifOrnegi {
    
    public class AsalSayi{
        public boolean AsalSayiMidir(int sayi){
            boolean sonuc = false;
            int bolen = 0;

            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0){
                    bolen++;
                }
            }

            if (bolen == 0){
                sonuc = true;
            }else
                sonuc = false;

            return sonuc;
        }
    }
   
    
    protected class MukemmelSayi{
        protected boolean MukemmelSayiMidir(int sayi){
            int bolenToplam = 0;
            boolean sonuc;

            for (int i = 1; i < sayi ; i++) {
                if (sayi % i == 0){
                    bolenToplam+=i;
                }
            }
            if ( bolenToplam == sayi){
                sonuc = true;
            }else{
                sonuc = false;
            }
            return sonuc;
        }
    }


    private class Fibonacci{
        private ArrayList fibonacciSerisi(int elemanSayisi){
            ArrayList<Integer> fibonacci = new ArrayList<Integer>();
            fibonacci.add(0,1);
            fibonacci.add(1,1);
            for (int i = 0; i < elemanSayisi - 2; i++) {
                fibonacci.add(i+2,fibonacci.get(i)+fibonacci.get(i+1));
            }
            return fibonacci;
        }
    }


    public static void main(String[] args) {
        dahiliSinifOrnegi.AsalSayi d1 = new dahiliSinifOrnegi().new AsalSayi();
        dahiliSinifOrnegi.Fibonacci f1 = new dahiliSinifOrnegi().new Fibonacci();
        dahiliSinifOrnegi.MukemmelSayi m1 = new dahiliSinifOrnegi().new MukemmelSayi();

        System.out.println(d1.AsalSayiMidir(17));
        System.out.println(f1.fibonacciSerisi(9));
        System.out.println(m1.MukemmelSayiMidir(25));


    }


}
