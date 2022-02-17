public abstract class Educador {

    private String nome;
    private Double valorHoraAula;

    public Educador(String nome, Double valorHoraAula) {
        this.nome = nome;
        this.valorHoraAula = valorHoraAula;
    }

    public abstract Double getValorBonus();

    @Override
    public String toString() {
        return  "\nnome = " + nome +
                "\nvalorHoraAula = " + valorHoraAula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }
}
