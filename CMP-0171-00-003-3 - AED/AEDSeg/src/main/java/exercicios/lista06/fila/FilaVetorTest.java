package exercicios.lista06.fila;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class FilaVetorTest {

	private FilaVetor<Integer> fila;
	
	@Test
	public void testCaso1TestarFilaVazia() {
		fila = new FilaVetor<>(10);
		assertEquals(true, fila.estaVazia());
	}

	@Test
	public void testCaso3EnfileiramenteDesinfileramento() {
		fila = new FilaVetor<>(10);
		fila.inserir(10);
		fila.inserir(20);
		fila.inserir(30);
		
		fila.liberar();
		
		int valorEsperado = 10;
		int valorReal = fila.retirar();
		assertEquals(valorEsperado, valorReal);
		
		valorEsperado = 20;
		valorReal=fila.retirar();
		assertEquals(valorEsperado, valorReal);
		
		valorEsperado = 30;
		valorReal=fila.retirar();
		assertEquals(valorEsperado, valorReal);		
		
		assertEquals(true, fila.estaVazia());
	}

	@Test
	public void test4LancamentoExcecaoNaInsercao() {
		FilaVetor<Integer> f = new FilaVetor<>(3);
		f.inserir(10);
		f.inserir(20);
		f.inserir(30);
		try {
			f.inserir(40);
			fail();
		} catch (FilaCheiaException e) {
		}
	}

	@Test
	public void testConcatenacaoFilas() {
		FilaVetor<Integer> fila1 = new FilaVetor<>(5);
		fila1.inserir(10);
		fila1.inserir(20);
		fila1.inserir(30);

		FilaVetor<Integer> fila2 = new FilaVetor<>(3);
		fila.inserir(40);
		fila.inserir(50);

		FilaVetor<Integer> fila3 = fila1.criarFilaConcatenada(fila2);
		assertEquals("10,20,30,40,50", fila3.toString());

		assertEquals("10,20,30", fila1.toString());
		assertEquals("40,50", fila2.toString());

		assertEquals(8, fila3.getLimite());
	}


}
