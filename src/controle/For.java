package controle;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double somaDasNotas = 0;
		double notas = 0;
		
		for(int indice = 0; indice < 3; indice++){
			notas = scanner.nextDouble();			
			somaDasNotas += notas;
		}
		
		
		   if (notas <= 10) {
			  System.out.println("nota invalida"); 
			   
		    }
		   		       
			scanner.close();
			System.out.printf("Sua média é : %.1f" , somaDasNotas / 3);
	 
	}

}
