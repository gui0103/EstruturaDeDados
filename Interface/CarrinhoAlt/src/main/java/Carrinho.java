import java.util.ArrayList;
import java.util.List;

public class Carrinho
{
    // Atributos
    public List<Vendavel> cart;

    // Construtor
    public Carrinho()
    {
        this.cart = new ArrayList<Vendavel>();
    }

    // Métodos
    public void adicionaVendavel(Vendavel v)
    {
        cart.add(v);
    }

    public Double calculaTotalVenda()
    {
        System.out.println("Calculando total de venda: ");
        Double total = 0.0;
        for (Vendavel v : cart) {
            total += v.getValorVenda();
        }

        return total;
    }

    public void exibeItensCarrinho()
    {
        System.out.println("Exibindo todos os itens do carrinho:");
        for (Vendavel v : cart) {
            System.out.println(v.toString());
        }
    }
}
