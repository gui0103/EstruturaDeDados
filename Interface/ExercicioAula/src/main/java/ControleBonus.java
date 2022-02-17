import java.util.ArrayList;
import java.util.List;

public class ControleBonus {

    private List<Educador> listaFuncionarios;

    public ControleBonus() {
        listaFuncionarios = new ArrayList<>();
    }

    public void adicionaFuncionario(Educador funcionario){

        listaFuncionarios.add(funcionario);
    }

    public void calculaTotalBonus() {

        Double total = 0.0;

        for (Educador funcionario : listaFuncionarios){
            total += funcionario.getValorBonus();
        }

        System.out.println("\nTotal da soma dos bônus: R$: " + total);

    }

    public void exibeTodos() {

        System.out.println("\nLista de Funcionários com bônus:");

        for (Educador funcionario : listaFuncionarios){

            System.out.println(funcionario);
        }
    }
}

