public class Professor extends Educador{

    private Integer qntdAulasSemana;

    public Professor(String nome, Double valorHoraAula, Integer qntdAulasSemana) {
        super(nome, valorHoraAula);
        this.qntdAulasSemana = qntdAulasSemana;
    }

    @Override
    public Double getValorBonus() {

        return qntdAulasSemana * super.getValorHoraAula() * 4.5 * 0.15;
    }

    public Integer getQntdAulasSemana() {
        return qntdAulasSemana;
    }

    public void setQntdAulasSemana(Integer qntdAulasSemana) {
        this.qntdAulasSemana = qntdAulasSemana;
    }

    @Override
    public String toString() {
        return "\nProfessor: " +
                "\nqntdAulasSemana = " + qntdAulasSemana +
                super.toString() +
                "\nvalor bônus = " + this.getValorBonus();
    }
}
