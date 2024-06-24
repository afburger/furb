package exemplos.unidadeI.lista.encadeada.inteiro;

public class AppListaEncadeadaInt {

	public static void main(String[] args) {
		
		ListaEncadeadaInt listaEncadeada = new ListaEncadeadaInt();
		
		System.out.println("A lista está vazia? " + listaEncadeada.estaVazia());
		
		listaEncadeada.inserir(15);
		listaEncadeada.inserir(3);
		listaEncadeada.inserir(7);
		listaEncadeada.inserir(2);
		listaEncadeada.inserir(10);
		listaEncadeada.inserir(5);
		
		
		
		listaEncadeada.exibir();
		
		System.out.println("A lista está vazia? " + listaEncadeada.estaVazia());
	
		NoListaInt buscar1 = listaEncadeada.buscar(10);
		boolean encontrou1 = buscar1 != null;
		System.out.println("Encontrou o valor 10? " + encontrou1);
		
		
		NoListaInt buscar2 = listaEncadeada.buscar(25);
		boolean encontrou2 = buscar2 != null;
		System.out.println("Encontrou o valor 25? " + encontrou2);
		
		listaEncadeada.retirar(5);
		
		listaEncadeada.exibir();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
