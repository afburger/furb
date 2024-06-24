package exercicios.lista06.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import exercicios.lista06.fila.FilaLista;

public class FilaListaTest {
	
	private FilaLista<Integer> fila = new FilaLista<>();

	// Caso 1 
	@Test
	public void testListaVazia() {
		assertEquals(true, fila.estaVazia());
	}
	
	// Caso 2 
	@Test
	public void testListaNaoVazia() {
		fila.inserir(10);
		assertEquals(false, fila.estaVazia());
	}
	
	
	// Caso 3 
	@Test
	public void testTestarEnfileirarDesinfileirar() {
		fila.inserir(10);
		fila.inserir(20);
		fila.inserir(30);
		
		int inicioFila;
		
		inicioFila = fila.retirar();
		assertEquals(10, inicioFila);
		
		inicioFila = fila.retirar();
		assertEquals(20, inicioFila);
		
		inicioFila = fila.retirar();
		assertEquals(30, inicioFila);

		assertEquals(true, fila.estaVazia());
	}
	
	// Caso 4 
	@Test
	public void testInicioFila() {
		fila.inserir(10);
		fila.inserir(20);
		fila.inserir(30);
		
		assertEquals(Integer.valueOf(10), fila.peek());

		int dadoRetirado = fila.retirar();
		assertEquals(10, dadoRetirado);
	}
	
	// Caso 5 
	@Test
	public void testLiberar() {
		fila.inserir(10);
		fila.inserir(20);
		fila.inserir(30);
		fila.liberar();
		
		assertEquals(true, fila.estaVazia());
	}
	

}
