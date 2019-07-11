package Classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data nascimento = new Data();
		nascimento.dia = 10;
		nascimento.mes = 04;
		nascimento.ano = 1988;
		
		System.out.println(nascimento.dia + "/" + nascimento.mes + "/" + nascimento.ano);
		System.out.println(nascimento.formatar());
	}
}
