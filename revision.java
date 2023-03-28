import java.util.Scanner;

public class revision {

	public static void main(String[] args) {
		Scanner re = new Scanner(System.in);
		
		System.out.println("Digite um novo número: ");
		int val1 = re.nextInt();
		System.out.println("Digite um novo número: ");
		int val2 = re.nextInt();
		
		int soma = val1 + val2;
		
//New World
		if(soma >= 100) {
			System.out.println("Valor muito alto!!!");
		}else {
			System.out.println("O resultado da soma é: " + val1 +" + "+ val2 + " é iguall a " + soma);
			System.out.println(val1 + val2 + " é  o resultado da soma." );
			System.out.println("O resultado da soma é: " + (val1 + val2));
		}
		
		
		
		

	}

}
