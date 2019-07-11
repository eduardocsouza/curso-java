package fundamentos;

import javax.swing.JOptionPane;

public class OperadorTernario {
	
	public static void main(String[] args) {
		
		String num1 = JOptionPane.showInputDialog("qual é a primeira nota");
		String num2 = JOptionPane.showInputDialog("segunda nota");
	    double nota1 = Double.parseDouble(num1);
	    double nota2 = Double.parseDouble(num2);
		double total = nota1 + nota2;
		total /= 2;
		
	    //double nota = 7;
		
	    
	    String resultado = total >= 7 ? "aprovado" : "reprovado";
		System.out.println(resultado);
		System.out.printf("média: " + total);
	}

}
