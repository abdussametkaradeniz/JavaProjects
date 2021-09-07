import javax.swing.*;
import javax.swing.JOptionPane;
public class joptionPane {

	public static void main(String[] args) {
		
		/*String sayi = JOptionPane.showInputDialog("sayi1");
		int yenisayi = Integer.parseInt(sayi);
		String sayi2 = JOptionPane.showInputDialog("sayi2");
		int ikincisayi=Integer.parseInt(sayi2);
		System.out.println(yenisayi*ikincisayi);*/
		//JOptionPane.showMessageDialog(null, "bilgilendirme mesaji","burasi title",JOptionPane.OK_CANCEL_OPTION);
		/*int a = 6;
		JOptionPane.showMessageDialog(null,a,"bu bir title",JOptionPane.YES_OPTION);*/
		
		//vizenin yuzde 40 i finalin ise yuzde 60 i alinir.
		
		String vize=JOptionPane.showInputDialog("vize notunu giriniz");
		int vizeNotu = Integer.parseInt(vize);
		while (vizeNotu<0 || vizeNotu>100) {			
			 vize=JOptionPane.showInputDialog("vize notunu giriniz");
			 vizeNotu = Integer.parseInt(vize);			
		}
		
		String finalNotu1=JOptionPane.showInputDialog("final notunu giriniz");
		int finalNotu2 = Integer.parseInt(finalNotu1);
		while (finalNotu2<0 || finalNotu2>100) {			
			finalNotu1=JOptionPane.showInputDialog("final notunu giriniz");
			finalNotu2 = Integer.parseInt(finalNotu1);			
		}
		
		double not = (finalNotu2*0.6) + (vizeNotu*0.4);
		String ortalama = " Notunuz..: "+not;
		
		JOptionPane.showMessageDialog(null,ortalama,"ortalama not sonucunuz",JOptionPane.INFORMATION_MESSAGE);
		
		
	}

}
