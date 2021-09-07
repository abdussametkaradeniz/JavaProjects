import java.util.Arrays;
public class dizileriKarsilastirma {

	public static void main(String[] args) {
		char[] dizi1 = {'f'};
		char[] dizi2 = {'a'};
		System.out.println(Arrays.equals(dizi1, dizi2));
		int[] dizi3 = {1,2,3,4,5,6,7};
		int[] dizi4 = {1,2,3,4,5,6,7};
		System.out.println(Arrays.equals(dizi3, dizi4));
	}
}
