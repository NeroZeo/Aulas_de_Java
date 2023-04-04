import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um número.");
		int nu = sc.nextInt();
		
		if ((nu > 100) && (nu < 200)) {
				System.out.println("O número " + nu + " está entre 100 e 200.");
		} else {
			System.out.println("O número " + nu + " não está entre 100 e 200.");

		}
sc.close();

	}

}
