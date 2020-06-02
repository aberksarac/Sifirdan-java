import javax.swing.JFrame;


public class Soru {
	
	
	String soruMetni;
	String secenekA, secenekB, secenekC ,secenekD;
	
	public enum Cevap {CEVAP_A, CEVAP_B, CEVAP_C, CEVAP_D}
	
	Cevap dogruCevap ;

	public Soru(String soruMetni, String secenekA, String secenekB,
			String secenekC, String secenekD, Cevap dogruCevap) {
		super();
		this.soruMetni = soruMetni;
		this.secenekA = secenekA;
		this.secenekB = secenekB;
		this.secenekC = secenekC;
		this.secenekD = secenekD;
		this.dogruCevap = dogruCevap;
	}

	boolean cevapKontrol(Cevap cevap){
		if( dogruCevap == cevap)
		{
			return true;
		}
			
		else
		{
			return false;
		}
	}
		public static void main(String[] args) {
			Soru soru1 = new Soru("Hangisi programlama dili deðildir?" , 
					"Java" , "C++" , "Oracle" , "C#" , Cevap.CEVAP_C);
			System.out.println(soru1.soruMetni);
			System.out.println(soru1.secenekA);
			System.out.println(soru1.secenekB);
			System.out.println(soru1.secenekC);
			System.out.println(soru1.secenekD);
			System.out.println(soru1.secenekD);
			System.out.println("Secenek B");
			
			
			
			System.out.println(soru1.cevapKontrol(Cevap.CEVAP_B));
			System.out.println("Secenek C");
			System.out.println(soru1.cevapKontrol(Cevap.CEVAP_C));
			
			
		}
				
			
		
	}


