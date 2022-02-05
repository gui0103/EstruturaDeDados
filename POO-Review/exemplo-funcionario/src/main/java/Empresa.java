import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Funcionario> funcionarios;

    public Empresa() {
        funcionarios = new ArrayList<>();
    }

    public void adicionaFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void mostraFuncionario(){

        System.out.println("Lista de funcionários:");

        for (Funcionario funcionario : funcionarios){
            System.out.println(funcionario);
        }
    }

    public void exibeTotalSalarios() {

        Double total = 0.0;

        for (Funcionario funcionario : funcionarios){
            total += funcionario.calcularSalario();
        }

        System.out.println(String.format("Total dos salários: R$: %.2f\n", total));


    }

    public void exibeHorista() {

        System.out.println("Lista de horistas:");

        for (Funcionario funcionario : funcionarios){
            if(funcionario instanceof Horista) {
                System.out.println(funcionario);
            }
        }
    }
}
