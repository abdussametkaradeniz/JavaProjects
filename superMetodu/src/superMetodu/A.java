package superMetodu;

public class A {
	
	/*public A() {
		
		System.out.println("A classinin yapici metodu cagirildi");
		
	}*/
	int x;
	String isim;
	
	public A(int a) {
		System.out.println("tek parametreli yapici calisti "+a);
	}
	public A(int a,String b) {
		x=a;
		isim=b;
		
	}
	void yazdir() {
		System.out.println("isim "+isim+" sayi "+x);
	}
	
}
