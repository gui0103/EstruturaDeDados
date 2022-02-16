import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Vendavel> listaVendaveis;

    public Carrinho() {
        listaVendaveis = new ArrayList<Vendavel>();
    }

    public void adicionaVendavel(Vendavel vendavel) {
        listaVendaveis.add(vendavel);
    }

    public Double calculaTotal() {

        Double total = 0.0;

        for (Vendavel vendavel : listaVendaveis) {
            total += vendavel.getValorVenda();
        }

        return total;
    }

    public void exibeTodos() {

        for (Vendavel vendavel : listaVendaveis) {
            System.out.println(vendavel);
        }
    }
}