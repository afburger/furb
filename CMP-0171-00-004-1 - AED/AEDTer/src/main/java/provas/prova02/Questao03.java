package provas.prova02;

import exercicios.lista06.fila.FilaVetor;

public class Questao03 {

	public static void main(String[] args) {
		questaoA();
		questaoB();
		questaoC();
		questaoD();
		questaoE();
	}
	
	public static void questaoA() {
		FilaVetor<String> fila = new FilaVetor<>(5);
		
		fila.inserir("A");
		fila.inserir("B");
		fila.inserir("C");
		fila.retirar();
		fila.inserir("D");
		fila.inserir("E"); 
		fila.retirar();
		fila.retirar();

		System.out.println("Questão A: " + fila.getInicio());
	}

	public static void questaoB() {
		FilaVetor<String> fila = new FilaVetor<>(5);
		
		fila.inserir("A");
		fila.retirar();
		fila.inserir("B");
		fila.inserir("C");
		fila.inserir("D");
		fila.inserir("E");
		fila.retirar();

		System.out.println("Questão B: " + fila.getInicio());
	}
	
	public static void questaoC() {
		FilaVetor<String> fila = new FilaVetor<>(5);
		
		fila.inserir("A");
		fila.retirar();
		fila.inserir("B");
		fila.inserir("C");
		fila.retirar();
		fila.inserir("D");
		fila.inserir("E");
		fila.retirar();
		fila.retirar();

		System.out.println("Questão C: " + fila.getInicio());
	}
	
	public static void questaoD() {
		FilaVetor<String> fila = new FilaVetor<>(4);
		
		fila.inserir("A");
		fila.retirar();
		fila.inserir("B");
		fila.inserir("C");
		fila.retirar();
		fila.inserir("D");
		fila.inserir("E");
		fila.retirar();
		fila.retirar();

		System.out.println("Questão D: " + fila.getInicio());
	}
	
	public static void questaoE() {
		FilaVetor<String> fila = new FilaVetor<>(5);
		
		fila.inserir("A");
		fila.inserir("B");
		fila.inserir("C");
		fila.inserir("D");
		fila.retirar();
		fila.retirar();
		fila.retirar();
		fila.retirar();
		fila.inserir("E");
		fila.retirar();

		System.out.println("Questão E: " + fila.getInicio());
	}
}
