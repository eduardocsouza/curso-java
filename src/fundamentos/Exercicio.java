package fundamentos;

import javax.swing.JOptionPane;

public class Exercicio {
	
	public static void main(String[] args) {
		
		String c = JOptionPane.showInputDialog("Informe o valor do grau Fahrenhiet");
		
		
		double ce = Double.parseDouble(c);
		
		double total =  (ce - 32) * 5 / 9;
		System.out.printf("O valor de celsius é : %.1f " , total);
		
		
	}

}
