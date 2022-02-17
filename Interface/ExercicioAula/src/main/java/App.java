public class App {

    public static void main(String[] args) {

        Professor professor1 = new Professor("Célia", 30.0, 20);

        Coordenador coordenador1 = new Coordenador
                ("Gerson", 30.0, 20, 10, 20.0);

        ControleBonus controleBonus1 = new ControleBonus();

        controleBonus1.adicionaFuncionario(professor1);

        controleBonus1.adicionaFuncionario(coordenador1);

        controleBonus1.exibeTodos();

        controleBonus1.calculaTotalBonus();
    }
}
