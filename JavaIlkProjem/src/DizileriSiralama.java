import java.util.Arrays;
public class DizileriSiralama {

	public static void main(String[] args) {
		int[] dizi = {10,15,20,30,1,3,5,9,10};
		Arrays.sort(dizi);
		/*for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}*/
		
		
		int[] dizi2 = {10,15,40,1,3,5,6,1,0,40,50};
		Arrays.sort(dizi2,1,5);
		for (int i = 0; i < dizi2.length; i++) {
			System.out.println(dizi2[i]);
		}


	}

}
