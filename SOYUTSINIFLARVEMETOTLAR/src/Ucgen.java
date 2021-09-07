
public class Ucgen extends GeometrikSekil{

	private double yukseklik;
	private double taban;
	
	public void bilgi(double yukseklik,double taban) {
		this.yukseklik=yukseklik;
		this.taban=taban;
		isimBelirle("ucgen");		
	}
	
	@Override
	public double alanHesapla() {		
		return (taban*yukseklik)/2;
	}

	
	
}
