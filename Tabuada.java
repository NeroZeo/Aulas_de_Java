import java.util.Scanner;

public class Q01 {
// x=x+1 = x+=1 = x++
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um numero");
		int y = sc.nextInt();
		
		
		int x = 1;
		
		
		while (x <= 111) {
			System.out.println(y + " * " + x + " : " + y * x);
		x++;
		}
		
sc.close();
	}

}
