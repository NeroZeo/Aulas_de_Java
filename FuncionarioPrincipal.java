import java.util.Scanner;

public class FuncionarioPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario emp = new Funcionario();

		System.out.println("=== Informe os seus datos. ===");
		System.out.print("Nome: ");
		emp.name = sc.nextLine();
		System.out.print("Salário Bruto: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Imposto: ");
		emp.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Funcionário: " + emp);
		System.out.println();
		
		System.out.print("Quantos percentual para aumentar o salário? ");
		double percentage = sc.nextDouble();
		
		emp.increaseSalary(percentage);
		System.out.println();
		System.out.println("Dados atualizados: " + emp);
		
		sc.close();
	}
}
