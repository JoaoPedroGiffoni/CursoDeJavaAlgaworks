import java.util.Scanner;

public class CalcularIMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o seu peso");
		Double peso = scanner.nextDouble();
		
		System.out.print("Digite a altura");
		Double altura = scanner.nextDouble();
		
		Double alturaVezesDois = altura * altura;
		
		Double resultado = peso / alturaVezesDois;
		
		System.out.println("O seu IMC é de: " + resultado);
		
		scanner.close();
	}
	
}
