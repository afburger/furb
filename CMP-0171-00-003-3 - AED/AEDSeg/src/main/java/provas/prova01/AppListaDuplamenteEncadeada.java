package provas.prova01;

public class AppListaDuplamenteEncadeada {

	public static void main(String[] args) {
		
		
		// Questão 7 prova Teórica.
//		ListaDuplamenteEncadeada<String> prova = new ListaDuplamenteEncadeada<String>();
//		prova.inserir("Ana");
//		prova.inserir("Luiz");
//		prova.inserir("Pedro");
//		prova.inserir("Maria");
//		
//		prova.retirar("Pedro");
//		
//		System.out.println(prova.toString());
		
//		// Questão 2 prova prática.
		ListaDuplamenteEncadeada<String> prova = new ListaDuplamenteEncadeada<String>();
		prova.inserir("D");
		prova.inserir("C");
		prova.inserir("B");
		prova.inserir("A");
		System.out.println(prova.toString());
		
		
		System.out.println(prova.clonar().toString());
		
		
	}
	
}
