package exemplos.unidadeII.arvore.nnaria;

public class NoArvore {

	private int info;
	
	// Representa os filhos
	private NoArvore primeiro;
	
	// Representar os irmãos
	private NoArvore proximo;
	
	public NoArvore(int info) {
		this.info = info;
		this.primeiro = null;
		this.proximo = null;
	}
	
	public void inserirFilho(NoArvore no) {
		no.setProximo(getPrimeiro());
		this.setPrimeiro(no);
	}

	public int getInfo() {
		return info;
	}

	public NoArvore getPrimeiro() {
		return primeiro;
	}

	public NoArvore getProximo() {
		return proximo;
	}

	public void setPrimeiro(NoArvore primeiro) {
		this.primeiro = primeiro;
	}

	public void setProximo(NoArvore proximo) {
		this.proximo = proximo;
	}
	
	
	
	
}
