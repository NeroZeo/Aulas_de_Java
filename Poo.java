import java.util.Scanner;

public class Poo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();

		System.out.println("== Insira os lados do Tri�ngulo X ==\n");
		System.out.println("Informe o lado A.");
		x.a = sc.nextInt();
		System.out.println("Informe o lado B.");
		x.b = sc.nextInt();
		System.out.println("Informe o lado C.");
		x.c = sc.nextInt();
		System.out.println();

		System.out.println("== Insira os lados do Tri�ngulo Y ==");
		System.out.println("Informe o lado A.");
		y.a = sc.nextInt();
		System.out.println("Informe o lado B.");
		y.b = sc.nextInt();
		System.out.println("Informe o lado C.");
		y.c = sc.nextInt();
		System.out.println();

// === �REA DO CALCULO === \\
		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("�rea do Tri�ngulo X:%.4f%n", areaX);

		System.out.printf("�rea do Tri�ngulo Y:%.4f%n", areaY);

// === CHAMADA DO M�TODO TAMANHO === \\
		x.tamanho(areaX, areaY);
		sc.close();
	}

}
