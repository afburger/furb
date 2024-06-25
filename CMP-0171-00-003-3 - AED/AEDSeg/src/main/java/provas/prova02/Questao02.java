package provas.prova02;

import exemplos.unidadeI.fila.FilaVetor;

public class Questao02 {

	public static void main(String[] args) {
		questaoA();
		questaoB();
		questaoC();
	}
	
	public static void questaoA() {
		FilaVetor fila = new FilaVetor(10);
		
		fila.inserir(10);
		fila.inserir(20);
		fila.inserir(30);
		fila.retirar();
		fila.inserir(40);
		fila.inserir(fila.retirar());
		fila.inserir(50);


		System.out.println("Questão A: " + fila.toString());
	}

	public static void questaoB() {
		FilaVetor fila = new FilaVetor(10);
		
		fila.inserir(10);
		fila.inserir(20);
		fila.inserir(30);
		fila.inserir(fila.retirar());
		fila.retirar();
		fila.inserir(40);
		fila.inserir(50);


		System.out.println("Questão C: " + fila.toString());
	}
	
	public static void questaoC() {
		FilaVetor fila = new FilaVetor(10);
		
		fila.inserir(10);
		fila.inserir(20);
		fila.inserir(30);
		fila.retirar();
		fila.inserir(40);
		fila.inserir(fila.retirar());
		fila.inserir(50);
		fila.retirar();


		System.out.println("Questão D: " + fila.toString());
	}
}
