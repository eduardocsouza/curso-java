package controle;

import java.util.Scanner;

public class WhilwInderterminado {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double notas = 0;
		double somasDasNotas = 0;
		int numeroDeNotas = 0;
		
		while(notas != -1){
		     notas = scanner.nextDouble();
		
		
		 if(notas <= 10 && notas >= 0) {
			 somasDasNotas += notas;
			 numeroDeNotas++;
		  } 
		
		}
	    scanner.close();
	    System.out.printf("média das notas %.1f :" ,  somasDasNotas / numeroDeNotas );
	}

}
