import java.util.ArrayList;
import java.util.List;

public class Escola {

    private String nome;

    private List<Aluno> listaAlunos;

    public Escola(String nome) {
        this.nome = nome;
        listaAlunos = new ArrayList<>();
    }

    public void adicionaAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public void exibeTodos() {

        System.out.println("\nExibindo lista de todos os alunos registrados: ");

        for (int i = 0; i < listaAlunos.size(); i++) {

            System.out.println("\n" + listaAlunos.get(i).toString());
        }
    }

    public void exibeAlunoGraduacao() {

        System.out.println("\nExibindo lista de todos os alunos de graduação registrados: ");

        for (Aluno aluno : listaAlunos) {

            if (aluno instanceof AlunoGraduacao) {
                System.out.println("\n" + aluno);
            }

        }
    }

    public void exibeAprovados() {

        System.out.println("\nExibindo lista de todos os alunos que foram aprovados: ");

        for (Aluno aluno : listaAlunos) {

            if (aluno.calcularMedia() >= 6.0) {
                System.out.println("\n" + aluno);
            }
        }

    }

    public void buscaAlunos(Integer ra) {

        Integer cont = 0;

        for (Aluno aluno : listaAlunos) {

            if (aluno.getRa() == ra) {

                cont++;

                System.out.println("\nAluno Encontrado");
                System.out.println("\n" + aluno);
            }
        }

        if(cont < 1) {

            System.out.println("\nAluno com o RA: " + ra + " não encontrado");
        }
    }
}
