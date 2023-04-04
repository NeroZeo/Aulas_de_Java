import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a idade de João:");
		int joao = sc.nextInt();
		
		System.out.println("Insira a idade de José:");
		int jose = sc.nextInt();
		
		System.out.println("Insira a idade da Maria:");
		int maria = sc.nextInt();
		
		if((joao < jose) && (joao < maria)) {
			System.out.println("O João de " + joao + " anos, é o mais novo.");
		}else if((jose < joao) && (jose < maria)) {
			System.out.println("O José de " + jose + " anos, é o mais novo.");
		}else {
			System.out.println("O Maria de " + maria + " anos, é a mais nova.");
		}

	}

}
