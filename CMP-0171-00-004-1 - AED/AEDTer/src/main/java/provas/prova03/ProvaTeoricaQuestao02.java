package provas.prova03;

import java.time.LocalDate;

import provas.prova03.auxiliares.Aluno;
import provas.prova03.auxiliares.ListaEncadeada;
import provas.prova03.auxiliares.MapaDispersao;
import provas.prova03.auxiliares.NoLista;
import provas.prova03.auxiliares.NoMapa;

public class ProvaTeoricaQuestao02 {

	public static void main(String[] args) {
		new ProvaTeoricaQuestao02();
	}
	
	public ProvaTeoricaQuestao02() {
		
		System.out.println("Possíveis respostas da questão 2");
		questao02a();
		questao02b();
		questao02c();
		questao02d();
		questao02e();
	}
	
	private void imprimeMapaAluno(MapaDispersao<Aluno> mapa) {
		for (int i = 0; i < mapa.getInfo().length; i++) {
			ListaEncadeada<NoMapa<Aluno>> listaEncadeada = mapa.getInfo()[i];
			if (listaEncadeada != null) {
				System.out.print("[");
				
				NoLista<NoMapa<Aluno>> p = listaEncadeada.getPrimeiro();
				while (p != null) {
					System.out.print(mapa.calcularHash(Integer.parseInt(p.getInfo().getInfo().getMatricula())) + " Aluno: " + p.getInfo().getInfo());
					p = p.getProximo();
					if (p != null) {
						System.out.print(", ");	
					}
				}
				System.out.print("], ");
				System.out.println("");
			}
		}
	}
	
	/** 
	 * Um mapa de dispersão armazena objetos da classe Aluno.
	 * 
	 * O número de matrícula é a chave de busca destes objetos no mapa de dispersão. 
	 * Considere que o vetor encapsulado tenha 127 posições.
	 * Dos números de matrícula abaixo, qual deles colidiria com a chave 123.000?
	 * 142311
	 * 101526
	 * 146000
	 * 110681
	 * 119849
	 */
	private void questao02a() { 
		MapaDispersao<Aluno> mapa = new MapaDispersao<Aluno>(127);
		
		Aluno aluno1 = new Aluno("123000", "A", LocalDate.now());
		Aluno aluno2 = new Aluno("142311", "A", LocalDate.now());
		Aluno aluno3 = new Aluno("101526", "A", LocalDate.now());
		Aluno aluno4 = new Aluno("146000", "A", LocalDate.now());
		Aluno aluno5 = new Aluno("110681", "A", LocalDate.now());
		Aluno aluno6 = new Aluno("119849", "A", LocalDate.now());
		
		mapa.inserir(Integer.parseInt(aluno1.getMatricula()), aluno1);
		mapa.inserir(Integer.parseInt(aluno2.getMatricula()), aluno2);
		mapa.inserir(Integer.parseInt(aluno3.getMatricula()), aluno3);
		mapa.inserir(Integer.parseInt(aluno4.getMatricula()), aluno4);
		mapa.inserir(Integer.parseInt(aluno5.getMatricula()), aluno5);
		mapa.inserir(Integer.parseInt(aluno6.getMatricula()), aluno6);
		
		imprimeMapaAluno(mapa);
		
		System.out.println("------------------------------------------");
	}
	
	/**
	 * Um mapa de dispersão armazena objetos da classe Aluno.
	 * O número de matrícula é a chave de busca destes objetos no mapa de dispersão. 
	 * Considere que o vetor encapsulado tenha 127 posições.
	 * Dos números de matrícula abaixo, qual deles colidiria com a chave 623.000?	
	 * 242254
	 * 601526
	 * 246000
	 * 410681
	 * 519849
	 */
	private void questao02b() { 
		MapaDispersao<Aluno> mapa = new MapaDispersao<Aluno>(127);
		
		Aluno aluno1 = new Aluno("623000", "B", LocalDate.now());
		Aluno aluno2 = new Aluno("242254", "B", LocalDate.now());
		Aluno aluno3 = new Aluno("601526", "B", LocalDate.now());
		Aluno aluno4 = new Aluno("246000", "B", LocalDate.now());
		Aluno aluno5 = new Aluno("410681", "B", LocalDate.now());
		Aluno aluno6 = new Aluno("519849", "B", LocalDate.now());
		
		mapa.inserir(Integer.parseInt(aluno1.getMatricula()), aluno1);
		mapa.inserir(Integer.parseInt(aluno2.getMatricula()), aluno2);
		mapa.inserir(Integer.parseInt(aluno3.getMatricula()), aluno3);
		mapa.inserir(Integer.parseInt(aluno4.getMatricula()), aluno4);
		mapa.inserir(Integer.parseInt(aluno5.getMatricula()), aluno5);
		mapa.inserir(Integer.parseInt(aluno6.getMatricula()), aluno6);
		
		imprimeMapaAluno(mapa);
		
		System.out.println("------------------------------------------");
	}
	
