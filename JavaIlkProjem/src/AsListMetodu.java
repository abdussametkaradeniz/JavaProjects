import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class AsListMetodu {

	public static void main(String[] args) {
		String[] dizi = {"elma","armut","kel","mahmut","hoca"};
		Integer[] dizi2 = {1,3,5,7};
		
		List listeyapisi = new ArrayList();
		List listeyapisi2 = new ArrayList();
		
		listeyapisi = Arrays.asList(dizi);
		listeyapisi2 = Arrays.asList(dizi2);
		
		System.out.println(listeyapisi.get(2));
		System.out.println(listeyapisi2.get(0));
		System.out.println(listeyapisi);
		System.out.println(listeyapisi2);
		
		
	}

}
