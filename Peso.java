import java.util.Scanner;

public class Peso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o seu gênero. (M ou F)");
		String sexo = sc.nextLine();
		
		System.out.println("Informe a sua Altura.");
		String al = sc.nextLine();

		if (sexo.equals("M")) {
			double pesom = (72.7 * al) - 58;
			System.out.println("O seu peso ideal é de " + pesom + "kg.");
		}
		
		
		
		
		
		
	}

}
