package exemplos.unidadeI.lista.encadeada.inteiro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class ListaEncadeadaIntTest {
	
	
	ListaEncadeadaInt lista = new ListaEncadeadaInt();
	
	/**
	 * Caso 1 - Verificar se é reconhecida lista vazia
	 */
	@Test
	@Order(1)
	public void testListaVazia() {
		assertEquals(true, lista.estaVazia());
	}
	
	/**
	 * Caso 2 - Verificar se é reconhecida lista preenchida
	 */
	@Test
	@Order(2)
	public void testListaNaoVazia() {
		lista.inserir(5);
		assertEquals(false, lista.estaVazia());
	}
	
	/**
	 * Caso 3 - Validar a inclusão de um dado
	 */
	@Test
	@Order(3)
	public void testValidarInclusao() {
		lista.inserir(5);
		
		NoListaInt no = lista.getPrimeiro();
		
		assertEquals(5, no.getInfo());
		
		assertEquals(null, no.getProximo());
	}
	
	/**
	 * Caso 4 - Validar inclusão de 3 números
	 */
	@Test  
	@Order(4)
	public void testarBuscaDados1aPosicao() {
		ListaEncadeadaInt lista = new ListaEncadeadaInt();

		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		
		NoListaInt no;
		
		no = lista.getPrimeiro();
		assertEquals(15,no.getInfo());
		
		no = no.getProximo();
		assertEquals(10, no.getInfo());
		
		no = no.getProximo();
		assertEquals(5, no.getInfo());
		
		no = no.getProximo();
		assertEquals(null, no);
	}
	
	/**
	 * Case 5 - Validar busca na primeira posição
	 */
	@Test 
	@Order(5)
	public void testarDadosInicio() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		NoListaInt no = lista.buscar(20);
		assertEquals(20, no.getInfo());
	}
	
	/**
	 * Caso 6 - Validar busca no meio da lista
	 */
	@Test
	@Order(6)
	public void testarBuscarMeio() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		NoListaInt no = lista.buscar(15);
		assertEquals(15, no.getInfo());
	}
	
	/**
	 * Caso 7 - Validar busca de dado inexistente
	 */
	@Test
	@Order(7)
	public void testBuscarInexistente() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		NoListaInt no = lista.buscar(50);
		assertEquals(null, no);
	}
	
	/**
	 * Caso 8 - Validar exclusão do primeiro elemento
	 */
	@Test
	@Order(8)
	public  void testExclusaoPrimeiroElemento() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		lista.retirar(20);
		
		NoListaInt no;
		
		no = lista.getPrimeiro();
		assertEquals(15, no.getInfo());
		
		no = no.getProximo();
		assertEquals(10, no.getInfo());
		
		no = no.getProximo();
		assertEquals(5, no.getInfo());
		
		no = no.getProximo();
		assertEquals(null, no);
	}
	
	/**
	 * Caso 9 - Validar exclusão de elemento no meio da lista
	 */
	@Test
	@Order(9)
	public void testExclusaoMeioLista() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		lista.retirar(15);
		
		NoListaInt no;
		
		no = lista.getPrimeiro();
		assertEquals(20, no.getInfo());
		
		no = no.getProximo();
		assertEquals(10, no.getInfo());
		
		no = no.getProximo();
		assertEquals(5, no.getInfo());
		
		no = no.getProximo();
		assertEquals(null, no);
	}
	
	/**
	 * Caso 10 - Valida o obter o primeiro elemento. 
	 */
	@Test 
	@Order(10)
	public void testObterNoInicioLista() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		NoListaInt no = lista.obterNo(0);
		assertEquals(20, no.getInfo());
		
	}
	
	/**
	 * Caso 11 - Valida obter um elemento na última posição
	 */
	@Test
	@Order(11)
	public void testObterNoUltimaPosicao() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		assertEquals(5, lista.obterNo(3).getInfo());
	}
	
	/**
	 * Caso 12 - Valida obter um elemento de uma posição inválida.
	 */
	@Test()
	@Order(12)
	public void testObterPosicaoInvalida() {
		assertThrows(IndexOutOfBoundsException.class, () ->{
			lista.inserir(5);
			lista.inserir(10);
			lista.inserir(15);
			lista.inserir(20);
			
			lista.obterNo(10);
		});
	}
	
	
	/**
	 * Caso 13 - Contar dados numa lista vazia
	 */
	@Test
	@Order(13)
	public void testContarDadosListaVazia() {
		assertEquals(0, lista.obterComprimento());
	}
	
	
	/**
	 * Caso 14 - Contar dados numa lista preenchida
	 */
	@Test
	@Order(14)
	public void testContarDadosListaNaoVazia() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		assertEquals(4, lista.obterComprimento());
	}

}
