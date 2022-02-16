import java.util.ArrayList;
import java.util.List;

public class ControleBonus {

    private List<FuncionarioComBonus> listaFuncionarios;

    public ControleBonus() {
        listaFuncionarios = new ArrayList<>();
    }

    public void adicionaFuncionario(FuncionarioComBonus funcionario){

        listaFuncionarios.add(funcionario);
    }

    public void calculaTotalBonus() {

        Double total = 0.0;

        for (FuncionarioComBonus funcionario : listaFuncionarios){
            total += funcionario.getValorBonus();
        }

        System.out.println("\nTotal da soma dos bônus: R$: " + total);

    }

    public void exibeTodos() {

        System.out.println("\nLista de Funcionários com bônus:");

        for (FuncionarioComBonus funcionario : listaFuncionarios){

                System.out.println(funcionario);
        }
    }
}
