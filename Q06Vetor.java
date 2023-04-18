import java.util.Scanner;

public class Q06Vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[5];
		int[] B = new int[5];
		
		for(int i = 0; i <= 4; i++) {
			System.out.println("Informe um Número:");
			A[i] = sc.nextInt();
			B[i] = A[i];
		}
		
		System.out.println("\n Valores do Vetor A " );
		for (int i = 0; i < A.length; i++) {
			System.out.println("Valor: " + A[i]);
		}
		System.out.println("\n Valores do Vetor B " );
		for (int i = 0; i < B.length; i++) {
			System.out.println("Valor: " + B[i]);
		}
		
	}

}
