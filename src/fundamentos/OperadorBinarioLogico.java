package fundamentos;

public class OperadorBinarioLogico {
	
	public static void main(String[] args) {
		
		boolean executouTrabalho1 = false;
		boolean executouTrabalho2 = true; 
		
		boolean comprouSorvete = executouTrabalho1 || executouTrabalho2;
		boolean comprouTv50 = executouTrabalho1 && executouTrabalho2;
		
		boolean comprouTv32 = executouTrabalho1 ^ executouTrabalho2;
		
		System.out.println("Sorvete: " + comprouSorvete);
		System.out.println("Comprou Tv 50: " + comprouTv50);
		System.out.println("Comprou Tv 32: " + comprouTv32);
		
		//Operador unário 
		System.out.println("Fome: " + !comprouSorvete);
		
	}

}
