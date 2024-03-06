package exemplos.listaestatica;

public class App {

    public static void main(String[] args) {
    	
    	ListaEstatica listaEstatica = new ListaEstatica();
    	
    	System.out.println("Lista estática está vazia:" + listaEstatica.estaVazia());
    	
    	listaEstatica.inserir(5);
    	listaEstatica.inserir(15);
    	listaEstatica.inserir(-7);
    	listaEstatica.inserir(21);
    	listaEstatica.inserir(9);
    	listaEstatica.inserir(10);
    	listaEstatica.inserir(3);
    	listaEstatica.inserir(47);
    	listaEstatica.inserir(54);
    	listaEstatica.inserir(81);
    	listaEstatica.inserir(-4);
    	listaEstatica.inserir(12);
    	
    	System.out.println("Lista estática está vazia:" + listaEstatica.estaVazia());
    	
    	listaEstatica.exibir();
    	
    	int indexBusca = listaEstatica.buscar(21);
    	System.out.println("A posição do valor buscado é: " + indexBusca);
    	
    	
    	listaEstatica.retirar(21);

    	listaEstatica.exibir();
    	
    }
}
