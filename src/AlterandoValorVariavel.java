import java.util.Scanner;

public class AlterandoValorVariavel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto= scanner.nextDouble();
		
		System.out.print("Digite a quantidade de produtos ");
		Integer quantidadeProduto = scanner.nextInt();
		
		Double valorTotal = valorProduto * quantidadeProduto;
		
		Double desconto = 0.0;
		
		if (quantidadeProduto > 10) {
			desconto = 10.0;
			Double valorFinal = valorTotal - desconto; 
			
		} else {

		}
		
				
	
		
		scanner.close();
	}
	
}
