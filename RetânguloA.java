import java.util.Scanner;

public class RetânguloA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Retângulo x = new Retângulo();

		System.out.println("== Insira os lados do Retângulo ==\n");
		System.out.println("Informe a Altura do Retângulo.");
		x.A = sc.nextInt();
		System.out.println("Informe a Largura do Retângulo.");
		x.L = sc.nextInt();
		System.out.println();

		double areaX = x.area();
		double periX = x.peri();
		double diagX = x.diag();
		
		System.out.printf("A Área do Retângulo:%.2f%n", areaX);
		System.out.printf("A Perimetro do Retângulo:%.2f%n", periX);
		System.out.printf("A Diagonal do Retângulo:%.2f%n", diagX);
		
		sc.close();
	}

}
