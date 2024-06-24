package exercicios.lista05.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import exercicios.lista05.pilha.Pilha;
import exercicios.lista05.pilha.PilhaLista;

@TestMethodOrder(OrderAnnotation.class)
public class PilhaListaTest {
	
	private Pilha<Integer> p;
	
	// caso 1
	@Test
	@Order(1)
	public void test1PilhaVazia() {
		p = new PilhaLista<>();
		assertEquals(true, p.estaVazia());
	}

	// caso 2
	@Test
	@Order(2)
	public void test2PilhaNaoVazia() {
		p = new PilhaLista<>();
		p.push(10);
		assertEquals(false, p.estaVazia());
	}
	
	// caso 3
	@Test
	@Order(3)
	public void test3EmpilharDesempilharDados() {
		p = new PilhaLista<>();
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

		assertEquals(true, p.estaVazia());
	}

	// caso 4
	@Test
	@Order(4)
	public void testLerTopoPilha() {
		// p = new PilhaVetor<>(5);
		p = new PilhaLista<>();
		p.push(10);
		p.push(20);
		p.push(30);
		
		int topo = p.peek();
		assertEquals(30, topo);
		
		topo = p.pop();
		assertEquals(30, topo);
	}
	
	// caso 5
	@Test
	@Order(5)
	public void testLiberarPilha() {
		p = new PilhaLista<>();
		p.push(10);
		p.push(20);
		p.push(30);
		p.liberar();
		assertEquals(true, p.estaVazia());
	}
	
}
