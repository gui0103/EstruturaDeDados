public class Teste {

    public static void main(String[] args) {

        ControleBonus controleBonus = new ControleBonus();
        Professor professor = new Professor("Yoshi", 30.0, 20);
        Coordenador coordenador = new Coordenador("Gerson", 30.0, 20);

        System.out.println(professor);
        System.out.println(coordenador);

        controleBonus.adicionaFuncionario(professor);
        controleBonus.adicionaFuncionario(coordenador);

        controleBonus.exibeTodos();

        controleBonus.calculaTotalBonus();
    }
}
