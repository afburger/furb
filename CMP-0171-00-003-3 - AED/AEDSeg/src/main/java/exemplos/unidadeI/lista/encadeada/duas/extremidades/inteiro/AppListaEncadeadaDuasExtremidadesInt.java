package exemplos.unidadeI.lista.encadeada.duas.extremidades.inteiro;

public class AppListaEncadeadaDuasExtremidadesInt {

	public static void main(String[] args) {
		
		ListaEncadeadaDuasExtremidadesInt listaEncadeada = new ListaEncadeadaDuasExtremidadesInt();
		
		System.out.println("A lista está vazia? " + listaEncadeada.estaVazia());
		
		System.out.println("Primeiro: " + listaEncadeada.getPrimeiro());
		System.out.println("Ultimo: " + listaEncadeada.getUltimo());
		
		listaEncadeada.inserir(15);
		
		System.out.println("Primeiro: " + listaEncadeada.getPrimeiro());
		System.out.println("Ultimo: " + listaEncadeada.getUltimo());
		
		listaEncadeada.inserir(3);
		listaEncadeada.inserir(7);
		listaEncadeada.inserir(2);
		listaEncadeada.inserir(10);
		listaEncadeada.inserir(5);
		
		System.out.println("Primeiro: " + listaEncadeada.getPrimeiro());
		System.out.println("Ultimo: " + listaEncadeada.getUltimo());
		
		listaEncadeada.exibir();
		
		System.out.println("A lista está vazia? " + listaEncadeada.estaVazia());
	
		NoListaEncadeadaDuasExtremidadesInt buscar1 = listaEncadeada.buscar(10);
		boolean encontrou1 = buscar1 != null;
		System.out.println("Encontrou o valor 10? " + encontrou1);
		
		
		NoListaEncadeadaDuasExtremidadesInt buscar2 = listaEncadeada.buscar(25);
		boolean encontrou2 = buscar2 != null;
		System.out.println("Encontrou o valor 25? " + encontrou2);
		
		listaEncadeada.retirar(5);
		
		listaEncadeada.exibir();
		
		System.out.println("Primeiro: " + listaEncadeada.getPrimeiro());
		System.out.println("Ultimo: " + listaEncadeada.getUltimo());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
