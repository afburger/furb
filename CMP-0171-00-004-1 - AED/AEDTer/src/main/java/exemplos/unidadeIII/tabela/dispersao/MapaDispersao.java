package exemplos.unidadeIII.tabela.dispersao;

import exercicios.lista03.ListaEncadeada;
import exercicios.lista03.NoLista;

public class MapaDispersao {

	private ListaEncadeada<NoMapa<Integer>>[] info;
	
	public MapaDispersao(int tamanho) {
		this.info = new ListaEncadeada[tamanho];
	}
	
	// Basicamente - indice do vetor.
	public int calcularHash(int chave) {
		int tamanho = info.length;
		return chave % tamanho;
	}
	
	public void inserir(int chave, int dado) {
		int indice = calcularHash(chave);
		
		if (info[indice] == null) {
			info[indice] = new ListaEncadeada<NoMapa<Integer>>();
		}
		
		NoMapa<Integer> noMapa = new NoMapa<Integer>();
		noMapa.setChave(chave);
		noMapa.setInfo(dado);
		
		ListaEncadeada<NoMapa<Integer>> listaEncadeada = info[indice];
		listaEncadeada.inserir(noMapa);
//		info[indice].inserir(noMapa);
	}
	
	public Integer buscar(int chave) {
		int indice = calcularHash(chave);
		
		if (info[indice] != null) {
			NoMapa<Integer> noTemp = new NoMapa<Integer>();
			noTemp.setChave(chave);
			
			NoLista<NoMapa<Integer>> no = info[indice].buscar(noTemp);
			if (no != null) {
				return no.getInfo().getInfo();
			}
		}
		return null;
	}
	
	public void remover(int chave) {
		int indice = calcularHash(chave);
		
		if (info[indice] != null) {
			NoMapa<Integer> noTemp = new NoMapa<Integer>();
			noTemp.setChave(chave);
			
			info[indice].retirar(noTemp);
		}
	}
}
