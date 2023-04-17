import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número:");
		int A = sc.nextInt();
		System.out.println("Insira uma das 4 operações:");
		String ope = sc.next();
		System.out.println("Insira um número:");
		int B = sc.nextInt();
		
		do {
			
		switch (ope) {
		case "+" :
				int results = A + B;
				System.out.println("O resultado é " + results);
				if(results > 0) {
					System.out.println("É maior que 0");
				}else if(results < 0) {
					System.out.println("É menor que 0");
				}else {
					System.out.println("É igual a 0");
				}
				if(results % 2 == 0) {
					System.out.println("E é Par");
				}else {
					System.out.println("E é Impar");
				}break;
			
		case "-" :
				int resultm = A - B;
				System.out.println("O resultado é " + resultm);
				if(resultm > 0) {
					System.out.println("É maior que 0");
				}else if(resultm < 0) {
					System.out.println("É menor que 0");
				}else {
					System.out.println("É igual a 0");
				}
				if(resultm % 2 == 0) {
					System.out.println("E é Par");
				}else {
					System.out.println("E é Impar");
				}break;
			
		case "*" :
				int resultx = A * B;
				System.out.println("O resultado é " + resultx);
				if(resultx > 0) {
					System.out.println("É maior que 0");
				}else if(resultx < 0) {
					System.out.println("É menor que 0");
				}else {
					System.out.println("É igual a 0");
				}
				if(resultx % 2 == 0) {
					System.out.println("E é Par");
				}else {
					System.out.println("E é Impar");
				}break;
			
		case "/" :
				int resultd = A / B;
				System.out.println("O resultado é " + resultd);
				if(resultd > 0) {
					System.out.println("É maior que 0");
				}else if(resultd < 0) {
					System.out.println("É menor que 0");
				}else {
					System.out.println("É igual a 0");
				}
				if(resultd % 2 == 0) {
					System.out.println("E é Par");
				}else {
					System.out.println("E é Impar");
				}break;
				
		default:
				System.out.println("Falha na Operação!");
				break;
		}
	} while (B != -999);
		System.out.println("O Programa foi encerrado!");
		
		sc.close();
	}

	}


