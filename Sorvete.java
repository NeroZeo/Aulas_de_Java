import java.util.Scanner;

public class Sorvete {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um sabor.('C' para chocolate e 'M' para morango).");
		String ice = sc.next().toUpperCase();
		
		
		
		if(ice.equals("C")) {
			System.out.println("Informe a quantidade de bolas.");
			int balls = sc.nextInt();
			if(balls >= 3) {
				System.out.println("Desconto de 10%.");
			}else{
				System.out.println("Desconto de 5%.");
				}
		}else if(ice.equals("M")) {
			System.out.println("Informe a quantidade de bolas.");
			int balls = sc.nextInt();
			System.out.println("Sem desconto.");
		}else {
			System.out.println("Sabor Invalido!");
		}
sc.close();
	}

}