	/**
	 * Um mapa de dispersão armazena objetos da classe Aluno.
	 * O número de matrícula é a chave de busca destes objetos no mapa de dispersão. 
	 * Considere que o vetor encapsulado tenha 401 posições.
	 * Dos números de matrícula abaixo, qual deles colidiria com a chave 623.000?
	 * 235453
	 * 552323
	 * 125478
	 * 265896
	 * 415329
	 */
	private void questao02c() { 
		MapaDispersao<Aluno> mapa = new MapaDispersao<Aluno>(401);
		
		Aluno aluno1 = new Aluno("623000", "C", LocalDate.now());
		Aluno aluno2 = new Aluno("235453", "C", LocalDate.now());
		Aluno aluno3 = new Aluno("552323", "C", LocalDate.now());
		Aluno aluno4 = new Aluno("125478", "C", LocalDate.now());
		Aluno aluno5 = new Aluno("265896", "C", LocalDate.now());
		Aluno aluno6 = new Aluno("415329", "C", LocalDate.now());
		
		mapa.inserir(Integer.parseInt(aluno1.getMatricula()), aluno1);
		mapa.inserir(Integer.parseInt(aluno2.getMatricula()), aluno2);
		mapa.inserir(Integer.parseInt(aluno3.getMatricula()), aluno3);
		mapa.inserir(Integer.parseInt(aluno4.getMatricula()), aluno4);
		mapa.inserir(Integer.parseInt(aluno5.getMatricula()), aluno5);
		mapa.inserir(Integer.parseInt(aluno6.getMatricula()), aluno6);
		
		imprimeMapaAluno(mapa);
		
		System.out.println("Está errada na prova, marca o 415329 como correta! Irei considerar como correta caso tenha errado essa opção.");
		
		System.out.println("------------------------------------------");
	}
	
	/**
	 * Um mapa de dispersão armazena objetos da classe Aluno.
	 * O número de matrícula é a chave de busca destes objetos no mapa de dispersão. 
	 * 		
	 * Considere que o vetor encapsulado tenha 449 posições.
	 * Dos números de matrícula abaixo, qual deles colidiria com a chave 147.049?
	 * 123449
	 * 852147
	 * 963258
	 * 845693
	 * 112253
	 */
	private void questao02d() { 
		MapaDispersao<Aluno> mapa = new MapaDispersao<Aluno>(449);
		
		Aluno aluno1 = new Aluno("147049", "D", LocalDate.now());
		Aluno aluno2 = new Aluno("123449", "D", LocalDate.now());
		Aluno aluno3 = new Aluno("852147", "D", LocalDate.now());
		Aluno aluno4 = new Aluno("963258", "D", LocalDate.now());
		Aluno aluno5 = new Aluno("845693", "D", LocalDate.now());
		Aluno aluno6 = new Aluno("112253", "D", LocalDate.now());
		
		mapa.inserir(Integer.parseInt(aluno1.getMatricula()), aluno1);
		mapa.inserir(Integer.parseInt(aluno2.getMatricula()), aluno2);
		mapa.inserir(Integer.parseInt(aluno3.getMatricula()), aluno3);
		mapa.inserir(Integer.parseInt(aluno4.getMatricula()), aluno4);
		mapa.inserir(Integer.parseInt(aluno5.getMatricula()), aluno5);
		mapa.inserir(Integer.parseInt(aluno6.getMatricula()), aluno6);
		
		imprimeMapaAluno(mapa);
		
		System.out.println("------------------------------------------");
	}
	
	/**
	 * Um mapa de dispersão armazena objetos da classe Aluno.
	 * O número de matrícula é a chave de busca destes objetos no mapa de dispersão. 
	 * Considere que o vetor encapsulado tenha 521 posições.
	 * Dos números de matrícula abaixo, qual deles colidiria com a chave 369.852?
	 * 
	 * 257841
	 * 365289
	 * 746014
	 * 197385
	 * 267485
	 */
	private void questao02e() { 
		MapaDispersao<Aluno> mapa = new MapaDispersao<Aluno>(521);
		
		Aluno aluno1 = new Aluno("369852", "E", LocalDate.now());
		Aluno aluno2 = new Aluno("257841", "E", LocalDate.now());
		Aluno aluno3 = new Aluno("365289", "E", LocalDate.now());
		Aluno aluno4 = new Aluno("746014", "E", LocalDate.now());
		Aluno aluno5 = new Aluno("197385", "E", LocalDate.now());
		Aluno aluno6 = new Aluno("267485", "E", LocalDate.now());
		
		mapa.inserir(Integer.parseInt(aluno1.getMatricula()), aluno1);
		mapa.inserir(Integer.parseInt(aluno2.getMatricula()), aluno2);
		mapa.inserir(Integer.parseInt(aluno3.getMatricula()), aluno3);
		mapa.inserir(Integer.parseInt(aluno4.getMatricula()), aluno4);
		mapa.inserir(Integer.parseInt(aluno5.getMatricula()), aluno5);
		mapa.inserir(Integer.parseInt(aluno6.getMatricula()), aluno6);
		
		imprimeMapaAluno(mapa);
		
		System.out.println("------------------------------------------");
	}
}
