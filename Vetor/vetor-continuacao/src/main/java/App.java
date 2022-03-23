import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        String[] nomes = new String[10];
        String[] turma = new String[10];

        String[] alunosT1 = new String[10];
        String[] alunosT2 = new String[10];

        Scanner leitor = new Scanner(System.in);

        System.out.println("\n\nDigite o nome de 10 alunos e sua respectiva turma: ");

        Integer contador = 0;

        Integer contador2 = 0;

        for (int i = 0; i < nomes.length; i++) {

            System.out.println("\nDigite o nome do " + (i+1) + "° aluno: ");

            String alunoDigitado = leitor.nextLine();

            nomes[i] = alunoDigitado;

            System.out.println("\nDigite a turma do aluno (T1 ou T2): ");

            String turmaDigitada = leitor.nextLine();

            turma[i] = turmaDigitada;

            if(turmaDigitada.equalsIgnoreCase("T1")){

                contador++;

                alunosT1[contador - 1] = alunoDigitado;
            }
            else if(turmaDigitada.equalsIgnoreCase("T2")){

                contador2++;

                alunosT2[contador2 - 1] = alunoDigitado;
            }
        }

        System.out.println("\nMostrando alunos T1: ");

        for (int i = 0; i < contador; i++) {

                System.out.println(alunosT1[i]);
        }

        System.out.println("\nMostrando alunos T2: ");

        for (int i = 0; i < contador2; i++) {

                System.out.println(alunosT2[i]);
        }

        System.out.println("\nExistem " + contador + " alunos na T1");

        System.out.println("\nExistem " + contador2 + " alunos na T2");
    }
}
