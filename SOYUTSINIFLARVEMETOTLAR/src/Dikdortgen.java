
public class Dikdortgen extends GeometrikSekil {
	private double uzunKenar;
	private double kisaKenar;
	
	public void bilgi(double uzunKenar,double kisaKenar) {
		this.kisaKenar=kisaKenar;
		this.uzunKenar=uzunKenar;
		isimBelirle("dikdortgen");
	}

	@Override
	public double alanHesapla() {
		// TODO Auto-generated method stub
		return uzunKenar*kisaKenar;
	}
	
	
	
}
