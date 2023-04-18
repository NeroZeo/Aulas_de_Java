import java.util.Scanner;

public class Q1Arrey {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]nu =  new int[4];
		
		for(int i = 0; i <= 3; i++) {
			System.out.println("Informe uma nota:");
			nu[i] = sc.nextInt();
		}
		for(int i = 0; i <= 3; i++) {
			System.out.println("Sua nota [ " + nu[i] + " ] ");
		}
sc.close();
	}

}
