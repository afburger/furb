package provas.prova02;

import exemplos.unidadeI.pilha.PilhaEstatica;

public class Questao01 {

	public static void main(String[] args) {
		questaoA();
		questaoB();
		questaoC();
		questaoD();
	}
	
	public static void questaoA() {
		PilhaEstatica pilha = new PilhaEstatica(10);
		
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		pilha.push(40);
		pilha.pop();
		pilha.pop();
		pilha.push(pilha.peek());
		pilha.push(50);

		System.out.println("Questão A: " + pilha.toString());
	}

	public static void questaoB() {
		PilhaEstatica pilha = new PilhaEstatica(10);
		
		pilha.push(40);
		pilha.push(30);
		pilha.push(20);
		pilha.push(10);
		pilha.pop();
		pilha.push(pilha.peek());
		pilha.pop();
		pilha.push(50);

		System.out.println("Questão B: " + pilha.toString());
	}
	
	public static void questaoC() {
		PilhaEstatica pilha = new PilhaEstatica(10);
		
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		pilha.pop();
		pilha.push(40);
		pilha.peek();
		pilha.push(pilha.peek());
		pilha.pop();
		pilha.push(50);

		System.out.println("Questão C: " + pilha.toString());
	}
	
	public static void questaoD() {
		PilhaEstatica pilha = new PilhaEstatica(10);
		
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		pilha.pop();
		pilha.push(40);
		pilha.peek();
		pilha.push(pilha.peek());
		pilha.push(50);
		pilha.pop();

		System.out.println("Questão D: " + pilha.toString());
	}
}
