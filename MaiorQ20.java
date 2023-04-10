import java.util.Scanner;

public class MaiorQ20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor.");
		int nu = sc.nextInt();
		
		System.out.println("Informe um valor.");
		int nu1 = sc.nextInt();
		
		int soma = nu + nu1;
		
		int valor = (soma >= 20) ? soma + 10 : soma - 5;
		//System.out.println("O resultado será: " + valor);
		System.out.printf("O resultado será %d", valor);

		sc.close();
	}

}
