package Exercicio1;

public class Main {

	public static void main(String[] args) {
		
		//Exercicio Calculadora
		System.out.println("Exercicio Calculadora");
		Calculadora.soma(435,31);
		Calculadora.subtracao(854, 351);
		Calculadora.multiplicacao(6, 6);
		Calculadora.divisao(25, 5);
		
		 System.out.println("------------------------------------------");
		 
		//Exercicio Mensagem
	        System.out.println("Exercicio Mensagem");
	        Mensagem.obterMensagem(9);
	        Mensagem.obterMensagem(14);
	        Mensagem.obterMensagem(1);
	        
	        System.out.println("------------------------------------------");
	        
	    //  Exercicio Emprestimo
	        System.out.println("Exercicio empréstimo");
	        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
	        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
	        Emprestimo.calcular(1000, 5);
	}

}
