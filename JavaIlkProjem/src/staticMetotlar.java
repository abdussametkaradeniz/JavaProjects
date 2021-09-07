
public class staticMetotlar {
	public static int x;
	
	public static void metot(int a) {
		
		x = a;
	}
	
	public static void main(String[] args) {
		/*int a =3, b = 4;
		System.out.println((int)Math.pow(a, b));*/
		staticMetotlar s1 = new staticMetotlar();
		staticMetotlar s2 = new staticMetotlar();
		s1.metot(5);
		s2.metot(7);
		System.out.println(s1.x);
		System.out.println(s2.x);
		
	}

}
