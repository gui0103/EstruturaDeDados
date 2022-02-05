public class AlunoGraduacao extends Aluno{

    private Double nota1;
    private Double nota2;

    public AlunoGraduacao(Integer ra, String nome, Double nota1, Double nota2) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public Double calcularMedia() {
        return (nota1 * 0.4) + (nota2 * 0.6);
    }

    @Override
    public String toString() {
        return "\nAluno Gradução:" +
                super.toString() +
                "\nnota 1 = " + nota1 +
                "\nnota 2 = " + nota2 +
                "\nmédia = " + this.calcularMedia();
    }

}
