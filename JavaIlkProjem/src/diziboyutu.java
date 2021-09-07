import java.util.Scanner;
public class diziboyutu {
	

	public static void main(String[] args) {
		int[] dizi = new int[10];
		System.out.println(dizi.length);
		Scanner s = new Scanner(System.in);
		System.out.println("girdileri girmeyi bitirdiginizde cikmak icin 0 a basiniz");
		System.out.println("girdileri girmeye baslayabilirsiniz");
		int sayac = 0;
		while (true) {			
			System.out.print((sayac+1)+".elemani giriniz..: ");
			int girdi = s.nextInt();
			sayac++;
			if (girdi==0) {
				System.out.println("giris sonlandi");
				sayac--;
				break;
			}			
		}
		
		//System.out.println(sayac);
		int[] dizi2 = new int[sayac];
		System.out.println("dizi 2 nin boyutu "+dizi2.length);
		
		

	}

}
