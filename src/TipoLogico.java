
public class TipoLogico {
	public static void main(String[] args) {
		Boolean variavelVerdadeira = true;
		System.out.println("Variavel verdadeira: " + variavelVerdadeira);
		
		Boolean variavelFalsa = false;
		System.out.println("Variavel Falsa: " + variavelFalsa);
		
		System.out.println("---------------------------------");
		
		Integer idade = 150;
				
		
		Boolean podeTirarCarteira = idade>= 18 ;
		
		System.out.println(" Pode tirar a carteira? " + podeTirarCarteira);
		
		if (podeTirarCarteira) {
			System.out.println(" Pode tirar a carteira, pois tem " + idade + " anos");
		} else {
			System.out.println("Não pode tirar a carteira " + idade + " anos");
		}
	}
	
}
