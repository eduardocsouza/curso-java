package Classe;

public class FuncionarioTeste {
	
	public static void main(String[] args) {
		Funcionario tecnico = new Funcionario();
		
		tecnico.nome = "eduardo";
		tecnico.salrio = 1.900;
		tecnico.funcao = "suporte";
		
		System.out.println("nome: " + tecnico.nome + "\n Salário: " + tecnico.salrio + "\n Função: " + tecnico.funcao);
		
	}

}
