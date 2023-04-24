import java.util.Scanner;

public class MediaVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] notas = new int[4];
		int soma = 0;

		for (int i = 0; i <= 3; i++) {
			System.out.println("Informe a sua nota:");
			notas[i] = sc.nextInt();
			soma = soma + notas[i];
		}

		double media = soma / 4;
		System.out.println("Média: " + media);

		sc.close();

	}

}
