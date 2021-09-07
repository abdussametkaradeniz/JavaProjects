package passbyvalueVEpassbyreference;

public class mainClass {
	
	int x;
	
	public static void main(String[] args) {
		int a = 5;
		System.out.println("ilk deger "+a);
		degistir(a);
		System.out.println("son deger "+a);
		
		mainClass m1 = new mainClass();
		m1.x=10;
		System.out.println("ilk deger "+m1.x);
		m1.degistir2(m1);
		System.out.println("son deger "+m1.x);
		
		int[] dizi= {1,2,3,4,5};
		System.out.println("ilk deger "+dizi[0]);
		degistir3(dizi);
		System.out.println("son deger "+dizi[0]);
		
		
	}	
	
	static void degistir3(int[] dizi) {
		dizi[0]=dizi[0]+10;		
	}

	void degistir2(mainClass m1) {		
		m1.x=m1.x+10;		
	}

	static void degistir(int a) {
		a=a+10;		
	}

	 
}
