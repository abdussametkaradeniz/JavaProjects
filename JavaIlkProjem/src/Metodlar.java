public class Metodlar {

	public static void main(String[] args) {		
		ekranaYaz();
		islemYap();
		
		/*int sayiTutanDegisken =  sayiDondur();
		System.out.println(sayiTutanDegisken);
		String stringTutanDegisken=stringDondur();
		System.out.println(stringTutanDegisken);*/
		
		System.out.println(sayiDondur());
		System.out.println(stringDondur());
		
		
		
		int c =6; 	
		
	}
	
	public static int sayiDondur() {
		
		return 5*2;		
							
	}
	public static String stringDondur() {
		
		String isim= "abdussamet";
		String Soyisim="karadeniz";
		String isimSoyisim=isim+Soyisim;		
		return isimSoyisim;
		
	}
	
	public static void ekranaYaz() {
		
		System.out.println("bu bizim ilk metodumuz.");
		
	}
	public static void islemYap() {
		
		System.out.println(8*9);
				
	}
	

}
