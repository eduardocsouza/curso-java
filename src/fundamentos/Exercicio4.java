package fundamentos;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner (System.in);
	    
	    System.out.println("Digite um númro :");
	    
	    double num1 = scanner.nextDouble();
	    double total = (num1 * num1);
	    double total2 = (num1 * num1 * num1);
	    System.out.println("Valor ao quadrado: " + total);
	    System.out.println("valor ao cubo: " + total2);
	    
	    scanner.close();
	    
	    		
	    
		
	}

}
