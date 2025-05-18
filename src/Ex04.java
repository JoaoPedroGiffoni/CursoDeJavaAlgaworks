import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto= scanner.nextDouble();
		
		System.out.print("Digite a quantidade ");
		Integer quantidade = scanner.nextInt();
		
		Double valorSubtotal = valorProduto * quantidade;
		
		Double percentualDesconto = 0.0;
		
		if (quantidade > 10) {
			percentualDesconto = 10.0;
		}
		
		Double valorDesconto = (valorSubtotal * percentualDesconto) / 100; 
		
		Double valorTotalComDesconto = valorSubtotal - valorDesconto;
		
		System.out.print("o total é de : " + valorTotalComDesconto);
				
	
		scanner.close();
	}
	
}
