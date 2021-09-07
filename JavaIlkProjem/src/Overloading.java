
public class Overloading {

	static int metot1(int sayi) {
		
		return sayi;
	}
	static int metot1(int sayi1,int sayi2) {
		
		return sayi1;
	}
	static int metot1(int sayi,double sayi2) {
		
		return sayi;
	}
	static int metot1(double sayi2,int sayi) {
		
		return sayi;
	}
	
	public static void main(String[] args) {
		System.out.println(metot1(11));
		System.out.println(metot1(21, 30));

	}

}
