package fundamentos;

public class ConversaoNumerica {

	public static void main(String[] args) {
		//1 exemplo - conversão explícita
		float f = (float) 0.1;
        System.out.println(f);
        
        //2 exemplo - conversão explícita
        int i1 = (int) 7.9;
        System.out.println(i1);
        
        //3 exemplo - conversão implícita
        int i2 = 'a';
        
        double d = 1001;
        System.out.println(d);
	}
}
