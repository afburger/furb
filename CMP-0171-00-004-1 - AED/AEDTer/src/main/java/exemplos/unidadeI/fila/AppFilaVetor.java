package exemplos.unidadeI.fila;

public class AppFilaVetor {

	public static void main(String[] args) {
//		FilaVetor filaVetor = new FilaVetor(5);
//		
//		filaVetor.inserir(8);
//		filaVetor.inserir(3);
//		filaVetor.inserir(7);
//		
//		filaVetor.retirar();
//		filaVetor.retirar();
//		
//		filaVetor.inserir(12);
//		filaVetor.inserir(13);
//		filaVetor.inserir(14);
//		filaVetor.inserir(15);
		
		FilaDinamica filaVetor = new FilaDinamica();
		
		filaVetor.inserir(8);
		filaVetor.inserir(3);
		filaVetor.inserir(7);
		
		filaVetor.retirar();
		filaVetor.retirar();
		
		filaVetor.inserir(12);
		filaVetor.inserir(13);
		filaVetor.inserir(14);
		filaVetor.inserir(15);
		
	}
	
}
