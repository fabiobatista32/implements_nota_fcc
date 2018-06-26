
public class calc {
	
	private static double Xcg = 7.85;
	private static double Scg = 3.06;
	private static int pesocg = 1;
	
	private static double Xce = 12.76;
	private static double Sce = 3.39;
	private static int pesoce = 3;
	
	public static void main(String[] args) {
		
		int Acg = 7;		
		int Ace = 16;
		
		double npcg = 74.21;
		double npce = 178.18;
		
		npcg = Function.calc_cg(Acg, Scg, Xcg, pesocg);
	    npce = Function.calc_ce(Ace, Sce, Xce, pesoce);
		System.out.println(npcg);
		System.out.println(npce);
		System.out.println(npce + npcg);
		
		double ptcg = Function.pontos_cg(npcg, Scg, Xcg, pesocg);
		double ptce = Function.pontos_ce(npce, Sce, Xce, pesoce);
		
		System.out.println(ptcg);
		System.out.println(ptce);
		System.out.println(ptcg + ptce);

	}
}
