import java.util.Scanner;

public class Vogal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe uma vogal");
		String vogal = sc.next().toUpperCase();
		
		if(vogal.equals("A") || vogal.equals("E") || vogal.equals("I") && vogal.equals("O") && vogal.equals("U")) {
			System.out.println("É uma vogal");
		}else {
			System.out.println("Não é uma vogal");
		}
sc.close();
	}

}
