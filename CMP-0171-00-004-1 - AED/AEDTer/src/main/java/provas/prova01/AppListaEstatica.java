package provas.prova01;

public class AppListaEstatica {

	public static void main(String[] args) {
		// ######################### Questão 2 - Teórica ##############################################
		// Questão 2 Prova teórica.
//		ListaEstaticaInt q2l1 = new ListaEstaticaInt();
//		for (int i = 1; i <= 40; i++) {
//			q2l1.inserir(i);
//		}
//		System.out.println("Redimensionamentos de L1");
//		
//		ListaEstaticaInt q2l2 = new ListaEstaticaInt();
//		for (int i = 1; i <= 50; i++) {
//			q2l2.inserir(i);
//		}
//		System.out.println("Redimensionamentos de L2");
//		
//		ListaEstaticaInt q2l3 = new ListaEstaticaInt();
//		for (int i = 1; i <= 49; i++) {
//			q2l3.inserir(i);
//		}
//		System.out.println("Redimensionamentos de L2");
//		
//		
//		
//		// ######################### Questão 3 - Teórica  ##############################################
//		// Questão 3 Prova teórica
//		ListaEstaticaInt q3 = new ListaEstaticaInt();
//		for (int i = 1; i <= 11; i++) {
//			q3.inserir(i);
//		}
//		
//		for (int i = 1; i <= 11; i++) {
//			q3.retirar(i);
//		}
//		
//		System.out.println("Tamanho do vetor encapsulado na questão 3 = " + q3.getInfo().length);
//		
		
		// ######################### Questão 1 - Prática  ##############################################
				// Questão 1 prova prática.
		ListaEstaticaInt prova =  new ListaEstaticaInt();
		
		prova.inserir2(20);
		prova.inserir2(25);
		prova.inserir2(30);
		
		System.out.println("Antes de inseir o 22");
		System.out.println(prova.toString());
		
		prova.inserir2(22);
		System.out.println("Depois de inseir o 22");
		System.out.println(prova.toString());
		
		// ######################### Questão 1 - Prática Prova Recuperação Faltantes ##############################################
		// Questão 1 prova prática - Prática Prova Recuperação Faltantes.
		ListaEstaticaInt provaFaltantes =  new ListaEstaticaInt();
		
		provaFaltantes.inserir3(27);
		provaFaltantes.inserir3(18);
		provaFaltantes.inserir3(1);
		System.out.println("Antes de inseir o 21");
		System.out.println(provaFaltantes.toString());
		
		
		prova.inserir3(21);
		System.out.println("Depois de inseir o 21");
		System.out.println(prova.toString());
		
		
		
		
	}
}
