import static java.lang.Math.*;
public class StaticAnahtarKelimesi {
	private String ad;
	private String soyad;
	private String cinsiyet;
	public static int sayi = 0;
	
	public static String isim="ardent";
	
	public static String isimGetir() {
		
		return isim;
		
	}
	
	
	public StaticAnahtarKelimesi(String ad,String soyad, String cinsiyet) {
		this.ad=ad;
		this.soyad=soyad;
		this.cinsiyet=cinsiyet;
		sayi+=10;		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("en bastaki sayi degiskeni = "+StaticAnahtarKelimesi.sayi);
		
		StaticAnahtarKelimesi n1 = new StaticAnahtarKelimesi("abdussamet","karadeniz","Erkek");
		StaticAnahtarKelimesi n2 = new StaticAnahtarKelimesi("ali","alkan","Erkek");
		StaticAnahtarKelimesi n3 = new StaticAnahtarKelimesi("gizem","alkan","Kadin");
		StaticAnahtarKelimesi n4 = new StaticAnahtarKelimesi("ismet","inonu","Erkek");
		
		System.out.println("en sondaki sayi degiskeni = "+StaticAnahtarKelimesi.sayi);
		
		System.out.println(isimGetir());
		
		System.out.println("5 uzeri 2 : "+pow(5,2));

	}

}
