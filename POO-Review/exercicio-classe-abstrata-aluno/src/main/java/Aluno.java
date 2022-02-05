public abstract class Aluno {

    private Integer ra;
    private String nome;

    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public abstract Double calcularMedia();

    @Override
    public String toString() {
        return
                "\nra = " + ra +
                        "\nnome = " + nome;
    }

    public Integer getRa() {
        return ra;
    }

}
