import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um n�mero.");
		int nu = sc.nextInt();
		
		if (nu > 100) {
			if(nu < 200) {
				System.out.println("O n�mero " + nu + " est� entre 100 e 200.");
			}else {//<--- Tinha me esquecido desse else.LOL
				System.out.println("O n�mero " + nu + " n�o est� entre 100 e 200.");
			}
		} else {
			System.out.println("O n�mero " + nu + " n�o est� entre 100 e 200.");

		}
sc.close();
	}

}
