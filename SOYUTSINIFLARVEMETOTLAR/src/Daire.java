
public class Daire extends GeometrikSekil {
	
	private double yaricap;
	private double pi = Math.PI;
	
	public void bilgi(double yaricap) {
		isimBelirle("daire");
		this.yaricap=yaricap;				
	}
	
	
	
	@Override
	public double alanHesapla() {		
		return pi*Math.sqrt(yaricap) ;//pi*(yaricap*yaricap)
	}
	
	
	
	
}
