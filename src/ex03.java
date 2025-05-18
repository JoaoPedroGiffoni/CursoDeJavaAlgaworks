import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite sua primeira nota: ");
		Double valorNota1 = scanner.nextDouble();
		
		System.out.print("Digite sua segunda nota: ");
		Double valorNota2 = scanner.nextDouble();
		
		Double media = (valorNota1 + valorNota2) / 2 ;
		
		Boolean passouDeAno = media >= 70;
		
		if (passouDeAno) {
			System.out.print("O aluno teve a media de: " +  media + " e passou de ano");
			
		} else {
			System.out.print("O aluno não passou de ano");
		}
		scanner.close();
		
	}
	
}
