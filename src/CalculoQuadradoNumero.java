import java.util.Scanner;

public class CalculoQuadradoNumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o numero que gostaria de saber o quadrado");
		Double valorUsuario = scanner.nextDouble();
		
		Double resultado = valorUsuario * valorUsuario;
		
		System.out.println("O valor do Quadrado é: " + resultado);
		
		scanner.close();
	}
}
//Scanner scanner = new Scanner(System.in);
//
//System.out.print("Digite o valor do produto:  ");
//Double valorProduto = scanner.nextDouble();
//
//System.out.print("Digite quantidade passada pelo cliente:  ");
//Double valorPassadoPeloCliente = scanner.nextDouble();
//
//Double resultado = valorPassadoPeloCliente - valorProduto;
//
//System.out.println("Troco: " + resultado);
//
//scanner.close();