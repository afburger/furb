package exemplos.listaencadeada;

public class AppListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		
		System.out.println("Lista encadeada está vazia? " + listaEncadeada.estaVazia());
		
		listaEncadeada.inserir(15);
		listaEncadeada.inserir(3);
		listaEncadeada.inserir(7);
		listaEncadeada.inserir(2);
		listaEncadeada.inserir(10);
		listaEncadeada.inserir(5);
		
		listaEncadeada.exibir();

		System.out.println("Lista encadeada está vazia? " + listaEncadeada.estaVazia());
		
		
		listaEncadeada.retirar(5);
		
		listaEncadeada.exibir();
	}
}
