import java.util.Arrays;

public class copyofvecopyofrangeMetotlari {

	public static void main(String[] args) {
		char[] dizi = {'a','b','d','u','s','s','a','m','e','t'};
		char[] yenidizi= {};
		char[] yenidizi2= {};
		
		System.out.println("kopyalamak istedigim dizi");
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		
		yenidizi=Arrays.copyOf(dizi, 4);
		System.out.println("olusan yeni dizimiz");
		System.out.println("----------------------");
		for (int i = 0; i < yenidizi.length; i++) {
			System.out.println(yenidizi[i]);
		}
		
		yenidizi2 = Arrays.copyOfRange(dizi, 2, 7);
		System.out.println("olusan yeni dizimiz");
		System.out.println("----------------------");
		for (int i = 0; i < yenidizi2.length; i++) {
			System.out.println(yenidizi2[i]);
		}

	}

}
