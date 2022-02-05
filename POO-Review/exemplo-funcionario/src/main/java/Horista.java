public class Horista extends Funcionario{

    private Integer qntdHoras;
    private Double valorHora;

    public Horista(String CPF, String nome, Integer qntdHoras, Double valorHora) {
        super(CPF, nome);
        this.qntdHoras = qntdHoras;
        this.valorHora = valorHora;
    }

    @Override
    public Double calcularSalario() {
        return qntdHoras * valorHora;
    }

    @Override
    public String toString() {
        return "\nHorista" +
                "\nqntdHoras = " + qntdHoras +
                "\nvalorHora = " + valorHora +
                "\nsalário = " + this.calcularSalario() +
                super.toString();
    }
}
