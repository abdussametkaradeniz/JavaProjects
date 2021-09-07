
public class Diziler {

	public static void main(String[] args) {
		/*int[] dizi;
		int dizi2[];
		String dizi3[];
		String[] dizi4;*/
		int[] dizi = {1,2,3,4,5,6,7,8,9,10,5,6,7,8,9};
		String dizi3[] = {"abdussamet","karadeniz"};
		int[] dizi4 = new int[5];
		int[] dizi5 = new int[] {1,2,3,4,5,6,7,8,9,'2'};
		System.out.println(dizi5[6]);
		System.out.println("dizi elemanlarinin listesi");
		for (int i = 0; i < dizi5.length; i++) {
			System.out.println(dizi5[i]);
		}
		System.out.println("foreach ile erisilen dizi listesi");
		for (int i : dizi5) {
			System.out.println(i);
		}
		Object dizi8[] = new Object[3];
		dizi8[0]="abdussamet";
		dizi8[1]=4;
		dizi8[2]=6.50;
		for (int i = 0; i < dizi8.length; i++) {
			System.out.println(dizi8[i]);
		}

	}

}
