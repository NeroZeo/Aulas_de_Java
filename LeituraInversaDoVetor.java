import java.util.Scanner;

public class LeituraInversaDoVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] notas = new int[5];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota: ");
			notas[i] = sc.nextInt();
		}

		System.out.println("+ --  Vetor original -- +");
		for (int i : notas) {
			System.out.println(i);

		}

		for (int i = notas.length - 1; i > -1; i--) {
			System.out.println("\n+ --  Vetor Inverso -- +");
			System.out.println(notas[i]);
		}

		sc.close();
	}

}
