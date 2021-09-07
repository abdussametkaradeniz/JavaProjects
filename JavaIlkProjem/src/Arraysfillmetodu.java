import java.util.Arrays;

public class Arraysfillmetodu {

	public static void main(String[] args) {
		Integer[] dizi = {1,1,1,1,1};
		Integer[] dizi2 = {0,0,0,0,0,0,0};
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}

		
		Arrays.fill(dizi, 8);
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		System.out.println("--------------------------------------------");
		
		for (int i = 0; i < dizi2.length; i++) {
			System.out.println(dizi2[i]);
		}
		
		System.out.println("--------------------------------------------");
		Arrays.fill(dizi2, 2,5,4);
		
		for (int i = 0; i < dizi2.length; i++) {
			System.out.println(dizi2[i]);
		}
		
	}

}
