import java.util.Scanner;

public class Ret�nguloA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Ret�ngulo x = new Ret�ngulo();

		System.out.println("== Insira os lados do Ret�ngulo ==\n");
		System.out.println("Informe a Altura do Ret�ngulo.");
		x.A = sc.nextInt();
		System.out.println("Informe a Largura do Ret�ngulo.");
		x.L = sc.nextInt();
		System.out.println();

		double areaX = x.area();
		double periX = x.peri();
		double diagX = x.diag();
		
		System.out.printf("A �rea do Ret�ngulo:%.2f%n", areaX);
		System.out.printf("A Perimetro do Ret�ngulo:%.2f%n", periX);
		System.out.printf("A Diagonal do Ret�ngulo:%.2f%n", diagX);
		
		sc.close();
	}

}
