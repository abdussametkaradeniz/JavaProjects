
public class dizilerikopyalama {

	public static void main(String[] args) {
		int dizi1[] = new int[4];
		for (int i = 0; i < dizi1.length; i++) {
			dizi1[i]=i+i;
		}
		int dizi2[] = new int[dizi1.length];
		for (int i = 0; i < dizi2.length; i++) {
			dizi2[i]=dizi1[i];
		}
		/*for (int i = 0; i < dizi2.length; i++) {
			System.out.println(dizi2[i]);
		}
		for (int i = 0; i < dizi1.length; i++) {
			System.out.println(dizi1[i]);
		}*/
		
		int[] dizi3 = new int[] {1,2,3,4,5,6};
		int[] dizi4 = new int[dizi3.length];
		System.arraycopy(dizi3, 0, dizi4, 0, dizi4.length);
		for (int i = 0; i < dizi4.length; i++) {
			System.out.println("Yeni dizinin "+i+". elemani..: "+ dizi4[i]);
		}
		
		
		
	}

}
