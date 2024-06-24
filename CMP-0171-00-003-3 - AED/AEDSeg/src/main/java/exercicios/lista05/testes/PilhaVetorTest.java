package exercicios.lista05.testes;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import exercicios.lista05.pilha.PilhaCheiaException;
import exercicios.lista05.pilha.PilhaVaziaException;
import exercicios.lista05.pilha.PilhaVetor;

@TestMethodOrder(OrderAnnotation.class)
public class PilhaVetorTest {
	
	private PilhaVetor<Integer> p;
	
	// caso 1
	@Test
	@Order(1)
	public void test1PilhaVazia() {
		p = new PilhaVetor<>(5);
		assertEquals(true, p.estaVazia());
	}

	// caso 2
	@Test
	@Order(2)
	public void test2PilhaNaoVazia() {
		p = new PilhaVetor<>(5);
		p.push(10);
		assertEquals(false, p.estaVazia());
	}
	
	// caso 3
	@Test
	@Order(3)
	public void test3EmpilharDesempilharDados() {
		p = new PilhaVetor<>(10);
		p.push(10);
		p.push(20);
		p.push(30);
		
		int topo;
		
		topo = p.pop();
		assertEquals(30, topo);
		
		topo = p.pop();
		assertEquals(20, topo);
		
		topo = p.pop();
		assertEquals(10, topo);

		assertTrue(p.estaVazia());
	}

	
	
	// caso 4
	@Test()
	@Order(4)
	public void test1LancarExcecaoAoEmpilhar() {
		assertThrows(PilhaCheiaException.class, () ->{
			p = new PilhaVetor<>(3);
			p.push(10);
			p.push(20);
			p.push(30);
			p.push(40);
		});
	}

	// caso 5
	@Test()
	@Order(5)
	public void test2EmpilhamentoDados() {
		
		assertThrows(PilhaVaziaException.class, () ->{
			p = new PilhaVetor<>(3);
			p.pop();
		});
		
	}
	
	// caso 6
	@Test
	@Order(6)
	public void testLerTopoPilha() {
		p = new PilhaVetor<>(5);
		p.push(10);
		p.push(20);
		p.push(30);
		
		int topo = p.peek();
		assertEquals(30, topo);
		
		topo = p.pop();
		assertEquals(30, topo);
	}
	
	// caso 7
	@Test
	@Order(7)
	public void testLiberarPilha() {
		p = new PilhaVetor<>(5);
		p.push(10);
		p.push(20);
		p.push(30);
		p.liberar();
		assertTrue(p.estaVazia());
	}
	
	// caso 8
	@Test
	@Order(8)
	public void testConcatenacaoPilhas() {
		p = new PilhaVetor<>(5);
		p.push(10);
		p.push(20);
		p.push(30);
		
		PilhaVetor<Integer> outra = new PilhaVetor<>(5);
		outra.push(40);
		outra.push(50);
		
		p.concatenar(outra);
		
		assertEquals("50,40,30,20,10", p.toString());
		assertEquals("50,40", outra.toString());
	}
	
}
