class Insan{
    private String isim;
    private int maas;

    public Insan(){

    }    

    public Insan(String isim,int maas){
        this.isim=isim;
        this.maas=maas;
    }

    public String getIsim(){
        return this.isim;
    }

    public int getMaas(){
        return this.maas;
    }

    public void setIsim(String isim){
        this.isim=isim;
    }
    public void setMaas(int maas){
        this.maas=maas;
    }

    public void bilgiVer(){
        System.out.println("isim bilgisi = "+getIsim()+" maas bilgisi = "+getMaas()+" tldir.");
    }
}
class Mudur extends Insan{

    public Mudur(String isim, int maas) {
        super(isim, maas);   
    }

    @Override
    public void bilgiVer() {
        System.out.println("isim bilgisi = "+getIsim()+" maas bilgisi = "+getMaas()+" tldir.");
    }

}
class Asistan extends Insan{

    public Asistan(String isim, int maas) {
        super(isim, maas);      
    }

    @Override
    public void bilgiVer() {
        System.out.println("isim bilgisi = "+getIsim()+" maas bilgisi = "+getMaas()+" tldir.");
    }

}

public class polymorphism2 {

    public static void nesneAl(Insan nesne){
        nesne.bilgiVer();
    }

    public static void main(String[] args) {
       Insan i1 = new Insan();
       Mudur m1 = new Mudur("abdussamet", 3000);
       Asistan a1 = new Asistan("ozge", 2000);

       nesneAl(i1);
       nesneAl(m1);
       nesneAl(a1);

       Insan[] i2 = new Insan[2];
       for (int i = 0; i < i2.length; i++) {
           int indis = (int)(Math.random()*2);
           switch(indis){
               case 0:
               i2[indis]=new Mudur("mudur", 10000);
               nesneAl(i2[indis]);
               break;
               case 1:
               i2[indis]= new Asistan("asistan", 2000);
               nesneAl(i2[indis]);
               break;
           }
       }


    }

    
}
