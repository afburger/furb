package exemplos.unidadeI.lista.encadeada.duas.extremidades.inteiro;

public class ListaEncadeadaDuasExtremidadesInt {

	private NoListaEncadeadaDuasExtremidadesInt primeiro;
	private NoListaEncadeadaDuasExtremidadesInt ultimo;
	
	public NoListaEncadeadaDuasExtremidadesInt getPrimeiro() {
		return primeiro;
	}

	public NoListaEncadeadaDuasExtremidadesInt getUltimo() {
		return ultimo;
	}

	public void inserir(int info) {
		NoListaEncadeadaDuasExtremidadesInt novo = new NoListaEncadeadaDuasExtremidadesInt();
		novo.setInfo(info);
		novo.setProximo(this.primeiro);
		this.primeiro = novo;
		if (this.ultimo == null) {
			this.ultimo = novo;
		}
	}
	
	public void exibir() {
		NoListaEncadeadaDuasExtremidadesInt nodo = this.primeiro;
		while (nodo != null) {
			System.out.println(nodo.getInfo());
			nodo = nodo.getProximo();
		}
	}
	
	public boolean estaVazia() {
		return this.primeiro == null;
	}
	
	public NoListaEncadeadaDuasExtremidadesInt buscar(int valor) {
		NoListaEncadeadaDuasExtremidadesInt nodo = primeiro;
		while (nodo != null) {
			if (nodo.getInfo() == valor) {
				return nodo;
			} else {
				nodo = nodo.getProximo();
			}
		}
		return null;
	}
	
	public void retirar(int valor) {
		NoListaEncadeadaDuasExtremidadesInt anterior = null;
		NoListaEncadeadaDuasExtremidadesInt atual = this.primeiro;
		
		while (atual != null && atual.getInfo() != valor) {
			anterior = atual;
			atual = atual.getProximo();
		}
		
		if (atual != null) {
			if (atual.equals(this.primeiro)) {
				this.primeiro = atual.getProximo();
			} else {
				anterior.setProximo(atual.getProximo());
				if (atual.equals(ultimo)) {
					ultimo = anterior;
				}
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
