package exemplos.listaencadeada;

public class AppListaEncadeada {

	public static void main(String[] args) {
		
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		
		System.out.println("A lista está vazia? " + listaEncadeada.estaVazia());
		
		listaEncadeada.inserir(15);
		listaEncadeada.inserir(3);
		listaEncadeada.inserir(7);
		listaEncadeada.inserir(2);
		listaEncadeada.inserir(10);
		listaEncadeada.inserir(5);
		
		
		
		listaEncadeada.exibir();
		
		System.out.println("A lista está vazia? " + listaEncadeada.estaVazia());
	
		NoLista buscar1 = listaEncadeada.buscar(10);
		boolean encontrou1 = buscar1 != null;
		System.out.println("Encontrou o valor 10? " + encontrou1);
		
		
		NoLista buscar2 = listaEncadeada.buscar(25);
		boolean encontrou2 = buscar2 != null;
		System.out.println("Encontrou o valor 25? " + encontrou2);
		
		listaEncadeada.retirar(5);
		
		listaEncadeada.exibir();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
