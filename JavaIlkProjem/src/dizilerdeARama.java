import java.util.Arrays;
public class dizilerdeARama {

	public static void main(String[] args) {
		int[] dizi = {1,3,4,5,1,2,6,7,123,334,10};
		Arrays.sort(dizi);
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i]+ " ");
		}
		int deger = Arrays.binarySearch(dizi, 123);
		if (deger<0) {
			System.out.println("dizini icerisinde aranan eleman yoktur");
		}else {
			System.out.println("Bulundu ve indisi "+ deger);
		}
		

	}

}
