package controle;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double somasDasNotas = 0;
		double nota = 0;
		int numeroDeNotas = 0;
		
		do {
			nota = scanner.nextDouble();
			
			if (nota <= 10 && nota >= 0) {
				somasDasNotas += nota;
				numeroDeNotas++;
				
			}
		} while (nota != -1);
			scanner.close();
		System.out.printf("A soma média é: %.2f" , somasDasNotas / numeroDeNotas);
	}
}
