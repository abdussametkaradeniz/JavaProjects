package toStringMetoduOverrideetme;

public class sekil {

	
	int kose;
	int kosegen;
	int icAci;
	sekil(int kose){
		this.kose=kose;
		kosegen=(kose*(kose-3))/2;
		icAci=(180*(kose-2))/kose;
	}
	
	@Override
	public String toString() {
		
		return kose + " koseli bir duzgun seklin "+kosegen+" adet kosegeni vardir. Bir ic acisi ise"+icAci+ " derecedir";
		
	}
	
}
