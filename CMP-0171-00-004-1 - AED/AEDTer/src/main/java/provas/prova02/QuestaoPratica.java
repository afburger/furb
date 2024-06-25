package provas.prova02;

import exercicios.lista06.fila.FilaVetor;
import exercicios.lista07.ArvoreBinaria;
import exercicios.lista07.NoArvoreBinaria;

public class QuestaoPratica {

	public static void main(String[] args) {
		questao1();
//		questao2();
	}

	private static void questao1() {
		ArvoreBinaria<Integer> arvoreBinaria1 = new ArvoreBinaria<>();
		
		NoArvoreBinaria<Integer> ar1No4 = new NoArvoreBinaria<Integer>(4);
		NoArvoreBinaria<Integer> ar1No3 = new NoArvoreBinaria<Integer>(3, ar1No4, null);
		NoArvoreBinaria<Integer> ar1No2 = new NoArvoreBinaria<Integer>(2, ar1No3, null);
		NoArvoreBinaria<Integer> ar1No1 = new NoArvoreBinaria<Integer>(1, ar1No2, null);
		
		arvoreBinaria1.setRaiz(ar1No1);
		
		System.out.println("Arvore 1 é degenerada? " + arvoreBinaria1.isDegenerada());
		
		
		ArvoreBinaria<Integer> arvoreBinaria2 = new ArvoreBinaria<>();
		
		NoArvoreBinaria<Integer> ar2No4 = new NoArvoreBinaria<Integer>(4);
		NoArvoreBinaria<Integer> ar2No3 = new NoArvoreBinaria<Integer>(3, ar2No4, null);
		NoArvoreBinaria<Integer> ar2No2 = new NoArvoreBinaria<Integer>(2, null, ar2No3);
		NoArvoreBinaria<Integer> ar2No1 = new NoArvoreBinaria<Integer>(1, ar2No2, null);
		
		arvoreBinaria2.setRaiz(ar2No1);
		
		System.out.println("Arvore 2 é degenerada? " + arvoreBinaria2.isDegenerada());
		
		ArvoreBinaria<Integer> arvoreBinaria3 = new ArvoreBinaria<>();
		
		NoArvoreBinaria<Integer> ar3No1 = new NoArvoreBinaria<Integer>(1, null, null);
		
		arvoreBinaria3.setRaiz(ar3No1);
		
		System.out.println("Arvore 3 é degenerada? " + arvoreBinaria3.isDegenerada());
		
	}

	private static void questao2() {
		FilaVetor<String> fila = new FilaVetor<>(10);
		
		fila.inserir("X");
		fila.inserir("Y");
		fila.inserir("Z");
		fila.inserir("A");
		fila.inserir("B");
		fila.inserir("C");
		fila.inserir("D");
		
		fila.retirar();
		fila.retirar();
		fila.retirar();
		
		System.out.println(fila.imprimirVetor());
		System.out.println("Inicio: " + fila.getInicio());
		System.out.println("Limite: " + fila.getLimite());
		System.out.println("Tamanho: " + fila.getTamanho());
		
		System.out.println("");
		
		fila.encolher();
		
		System.out.println(fila.imprimirVetor());
		System.out.println("Inicio: " + fila.getInicio());
		System.out.println("Limite: " + fila.getLimite());
		System.out.println("Tamanho: " + fila.getTamanho());
	}


}
