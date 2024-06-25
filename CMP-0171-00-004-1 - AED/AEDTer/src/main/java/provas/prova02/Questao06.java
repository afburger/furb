package provas.prova02;

import exemplos.unidadeII.arvore.nnaria.Arvore;
import exemplos.unidadeII.arvore.nnaria.NoArvore;

public class Questao06 {

	public static void main(String[] args) {
		questaoA();
	}
	
	public static void questaoA() {
		Arvore arvore = new Arvore();
	
		NoArvore no1 = new NoArvore(1);
		NoArvore no2 = new NoArvore(2);
		no1.inserirFilho(no2);
		
		arvore.setRaiz(no1);
		
		System.out.println("Questão A: " + arvore.toString());
	}

}
