import java.util.ArrayList;
import java.util.List;

public class Tributo {

    private List<Tributavel> listaTributos;

    public Tributo() {
        listaTributos = new ArrayList<Tributavel>();
    }

    public void adicionaTributavel(Tributavel tributavel) {
        listaTributos.add(tributavel);
    }

    public Double calculaTotalTributo(){

        Double total= 0.0;

        for(Tributavel tributavel : listaTributos) {
            total += tributavel.getValortributo();
        }

        return total;
    }

    public void exibeTodos(){

        for(Tributavel tributavel : listaTributos) {
            System.out.println(tributavel);
        }

    }
}
