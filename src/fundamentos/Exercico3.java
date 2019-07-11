package fundamentos;

import javax.swing.JOptionPane;

public class Exercico3 {
	
	public static void main(String[] args) {
		
		String altura = JOptionPane.showInputDialog("Informe sua altura");
		String peso = JOptionPane.showInputDialog("Informe seu Peso");
		
		double al = Double.parseDouble(altura);
		double ps = Double.parseDouble(peso);
		double IMC1 = (al * al);
		double total = ps / IMC1;
		
		System.out.printf(" Seu IMC é : %.1f " , total );
		
		
		
		
	
		
				
	}

}
