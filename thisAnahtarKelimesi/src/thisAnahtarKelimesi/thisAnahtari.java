package thisAnahtarKelimesi;

public class thisAnahtari {
	String ad;
	String soyad;
	
	/*public void degistir(String ad) {
		
		this.ad=ad;
		
	}*/
	
	public thisAnahtari(String ad) {
		this(ad,"karadeniz");
	}
	public thisAnahtari(String ad,String soyad) {
		System.out.println(ad+" "+soyad);
	}
	
	
	public static void main(String[] args) {
		//thisAnahtari t1 = new thisAnahtari();
		//t1.degistir("karadeniz");
		//System.out.println(t1.ad);
		
		thisAnahtari t1 = new thisAnahtari("abdussamet");
	}

}
