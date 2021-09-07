package metodOverriding;

public class SinifB extends SinifA {

	int z;
	SinifB(int i, int j,int k) {
		
		super(i, j);
		z=k;
		
	}
	
	void yazdir(String yazi) {
		
		System.out.println(yazi + z);
		
	}
	
/*
	public String metot() {
		
		return isim+sayi+isim;
		
	}
	*/
	
	
	
	
	
	
}
