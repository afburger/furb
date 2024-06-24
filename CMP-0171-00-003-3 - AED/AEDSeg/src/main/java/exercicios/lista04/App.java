package exercicios.lista04;

public class App {


    public static void main(String[] args) {

        ListaDupla<String> frutas = new ListaDupla<>();
        frutas.inserir("Mamão");
        frutas.inserir("Banana");
        frutas.inserir("Manga");


        NoListaDupla<String> p = frutas.getPrimeiro();
        while (p!=null) {
            System.out.println(p.getInfo());
            p = p.getProximo();
        }

    }

}
