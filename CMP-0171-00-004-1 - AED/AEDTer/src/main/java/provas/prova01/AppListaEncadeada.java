package provas.prova01;

public class AppListaEncadeada {

	public static void main(String[] args) {
		// ######################### Questão 4 - Teórica  ##############################################
//		ListaEncadeadaInt q4l1 = new ListaEncadeadaInt();
//		q4l1.inserir(10);
//		q4l1.inserir(20);
//		q4l1.inserir(30);
//		q4l1.inserir(40);
//		q4l1.inserir(50);
//		q4l1.inserir(20);
//		q4l1.retirar(20);
//		q4l1.inserir(5);
//
//		System.out.println(q4l1.toString());
		
		
//		ListaEncadeadaInt q4l2 = new ListaEncadeadaInt();
//		q4l2.inserir(10);
//		q4l2.inserir(20);
//		q4l2.inserir(30);
//		q4l2.inserir(20);
//		q4l2.inserir(40);
//		q4l2.retirar(20);
//		q4l2.inserir(50);
//		q4l2.inserir(60);
//
//		System.out.println(q4l2.toString());
		
//		ListaEncadeadaInt q4l3 = new ListaEncadeadaInt();
//		q4l3.inserir(50);
//		q4l3.inserir(40);
//		q4l3.inserir(30);
//		q4l3.inserir(20);
//		q4l3.inserir(10);
//		q4l3.retirar(40);
//		q4l3.inserir(40); 
//		q4l3.inserir(10);
//
//		System.out.println(q4l3.toString());
		
		// ######################### Questão 5 - Teórica  ##############################################
		ListaEncadeadaInt q5l1 = new ListaEncadeadaInt();
		q5l1.processar(100);
		q5l1.processar(20);
		q5l1.processar(5);
		q5l1.processar(200);

		System.out.println(q5l1.toString());
		System.out.println();
		
		System.out.println("Resultado do método 1");
		System.out.println(q5l1.metodo1().getInfo());
		
	}
}
