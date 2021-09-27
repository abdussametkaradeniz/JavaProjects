public class isimsizSiniflar {
    public faktoriyel faktoriyelAl(final double sayi){
        return new faktoriyel(){
            //arayuz icerisindeki metotlari kullanabilmek icin bir isimsiz sinif olusturduk          
            @Override
            public double hesapla(){
                double a = 1;
                for (int i = 1; i <= sayi; i++) {
                    a*=i;                                     
                }
                return a; 
            }
        };   //noktali virgul acildi
    }

    public static void main(String[] args) {
        isimsizSiniflar i1 = new isimsizSiniflar();
        faktoriyel faktoriyel1 = i1.faktoriyelAl(5);
        System.out.println("5 in faktoriyeli = " + faktoriyel1.hesapla());
    }

}

interface faktoriyel{
    public double hesapla();
}
