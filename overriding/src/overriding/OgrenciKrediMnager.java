package overriding;

public class OgrenciKrediMnager extends BaseKrediManager{
	public double hesapla (double tutar) {
		return tutar * 1.10;
		
		//base de final dediğimizden burada kabul etmiyor operasyonu.
	}
}
