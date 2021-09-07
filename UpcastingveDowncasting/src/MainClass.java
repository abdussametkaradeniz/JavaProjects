
public class MainClass {

	public static void main(String[] args) {
		
		/*Canli c = new Canli();
		c.yazdir();
		
		Hayvan h = new Hayvan();
		h.yazdir();
		
		Omurgali o = new Omurgali();
		o.yazdir();
		
		Omurgasiz o2 = new Omurgasiz();
		o2.yazdir();*/
		
		/*Canli c = new Canli(); //(upcasting 1)
		c.yazdir();
		
		Canli c1 = (Canli) new Hayvan(); //(upcasting 2)
		c1.yazdir();
		
		Hayvan h1 = (Hayvan) new Omurgali();//(upcasting 3)
		h1.yazdir();
		
		Hayvan h2 = (Hayvan) new Omurgasiz();//(upcasting 4)
		h2.yazdir();*/
		
		Hayvan h1 = new Hayvan();
		Canli c = h1; //upcasting
		
		Hayvan h2 = (Hayvan) c ;  //downcasting
		h2.yazdir();
		
		Omurgali o1 = new Omurgali();
		Hayvan h3 = o1; //upcasting
		Omurgali o2 = (Omurgali) h3;
		o2.yazdir();
		
		
	}

}
