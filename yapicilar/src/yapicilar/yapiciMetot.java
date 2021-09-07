package yapicilar;

public class yapiciMetot {
	//int deger1,deger2;	

	void metot1() {		
		System.out.println("parametre olmayan metot cagirildi");		
	}

	void metot2(int sayi1) {		
		System.out.println("parametre alan metot cagirildi");		
	}
	
	static int sayi = 0;
	
	public yapiciMetot() {		
		//deger1=5;
		//metot1();			
		sayi++;		
	}
	public yapiciMetot(int sayi) {		
		//deger2=sayi;
		//metot2(sayi);		
	}
		
	
	public static void dongu(yapiciMetot nesne[]) {
		for (int i = 0; i < nesne.length; i++) {
			nesne[i]=new yapiciMetot();
		}
		
	}
	
	
	public static void main(String[] args) {
		/*yapiciMetot m1 = new yapiciMetot();
		yapiciMetot m2 = new yapiciMetot(10);		
		System.out.println("ilk nesnenin degeri "+m1.deger1);
		System.out.println("ikinci nesnenin degeri "+m2.deger2);*/	
		/*yapiciMetot a1 = new yapiciMetot();
		System.out.println("-----------------------");
		yapiciMetot a2 = new yapiciMetot(15);*/
		
		yapiciMetot nesne[] = new yapiciMetot[4];
		yapiciMetot.dongu(nesne);
		System.out.println(sayi+" adet nesne olusturuldu");
		

		
	}

}
