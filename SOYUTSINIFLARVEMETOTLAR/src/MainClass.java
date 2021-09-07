
public class MainClass {

	public static void main(String[] args) {
		Daire daire = new Daire();
		Ucgen ucgen = new Ucgen();
		Dikdortgen dikdortgen = new Dikdortgen();
		
		daire.bilgi(10.0);
		System.out.print(daire.isimGetir()+" : ");
		System.out.println(daire.alanHesapla());
		
		ucgen.bilgi(4.0,3.0);
		System.out.print(ucgen.isimGetir()+" : ");
		System.out.println(ucgen.alanHesapla());
		
		dikdortgen.bilgi(10.0,20.0);
		System.out.print(dikdortgen.isimGetir()+" : ");
		System.out.println(dikdortgen.alanHesapla());
		

	}

}
