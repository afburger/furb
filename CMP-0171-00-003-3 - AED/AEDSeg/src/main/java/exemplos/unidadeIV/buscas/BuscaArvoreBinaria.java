package exemplos.unidadeIV.buscas;

import exemplos.unidadeII.arvore.binaria.ArvoreBinaria;

public class BuscaArvoreBinaria {

	public static void main(String[] args) {
	
		ArvoreBinaria arvore = new ArvoreBinaria();
		arvore.inserir(63);
		arvore.inserir(27);
		arvore.inserir(80);
		arvore.inserir(13);
		arvore.inserir(51);
		arvore.inserir(70);
		arvore.inserir(92);
		arvore.inserir(26);
		arvore.inserir(33);
		arvore.inserir(58);
		arvore.inserir(82);
		arvore.inserir(57);
		arvore.inserir(60);
		
		System.out.println(arvore.toString());
		
		arvore.buscaInterativa(58);
		arvore.retirar(58);
		
		System.out.println(arvore.toString());
		System.out.println(arvore.contarNos());
	}
	
}
