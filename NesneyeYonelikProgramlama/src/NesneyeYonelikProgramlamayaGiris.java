
public class NesneyeYonelikProgramlamayaGiris {

	public static void main(String[] args) {
		Insan ali = new Insan();
		Insan veli = new Insan();
		
		ali.boy=2;
		ali.cinsiyet="Erkek";
		ali.yas=15;
		
		Araba araba = new Araba();
		Araba araba2 = new Araba();
		Araba raba = new Araba();
		
		araba.freneBas();
		araba.gazaBas();
		raba.vitesDegistir();
		
		araba.renk="kirmizi";
		araba.silindirSayisi=8;
		araba.model=1998;
		
		matematikselIslemler m1 = new matematikselIslemler();
		int sayi = m1.cikarma(8, 1);
		int sayi2 = m1.toplama(5, 6);
		int sonuc = m1.toplama(sayi, sayi2);
		System.out.println(sonuc);
		System.out.println(sayi);
		System.out.println(sayi2);
		System.out.println(m1.cikarma(8, 1));
		
		

	}

}
