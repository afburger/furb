package provas.prova03;

import provas.prova03.auxiliares.ListaEncadeada;
import provas.prova03.auxiliares.MapaDispersao;
import provas.prova03.auxiliares.NoLista;
import provas.prova03.auxiliares.NoMapa;

public class ProvaPraticaQuestao01 {

	
	public static void main(String[] args) {
		new ProvaPraticaQuestao01();
	}
	
	/**
	 * Acrescente na classe MapaDispersao o seguinte método:
	 * public void realocarMapa(int novoTamanho)
	 * Este método deverá redimensionar o vetor para que tenha um novo tamanho (fornecido como argumento para o método). 
	 * O método deve realocar um novo vetor como o tamanho especificado e transferir os objetos armazenados no mapa para o novo vetor. 
	 * Observar que os objetos poderão ocupar uma nova posição no vetor novo, pois você precisará recalcular o novo hash para cada objeto e armazenar na posição correspondente. 
	 * Ao final do processo, o atributo info da classe MapaDispersao deve referenciar o novo vetor.
	 * Não é permitido utilizar ArrayList, LinkedList ou qualquer outra estrutura de dados das bibliotecas Java.
	 * Será avaliada eficiência do código.
	 * Publique seu método realocarMapa().
	 */
	public ProvaPraticaQuestao01() {
		
		MapaDispersao<Integer> mapa = new MapaDispersao<Integer>(10);
		
		mapa.inserir(10, 10);
		mapa.inserir(21, 21);
		mapa.inserir(32, 32);
		mapa.inserir(43, 43);
		mapa.inserir(54, 54);
		mapa.inserir(65, 65);
		
		imprimeMapa(mapa);
		
		// Esse método inlcusive já estava implementado na solução dos exercícios da lista , era só copiar e colar na 
		mapa.realocarMapa(20);
		
		System.out.println();
		System.out.println("================ Mapa após a realocação =================");
		System.out.println();
		
		imprimeMapa(mapa);
	}
	
	private void imprimeMapa(MapaDispersao<Integer> mapa) {
		for (int i = 0; i < mapa.getInfo().length; i++) {
			ListaEncadeada<NoMapa<Integer>> listaEncadeada = mapa.getInfo()[i];
			if (listaEncadeada != null) {
				System.out.print("[" + i + "] = [");
				
				NoLista<NoMapa<Integer>> p = listaEncadeada.getPrimeiro();
				while (p != null) {
					System.out.print("Valor: " + p.getInfo().getInfo());
					p = p.getProximo();
					if (p != null) {
						System.out.print(", ");	
					}
				}
				System.out.print("], ");
				System.out.println("");
			} else {
				System.out.print("[" + i + "] = [");
				System.out.print("], ");
				System.out.println("");
			}
		}
	}
	
}
