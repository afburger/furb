package exemplos.unidadeI.lista.encadeada.duplamente.inteiro;

public class AppListaDuplamenteEncadeadaInt {


    public static void main(String[] args) {

        ListaDuplamenteEncadeadaInt frutas = new ListaDuplamenteEncadeadaInt();
        frutas.inserir(7);
        frutas.inserir(3);
        frutas.inserir(5);


        NoListaDuplamenteEncadeadaInt p = frutas.getPrimeiro();
        while (p!=null) {
            System.out.println(p.getInfo());
            p = p.getProximo();
        }

    }

}
