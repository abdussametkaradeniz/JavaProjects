
public class MainClass {
	static int d=5; //sinif degiskeni
	static int de;
	int deg;
	//static var degisken1 = 30;
	//var degisken = 50;
	public static void main(String[] args) {
		MainClass m1 = new MainClass();
		MainClass m2 = new MainClass();
		System.out.println(m1.d);
		System.out.println(m2.d);
		
		m1.de=9;
		m2.de=10;
		System.out.println(m1.de);
		System.out.println(m2.de);
		
		m1.deg=15;
		m2.deg=20;
		System.out.println(m1.deg);
		System.out.println(m2.deg);
		
		System.out.println(MainClass.d);

	}

}
