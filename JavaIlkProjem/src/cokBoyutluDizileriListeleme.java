
public class cokBoyutluDizileriListeleme {

	public static void main(String[] args) {
		int[][] dizi = new int[3][3];
		for (int i = 0; i < dizi.length; i++) {
			
			for (int j = 0; j < dizi.length; j++) {
				dizi[i][j]=i+j;				
			}			
		}
		System.out.println("---------------------------");
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				System.out.println("dizi ["+i+"]["+j+"] = "+dizi[i][j]);
			}
		}
		
		System.out.println("---------------------------");
		
		for (int f = 0; f < dizi.length; f++) {
			for (int z = 0; z < dizi.length; z++) {
				System.out.print(dizi[f][z]+" \t ");
			}
			System.out.println(" ");
		}
		
		System.out.println("---------------------------");
		
		String[][] dizi2;
		dizi2=new String[2][2];
		dizi2[0][0]="a";
		dizi2[0][1]="b";
		dizi2[1][0]="c";
		dizi2[1][1]="d";
		
		
		
		for (int i = 0; i < dizi2.length; i++) {
			for (int j = 0; j < dizi2.length; j++) {
				System.out.print(dizi2[i][j]+" \t ");
			}
			System.out.println("");
		}
	}

}
