package metodOverriding;

public class Calistir {

	public static void main(String[] args) {
		//SinifB b1 = new SinifB();
		//System.out.println(b1.metot());
		/*SinifA a1 = new SinifA();
		System.out.println(a1.metot());*/
		
		
		SinifB b1 = new SinifB(6,1,8);
		b1.yazdir("hebele hubele ");
		b1.yazdir();

	}

}
