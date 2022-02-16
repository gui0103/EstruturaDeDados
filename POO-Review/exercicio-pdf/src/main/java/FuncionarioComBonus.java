public abstract class FuncionarioComBonus {

    private String nome;
    private Double valorHora;

    public FuncionarioComBonus(String nome, Double valorHora) {
        this.nome = nome;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public abstract Double getValorBonus();

    public abstract Double getSalario();

    @Override
    public String toString() {
        return super.toString();
    }
}
