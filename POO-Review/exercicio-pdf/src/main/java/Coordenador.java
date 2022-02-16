public class Coordenador extends FuncionarioComBonus{

    private Integer qntdHorasSemana;

    public Coordenador(String nome, Double valorHora, Integer qntdHorasSemana) {
        super(nome, valorHora);
        this.qntdHorasSemana = qntdHorasSemana;
    }

    @Override
    public Double getValorBonus() {

        // contando que tem 4 semanas no mês, tem que multiplicar por 4
        // para saber o salário mensal
        return (qntdHorasSemana * getValorHora() * 4.5 * 0.2) * 4;
    }

    @Override
    public Double getSalario() {

        // contando que tem 4 semanas no mês, tem que multiplicar por 4
        // para saber o salário mensal
        return (qntdHorasSemana * getValorHora()) * 4;
    }

    @Override
    public String toString() {
        return "\nCoordenador: " +
                "\nnome = " + super.getNome() +
                "\nvalorHora = " + super.getValorHora() +
                "\nqntdHorasSemana = " + qntdHorasSemana +
                "\nvalor bônus = " + this.getValorBonus() +
                "\nsalário mensal = " + this.getSalario();
    }
}
