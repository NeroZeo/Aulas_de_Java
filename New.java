
public class New {

	public static void main(String[] args) {
		int x = 1, contadorPar=0;
		
		while(x <= 30) {
			if(x % 2 == 0) {
				System.out.println(x + " é par");
				contadorPar = contadorPar + 1;
			}
		x++;
		}
		System.out.println("Quantidade de pares: " + contadorPar);
	}

}
