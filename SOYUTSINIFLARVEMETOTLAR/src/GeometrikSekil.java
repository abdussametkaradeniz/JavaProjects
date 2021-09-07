
public abstract class GeometrikSekil {
	
	private String isim;
	
	public void isimBelirle(String isim) {
		
		this.isim= isim;//geometrik seklin ismini belirliyoruz
		
	}
	
	public String isimGetir() {
		return this.isim;
	}
	
	public abstract double alanHesapla();
	
}
