import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.println("Enter account number: ");
		int number = sc.nextInt();

		System.out.println("Enter account holder: ");
		sc.nextLine();
		String titular = sc.nextLine();

		System.out.println("Is there a initial deposit (y / n)");
		char resp = sc.next().toLowerCase().charAt(0);

		if (resp == 'y') {
			System.out.println("Enter initial deposit value");
			double amount = sc.nextDouble();
			account = new Account(number, titular, amount);
		} else {
			account = new Account(number, titular);
		}

		System.out.println("Dados Bancarios");
		System.out.println(account);
		System.out.println("");

		System.out.println("Informe o valor de deposito: ");
		account.deposit(sc.nextDouble());
		System.out.println("Dados Atualizados");
		System.out.println(account);
		System.out.println("");
		
		System.out.println("Informe o valor de Saque: ");
		account.withdraw(sc.nextDouble());
		System.out.println("Dados Atualizados");
		System.out.println(account);
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
