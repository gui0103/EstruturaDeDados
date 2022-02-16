public class Professor extends FuncionarioComBonus{

    private Integer qntdAulasSemana;

    public Professor(String nome, Double valorHora, Integer qntdAulasSemana) {
        super(nome, valorHora);
        this.qntdAulasSemana = qntdAulasSemana;
    }

    @Override
    public Double getValorBonus() {

        // contando que tem 4 semanas no mês, tem que multiplicar por 4
        // para saber o salário mensal
        return (qntdAulasSemana * getValorHora() * 4.5 * 0.15) * 4;
    }

    @Override
    public Double getSalario() {

        // contando que tem 4 semanas no mês, tem que multiplicar por 4
        // para saber o salário mensal
        return (qntdAulasSemana * getValorHora()) * 4;
    }

    @Override
    public String toString() {
        return "\nProfessor: " +
                "\nnome = " + super.getNome() +
                "\nvalorHora = " + super.getValorHora() +
                "\nqntdAulasSemana = " + qntdAulasSemana +
                "\nvalor bônus = " + this.getValorBonus() +
                "\nsalário mensal = " + this.getSalario();
    }
}
