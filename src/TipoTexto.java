import java.util.Scanner;

public class TipoTexto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o seu Sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		System.out.println("Olá," + nome +" " + sobrenome + "!" );
		
		scanner.close();
		
	}
}
