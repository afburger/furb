package provas.prova02;

import exemplos.unidadeII.arvore.binaria.ArvoreBinaria;
import exemplos.unidadeII.arvore.binaria.NoArvoreBinaria;

public class Questao04 {

	public static void main(String[] args) {
		questaoA();
		questaoB();
		questaoC();
		questaoD();
		questaoE();
		questaoF();
	}
	
	public static void questaoA() {
		ArvoreBinaria arvore = new ArvoreBinaria();
	
		NoArvoreBinaria no10 = new NoArvoreBinaria(10, null, null);
		NoArvoreBinaria no20 = new NoArvoreBinaria(20, null, null);
		
		NoArvoreBinaria no70 = new NoArvoreBinaria(70, no10, no20);
		
		NoArvoreBinaria no80 = new NoArvoreBinaria(80, null, null);
		
		NoArvoreBinaria no90 = new NoArvoreBinaria(90, no70, no80);
		
		arvore.setRaiz(no90);
		
		System.out.println("Questão A: " + arvore.toString());
	}

	public static void questaoB() {
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		NoArvoreBinaria no80 = new NoArvoreBinaria(80, null, null);
		NoArvoreBinaria no30 = new NoArvoreBinaria(30, no80, null);
		
		NoArvoreBinaria no10 = new NoArvoreBinaria(10, null, null);
		NoArvoreBinaria no25 = new NoArvoreBinaria(25, null, null);
		
		NoArvoreBinaria no20 = new NoArvoreBinaria(20, no10, no25);
		
		NoArvoreBinaria no70 = new NoArvoreBinaria(70, no30, no20);
		
		arvore.setRaiz(no70);
		
		System.out.println("Questão B: " + arvore.toString());	
	}
	
	public static void questaoC() {
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		NoArvoreBinaria no80 = new NoArvoreBinaria(80, null, null);
		NoArvoreBinaria no30 = new NoArvoreBinaria(30, null, no80);
		
		NoArvoreBinaria no10 = new NoArvoreBinaria(10, null, null);
		NoArvoreBinaria no25 = new NoArvoreBinaria(25, null, null);
		
		NoArvoreBinaria no20 = new NoArvoreBinaria(20, no10, no25);
		
		NoArvoreBinaria no70 = new NoArvoreBinaria(70, no30, no20);
		
		arvore.setRaiz(no70);
		
		System.out.println("Questão C: " + arvore.toString());	
	}
	
	public static void questaoD() {
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		NoArvoreBinaria no30 = new NoArvoreBinaria(30, null, null);
		
		NoArvoreBinaria no80 = new NoArvoreBinaria(80, null, null);
		NoArvoreBinaria no10 = new NoArvoreBinaria(10, no80, null);
		NoArvoreBinaria no25 = new NoArvoreBinaria(25, null, null);
		
		NoArvoreBinaria no20 = new NoArvoreBinaria(20, no10, no25);
		
		NoArvoreBinaria no70 = new NoArvoreBinaria(70, no30, no20);
		
		arvore.setRaiz(no70);
		
		System.out.println("Questão D: " + arvore.toString());	
	}
	
	public static void questaoE() {
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		NoArvoreBinaria no80 = new NoArvoreBinaria(80, null, null);
		NoArvoreBinaria no25 = new NoArvoreBinaria(25, null, null);
		NoArvoreBinaria no10 = new NoArvoreBinaria(10, no80, no25);
		
		NoArvoreBinaria no30 = new NoArvoreBinaria(30, null, null);
		NoArvoreBinaria no20 = new NoArvoreBinaria(20, no10, null);
		
		NoArvoreBinaria no70 = new NoArvoreBinaria(70, no30, no20);
		
		arvore.setRaiz(no70);
		
		System.out.println("Questão E: " + arvore.toString());	
	}
	
	public static void questaoF() {
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		NoArvoreBinaria no80 = new NoArvoreBinaria(80, null, null);
		NoArvoreBinaria no25 = new NoArvoreBinaria(25, null, null);
		NoArvoreBinaria no10 = new NoArvoreBinaria(10, no80, no25);
		
		NoArvoreBinaria no30 = new NoArvoreBinaria(30, null, null);
		NoArvoreBinaria no20 = new NoArvoreBinaria(20, null, no10);
		
		NoArvoreBinaria no70 = new NoArvoreBinaria(70, no30, no20);
		
		arvore.setRaiz(no70);
		
		System.out.println("Questão F: " + arvore.toString());
	}
}
