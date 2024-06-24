package exercicios.lista07;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArvoreBinariaTest  {
	
	private ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

	@Test
	public void test1ArvoreVazia() {

		assertEquals(true, arvore.estaVazia());
	}
	
	@Test
	public void test2ArvoreNaoVazia() {
		arvore.setRaiz( new NoArvoreBinaria<Integer>(5) );
		assertEquals(false, arvore.estaVazia());
	}
	
	
	private void definirArvore() {
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, null, no4);

		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
		
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no5, no6);
		
		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);

		arvore.setRaiz( no1 );
	}
	
	@Test
	public void test3RepresentacaoTextualArvore() {
		definirArvore();
		assertEquals("<1<2<><4<><>>><3<5<><>><6<><>>>>", arvore.toString());
	}
	
	
	@Test
	public void test4ProcurarRaiz() {
		definirArvore();
		assertEquals(true, arvore.pertence(1));
	}

	
	@Test
	public void test5ProcurarNaoRaizNaoFolha() {
		definirArvore();

		boolean achou = arvore.pertence(3);

		assertEquals(true, achou);
	}
	

	@Test
	public void test6ProcurarFolha() {
		definirArvore();
		assertEquals(true, arvore.pertence(6));
	}	
	
	
	@Test
	public void test7ProcurarDadoNaoInserido() {
		definirArvore();
		assertEquals(false, arvore.pertence(10));
	}
	
	
	@Test
	public void test8ContarNosArvoreContarNos() {
		definirArvore();
		assertEquals(6, arvore.contarNos());
	}
	
	
}
