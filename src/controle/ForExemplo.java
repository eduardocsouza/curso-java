package controle;

import java.util.Scanner;

public class ForExemplo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n = scanner.nextDouble();
		
		if(n == 0 || n == 2 || n == 4 || n == 6 || n == 8 || n == 10){
			System.out.println("est� entre 0 e 10 e � par");
		}
		else {
			System.out.println("n�o est� entre 0 e 10 e � �mpar");
		}
		scanner.close();	
	}

}
