package exemplos.unidadeI.lista.estatica.inteiro;

public class AppListaEstaticaInt {

	public static void main(String[] args) {

		ListaEstaticaInt listaEstatica = new ListaEstaticaInt();

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

		listaEstatica.exibir();

		System.out.println("#########################################################");

		listaEstatica.inverter();

		listaEstatica.exibir();

	}
}
