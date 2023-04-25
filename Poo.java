import java.util.Scanner;

public class Poo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("== Insira os lados do Tri�ngulo X ==");
		System.out.println("Informe o lado A.");
		int ax = sc.nextInt();
		System.out.println("Informe o lado B.");
		int bx = sc.nextInt();
		System.out.println("Informe o lado C.");
		int cx = sc.nextInt();
		System.out.println();

		System.out.println("== Insira os lados do Tri�ngulo Y ==");
		System.out.println("Informe o lado A.");
		int ay = sc.nextInt();
		System.out.println("Informe o lado B.");
		int by = sc.nextInt();
		System.out.println("Informe o lado C.");
		int cy = sc.nextInt();
		System.out.println();
		
		double px = (ax + bx + cx) / 2;
		double areax = Math.sqrt(px*(px-ax)*(px-bx)*(px-cx));
		
		double py = (ay + by + cy) / 2;
		double areay = Math.sqrt(py*(py-ay)*(py-by)*(py-cy));
		
		System.out.println("�rea do Tri�ngulo X: " + areax);
		System.out.println("�rea do Tri�ngulo Y: " + areay);
		
		if(areax >= areay) {
			System.out.println("A Maior �rea � X");
		}else {
			System.out.println("A Maior �rea � Y");
		}
		
		
		
		
	}

}
