
public class Recursion {
	
	static int faktoriyel(int sayi) {
		if (sayi==1) {
			return 1;
		}
		else {
			return (sayi*(faktoriyel(sayi-1)));
		}		
	}
	static int toplamaHesapla(int sayi) {
		if (sayi==0) {
			return 0;
		}
		else {
			return (sayi+(faktoriyel(sayi-1)));
		}		
	}
	
	static int fibonacci(int s) {
		
		if (s<=1) {
			return s;
		}else {
			return fibonacci(s-1)+fibonacci(s-2);
			//0 1 1 2 3 5
		}
		
	}
	
	public static int hesapla(int x) {
		int deger = 1;
		for (int i = x; i > 0  ; i--) {
			deger*=i;
		}
		return deger;		
	}
	
	
	public static void main(String[] args) {		
		System.out.println(faktoriyel(5));
		System.out.println(hesapla(5));
		System.out.println(toplamaHesapla(5));
		System.out.println(fibonacci(80));
		
	}

}
