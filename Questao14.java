import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a idade de Jo�o:");
		int joao = sc.nextInt();
		
		System.out.println("Insira a idade de Jos�:");
		int jose = sc.nextInt();
		
		System.out.println("Insira a idade da Maria:");
		int maria = sc.nextInt();
		
		if((joao < jose) && (joao < maria)) {
			System.out.println("O Jo�o de " + joao + " anos, � o mais novo.");
		}else if((jose < joao) && (jose < maria)) {
			System.out.println("O Jos� de " + jose + " anos, � o mais novo.");
		}else {
			System.out.println("O Maria de " + maria + " anos, � a mais nova.");
		}

	}

}
