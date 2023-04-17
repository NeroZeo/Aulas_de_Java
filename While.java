import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0, valor = 0;
	
		do {
			System.out.println("Informe 0 para sair ou QQ número para somar.");
			valor = sc.nextInt();
			soma += valor;
			System.out.println("A soma é: " + soma);
		} while (valor != 0);
		System.out.println("O progama foi encerrado!");
		sc.close();
	}

}
