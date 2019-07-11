package fundamentos;

public class OperadoresUnarios {
	
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;
		
		//Incremeto e Decremento
		
		//incremento posfixado
		num1++;
		System.out.println(num1);
		
		//decremento prefixado
		--num1;
		System.out.println(num1);
		
		//Comparação utilizando incremento e decremento.
		System.out.println(++num1 == --num2);
		
		//Complemento binário.
		//escrevendo 50 em binário. 
		
		System.out.println(Integer.toBinaryString(50));
	}

}
