package exemplos.unidadeIII.tabela.dispersao;

public class ExemploHash {

	public static void main(String[] args) {
		MapaDispersao mapa = new MapaDispersao(16);
		
		mapa.inserir(176489, 1);
		mapa.inserir(181766, 2);
		mapa.inserir(185993, 3);
		
		Integer buscar = mapa.buscar(185993);
		System.out.println(buscar);
	}
	
}
