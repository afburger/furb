package exercicios.lista06.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import exercicios.lista06.fila.FilaCheiaException;
import exercicios.lista06.fila.FilaVaziaException;
import exercicios.lista06.fila.FilaVetor;

public class FilaVetorTest {
	
	private FilaVetor<Integer> fila;

	// caso 1
	@Test
	public void testFilaVazia() {
		fila = new FilaVetor<>(5);
		assertEquals(true, fila.estaVazia());
	}
	
	
	// caso 2
	@Test
	public void test2FilaNaoVazia() {
		fila = new FilaVetor<>(5);
		fila.inserir(10);
		assertEquals(false, fila.estaVazia());
	}
	
	// caso 3
	@Test
	public void test3EnfileirarDesenfileirarDados() {
		fila = new FilaVetor<>(5);
		
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

	
	
	// caso 4
	@Test
	public void test1LancarExcecaoAoEmpilhar() {
		
		assertThrows(FilaCheiaException.class, () -> {
			fila = new FilaVetor<>(3);
			fila.inserir(10);
			fila.inserir(20);
			fila.inserir(30);
			fila.inserir(40);
		});
	}
	
	
	// caso 5
	@Test
	public void test2EmpilhamentoDados() {
		
		assertThrows(FilaVaziaException.class, () -> {
			fila = new FilaVetor<>(3);
			fila.retirar();
		});
	}
	
	// caso 6
	@Test
	public void testLerInicioFila() {
		fila = new FilaVetor<>(5);
		fila.inserir(10);
		fila.inserir(20);
		fila.inserir(30);
		
		int inicioFila = fila.peek();
		assertEquals(10, inicioFila);

		inicioFila = fila.retirar();
		assertEquals(10, inicioFila);
	}
	
	// caso 7
	@Test
	public void testLiberarFila() {
		fila = new FilaVetor<>(5);
		fila.inserir(10);
		fila.inserir(20);
		fila.inserir(30);
		fila.liberar();
		assertTrue(fila.estaVazia());
	}
	
	// caso 8
	@Test
	public void testConcatenacaoFilas() {
		fila = new FilaVetor<>(5);
		fila.inserir(10);
		fila.inserir(20);
		fila.inserir(30);
		
		FilaVetor<Integer> outra = new FilaVetor<>(3);
		outra.inserir(40);
		outra.inserir(50);
		
		FilaVetor<Integer> nova = fila.criarFilaConcatenada(outra);
		
		assertEquals("10,20,30,40,50", nova.toString());
		
		assertEquals("10,20,30", fila.toString());
		assertEquals("40,50", outra.toString());
		
		assertEquals(8, nova.getLimite());
		
	}
	

}
