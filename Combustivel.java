import java.util.Scanner;

class Combustivel {

	public static void main(String[] args) {
		Scanner kkk = new Scanner(System.in);
		System.out.println("Informe o tipo do combustivel.");
		String tc = kkk.nextLine();
		
		System.out.println("Informe a Capacidade do tanque.");
		double ct = kkk.nextDouble();
		
		if (tc.equalsIgnoreCase("G")) {
			double g = ct * 3.79;
			System.out.println("O valor pago na Gasolina é de " + g + " reais.");
		}else {
			double a = ct * 2.90;
			System.out.println("O valor pago no Alcol é de " + a + " reais.");
		}		
		kkk.close();
	}

}
