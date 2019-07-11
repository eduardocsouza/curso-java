package fundamentos;

import javax.swing.JOptionPane;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		String f = JOptionPane.showInputDialog("Informe o valor de celsius");
		
		double fa = Double.parseDouble(f);
		double total = fa * 9 / 5 + 32;
		System.out.printf("O valor em Fahrenhiet é : %.1f " , total);
		
	}

}
