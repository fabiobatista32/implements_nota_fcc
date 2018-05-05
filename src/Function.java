
public class Function {
	
	public static double calc_cg(int pontos, double desvioPadrao, double media, int peso) {
		return peso*(((pontos - media)/desvioPadrao)*10 + 50);
	}
	
	public static double calc_ce(int pontos, double desvioPadrao, double media, int peso) {
		return peso*(((pontos - media)/desvioPadrao)*10 + 50);
	}
	
	public static double pontos_cg(double total,double desvioPadrao, double media, int peso) {
		return desvioPadrao*(total/peso - 50)/10 + media;
	}
	
	public static double pontos_ce(double total,double desvioPadrao, double media, int peso) {
		return desvioPadrao*(total/peso - 50)/10 + media;
	}

}
