package overriding;

public class Main {

	public static void main(String[] args) {
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		System.out.println(ogretmenKrediManager.hesapla(1000));
		
		BaseKrediManager[] krediManager = new BaseKrediManager[] {new OgretmenKrediManager(), new TarımKrediManager(),new OgrenciKrediMnager()};
		
		
		for (BaseKrediManager baseKrediManager : krediManager) {
			System.out.println(baseKrediManager.hesapla(1000));
			
			}
		}
			
		
		
	}

