package superMetodu;

public class B extends A{

	public B() {
		
		super(8);
		//System.out.println("b classinin yapici metodu cagirildi");
		
	}
	
	
	public static void main(String[] args) {
		
		B nesne = new B();
		nesne.yazdir();
		
	}

}
