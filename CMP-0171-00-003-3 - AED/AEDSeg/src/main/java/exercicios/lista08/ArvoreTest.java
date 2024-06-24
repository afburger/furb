package exercicios.lista08;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArvoreTest {
	
	private Arvore<Integer> arvore = new Arvore<>();

	public void testeQualquer() {
		NoArvore<Integer> no10 = new NoArvore<>(10);

		NoArvore<Integer> no20 = new NoArvore<>(20);

		no10.inserirFilho(no20);

		NoArvore<Integer> no30 = new NoArvore<>(30);
		no10.inserirFilho(no30);

		NoArvore<Integer> no40 = new NoArvore<>(40);

		no10.inserirFilho(no40);

	}
	
	private void criarArvore() {
		NoArvore<Integer> n9 = new NoArvore<>(9);
		NoArvore<Integer> n10 = new NoArvore<>(10);
		NoArvore<Integer> n4 = new NoArvore<>(4);
		n4.inserirFilho(n10);
		n4.inserirFilho(n9);

		NoArvore<Integer> n8 = new NoArvore<>(8);
		NoArvore<Integer> n3 = new NoArvore<>(3);
		n3.inserirFilho(n8);
		
		NoArvore<Integer> n5 = new NoArvore<>(5);
		NoArvore<Integer> n6 = new NoArvore<>(6);
		NoArvore<Integer> n7 = new NoArvore<>(7);
		
		NoArvore<Integer> n2 = new NoArvore<>(2);
		n2.inserirFilho(n7);
		n2.inserirFilho(n6);
		n2.inserirFilho(n5);
		
		NoArvore<Integer> n1 = new NoArvore<Integer>(1);
		n1.inserirFilho(n4);
		n1.inserirFilho(n3);
		n1.inserirFilho(n2);
		
		arvore.setRaiz(n1);
	}

	@Test
	public void test1_RepresentacaoTextual() {
		criarArvore();
		assertEquals("<1<2<5><6><7>><3<8>><4<9><10>>>", arvore.toString());
	}
	
	@Test
	public void test2_BuscarValorArvore() {
		criarArvore();
		assertEquals(true, arvore.pertence(7));
	}
	
	
	@Test
	public void test3_BuscarValorInexistenteArvore() {
		criarArvore();
		assertEquals(false, arvore.pertence(55));

	}
	
	
	@Test
	public void test4_contarNos() {
		criarArvore();
		assertEquals(10, arvore.contarNos());
	}
	

}
