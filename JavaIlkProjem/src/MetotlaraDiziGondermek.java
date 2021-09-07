import java.util.Scanner;
public class MetotlaraDiziGondermek {

	public static void main(String[] args) {
		/*int dizi[] = new int[] {1,4,7};
		for (int i : dizi) {
			System.out.println(i);
		}
		System.out.println("----------------------------------");
		islemYap(dizi);
		for (int i : dizi) {
			System.out.println(i);
		}
		*/
		
		Scanner s = new Scanner(System.in);
		String dizi[]=new String[4];
		for (int i = 0; i < dizi.length; i++) {
			System.out.print("Diziye aktarilmak uzere bir isim giriniz..: ");
			dizi[i]=s.nextLine();//NEXT LINE OLDUGUNDA BOSLUK ALGILIYOR
		}
		yazdir(dizi);
		
		
	}
	
	
	
	static void yazdir(String[] dizi) {
		System.out.println("isimler dizisinin icerigi:");
		for (String i : dizi) {
			System.out.println(i);
		}
		
	}



	static void islemYap(int[] dizi) {		
		for (int i = 0; i < 3; i++) {			
			dizi[i]=i*i;			
		}		
	}

	
	
}
