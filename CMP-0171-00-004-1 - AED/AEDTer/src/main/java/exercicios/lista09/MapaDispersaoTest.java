package exercicios.lista09;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;


public class MapaDispersaoTest {
	
	private MapaDispersao<Aluno> mapa = new MapaDispersao<>(53);

	@Test
	public void test1_AdicionarAluno() {
		Aluno aluno = new Aluno(12000, "Jean",
				LocalDate.of(2000, 1, 1));

		mapa.inserir(12000, aluno);

		Aluno a = mapa.buscar(12000);
		
		assertEquals(aluno, a);
	}

	@Test
	public void test2_AdicionarVariosAlunos() {
		Aluno aluno1 = new Aluno(12000, "José", LocalDate.of(2000, 1, 1)); 
		mapa.inserir(12000, aluno1);

		Aluno aluno2 = new Aluno(14000, "Pedro", LocalDate.of(1999, 1, 20)); 
		mapa.inserir(14000, aluno2);

		Aluno aluno3 = new Aluno(12500, "Marta", LocalDate.of(2001, 2, 18)); 
		mapa.inserir(12500, aluno3);
		
		Aluno aluno4 = new Aluno(13000, "Lucas", LocalDate.of(1998, 11, 25)); 
		mapa.inserir(13000, aluno4);
		
		Aluno a;
		
		a = mapa.buscar(12000);
		assertEquals(aluno1, a);
		
		a = mapa.buscar(14000);
		assertEquals(aluno2, a);
		
		a = mapa.buscar(12500);
		assertEquals(aluno3, a);
		
		a = mapa.buscar(13000);
		assertEquals(aluno4, a);
	}
	
	@Test
	public void test3_AdicionarVariosAlunosComColisao() {
		Aluno aluno1 = new Aluno(12000, "Jean", LocalDate.of(2000, 1, 1)); 
		mapa.inserir(12000,aluno1);

		Aluno aluno2 = new Aluno(14000, "Pedro", LocalDate.of(1999, 1, 20)); 
		mapa.inserir(14000,aluno2);

		Aluno aluno3 = new Aluno(14226, "Marta", LocalDate.of(2001, 2, 18)); 
		mapa.inserir(14226,aluno3);
		
		Aluno aluno4 = new Aluno(17180, "Lucas", LocalDate.of(1998, 11, 25)); 
		mapa.inserir(17180,aluno4);
		
		Aluno a;
		
		a = mapa.buscar(12000);
		assertEquals(aluno1, a);
		
		a = mapa.buscar(14000);
		assertEquals(aluno2, a);
		
		a = mapa.buscar(14226);
		assertEquals(aluno3, a);
		
		a = mapa.buscar(17180);
		assertEquals(aluno4, a);
	}
	
	
	@Test
	public void test4_RemocaoObjetos() {
		Aluno aluno1 = new Aluno(12000, "José", LocalDate.of(2000, 1, 1)); 
		mapa.inserir(12000,aluno1);

		Aluno aluno2 = new Aluno(14000, "Pedro", LocalDate.of(1999, 1, 20)); 
		mapa.inserir(14000,aluno2);

		Aluno aluno3 = new Aluno(14244, "Marta", LocalDate.of(2001, 2, 18)); 
		mapa.inserir(14244,aluno3);
		
		Aluno aluno4 = new Aluno(17213, "Lucas", LocalDate.of(1998, 11, 25)); 
		mapa.inserir(17213,aluno4);
		
		mapa.remover(14244);
		
		Aluno a = mapa.buscar(14244);
		assertEquals(null, a);
	}


}
