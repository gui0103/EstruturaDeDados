import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private List<Filme> listaFilmes;

    public Cinema() {
        listaFilmes = new ArrayList<>();
    }

    public void addFilme(Filme filme){

        listaFilmes.add(filme);
    }

    public void calculaTotalPrecoIngressos() {

        Double total = 0.0;

        for (Filme filme : listaFilmes){
            total += filme.getPrecoIngresso();
        }

        System.out.println("\nTotal da soma dos ingressos: R$: " + total);

    }

    public void exibeTodos() {

        System.out.println("\nLista de filmes: ");

        for (Filme filme : listaFilmes){

            System.out.println(filme);
        }
    }
}


