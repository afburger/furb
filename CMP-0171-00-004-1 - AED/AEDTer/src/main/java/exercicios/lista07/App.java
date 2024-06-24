package exercicios.lista07;

public class App {

    public static void main(String[] args) {
        ArvoreBinaria<String> nomes = new ArvoreBinaria<>();

        NoArvoreBinaria<String> no = new NoArvoreBinaria<String>("Luiz");

        nomes.setRaiz(no);
//        nomes.pertence(nomes.getRaiz(), "Luiz");

        nomes.pertence("Luiz");
    }
}
