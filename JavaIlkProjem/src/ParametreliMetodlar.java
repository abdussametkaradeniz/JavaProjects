import java.util.Scanner;
public class ParametreliMetodlar {

	public static void main(String[] args) {
		
		/*int a = 5,b = 10;
		int tutucu = islemYap(a, b);
		yazdir(tutucu);*/
		
		/*int a = 10, b = 9;
		int tutucu = karesiniHesapla(a);
		int tutucu2 = karesiniHesapla(b);
		System.out.println("birinci tutucu = "+tutucu);
		System.out.println("ikinci tutucu = "+tutucu2);*/
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("sayi birin girdisini yapiniz: ");
		int girdi1 = girdi.nextInt();
		System.out.print("sayi ikinin girdisini yapiniz: ");
		int girdi2 = girdi.nextInt();
		double sonuc = 0.00;
		sonuc = +bolme(girdi1, girdi2);
		System.out.println("toplama islemi sonucu = "+toplama(girdi1, girdi2));
		System.out.println("cikarma islemi sonucu = "+cikarma(girdi1, girdi2));
		System.out.println("carpma islemi sonucu = "+carpma(girdi1, girdi2));
		System.out.println("bolme islemi sonucu = "+sonuc);
	}
	public static int toplama(int a,int b) {		
		return a+b;		
	}
	public static int cikarma(int a,int b) {		
		return a-b;		
	}
	public static int carpma(int a,int b) {		
		return a*b;		
	}
	public static double bolme(int a,int b) {	
		return a/b;
	}
	
	
	
	
	
	/*
	public static int karesiniHesapla(int a) {
		int sayininKaresi=a*a;
		return sayininKaresi;	
	}*/
	
	
	/*public static int islemYap(int a, int b) {
		
		return a + b;
		
	}
	public static void yazdir(int tutucu) {
		
		System.out.println(tutucu);
		
	}*/
	
	
	
}
