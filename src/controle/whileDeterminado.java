package controle;

import java.util.Scanner;

public class whileDeterminado {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double somasDasNotas = 0;
		double notas = 0;
		
		int indice = 0;
		
		while (indice < 3) {
			notas = scanner.nextDouble();
			
			if (notas <=10 && notas >= 0) {
				somasDasNotas += notas;
				indice++;
				
			}
		}
		scanner.close();
		System.out.printf("A médias das notas são %.1f : " , somasDasNotas / indice);
		
    
	}

}
