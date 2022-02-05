public class App {

    public static void main(String[] args) {

        AlunoFundamental alunoF1 = new AlunoFundamental
                (1234, "Justin Bieber", 7.0, 8.0, 10.0, 9.0);

        AlunoGraduacao alunoG1 = new AlunoGraduacao(2124, "Harry Styles", 10.0, 8.0);

        AlunoPos alunoP1 = new AlunoPos(3045, "Shawn Mendes", 8.0, 10.0, 10.0);

        AlunoFundamental alunoF2 = new AlunoFundamental
                (1225, "Andrew Garfield", 2.0, 5.0, 3.0, 6.0);

        AlunoGraduacao alunoG2 = new AlunoGraduacao(2810, "Leonardo DiCaprio", 6.0, 5.0);

        AlunoPos alunoP2 = new AlunoPos(3045, "Brad Pitt", 5.0, 9.5, 6.5);

        AlunoFundamental alunoF3 = new AlunoFundamental
                (1572, "Taylor Swift", 8.0, 10.0, 10.0, 10.0);

        AlunoGraduacao alunoG3 = new AlunoGraduacao(2974, "Billie Eilish", 5.0, 7.5);

        AlunoPos alunoP3 = new AlunoPos(3492, "Hailey Bieber", 10.0, 7.0, 8.0);

        Escola escola1 = new Escola("AweSchool");

        escola1.adicionaAluno(alunoF1);
        escola1.adicionaAluno(alunoF2);
        escola1.adicionaAluno(alunoF3);
        escola1.adicionaAluno(alunoG1);
        escola1.adicionaAluno(alunoG2);
        escola1.adicionaAluno(alunoG3);
        escola1.adicionaAluno(alunoP1);
        escola1.adicionaAluno(alunoP2);
        escola1.adicionaAluno(alunoP3);

        escola1.exibeTodos();

        escola1.exibeAlunoGraduacao();

        escola1.exibeAprovados();

        // getRa não está funcionando, não sei o motivo
        escola1.buscaAlunos(1234);

        escola1.buscaAlunos(2772);

        System.out.println(alunoF1.getRa());
    }
}
