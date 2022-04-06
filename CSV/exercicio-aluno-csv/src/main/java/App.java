import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {

    public static void gravaArquivoCsv(ListaObj<Aluno> lista, String nomeArq) {
        FileWriter arq = null; // arq é o objeto que corresponde ao arquivo
        Formatter saida = null; // obj que sera usado para escrever no arquivo
        nomeArq += ".csv";
        Boolean deuRuim = false;

        // Bloco try catch para abrir no arquivo
        try {
            arq = new FileWriter(nomeArq); // colocar o ',true' pós nomeArq para acresentar + 1
            saida = new Formatter(arq);
        }
        catch (IOException erro) {
            System.out.println("Erro ao abrir o arquivo");
            System.exit(1);
        }

        // Bloco try catch para gravar no arquivo
        try {
            // Percorro a lista de alunos

            for (int i = 0; i < lista.getTamanho(); i++) {
                Aluno aluno = lista.getElemento(i);
                saida.format("%d;%s;%.2f\n",
                        aluno.getRa(), aluno.getNome(), aluno.getNota()); // uma linha do arquivo
            }
        }
        catch (FormatterClosedException erro) {
            System.out.println("Erro ao gravar o arquivo!");
            deuRuim = true;
        }
        finally {
            saida.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo!");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void leExibeArquivoCsv (String nomeArq){
        FileReader arq = null;
        Scanner entrada = null;
        nomeArq += ".csv";
        Boolean deuRuim = false;

        //Bloco try catch para abrir o arquivo
        try {
            arq = new FileReader(nomeArq);
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        }
        catch (FileNotFoundException erro) {
            System.out.println("Arquivo não encontrado");
            System.exit(1);
        }

        // Bloco try catch para ler o arquivo
        /*
            private Integer ra;
            private String nome;
            private Double nota;
             */
        try {
            System.out.printf("%4s %-15s %-9s\n", "RA", "NOME", "NOTA");
            while (entrada.hasNext()) {
                Integer ra = entrada.nextInt();
                String nome = entrada.next();
                String nota = entrada.next();
                System.out.printf("%4d %-15s %-9s\n",ra,nome,nota);
            }
        }
        catch (NoSuchElementException erro) {
            System.out.println("Arquivo com problemas");
            deuRuim = true;
        }
        catch (IllegalStateException erro) {
            System.out.println("Erro na leitura do arquivo");
            deuRuim = true;
        }
        finally {
            entrada.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo!");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) {
        Boolean fim = false;
        ListaObj<Aluno> lista = new ListaObj<>(10);

        while (!fim) {
            Integer ra;
            String nome;
            Double nota;
            Scanner leitor = new Scanner(System.in);
            Scanner leitorNL = new Scanner(System.in);
            Integer opcao;
            int indice;

            System.out.println("\n1. adicionar um Aluno," +
                    "\n2. Exibir a lista," +
                    "\n3. Exibir um aluno da lista," +
                    "\n4. Limpar a lista," +
                    "\n5. Buscar um aluno por RA," +
                    "\n6. Grava a lista num arquivo CSV," +
                    "\n7. Ler e exibir o arquivo CSV" +
                    "\n8. Fim,\n");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o RA:");
                    ra = leitor.nextInt();

                    System.out.println("Digite o nome do aluno:");
                    nome = leitorNL.nextLine();

                    System.out.println("Digite a nota do aluno:");
                    nota = leitor.nextDouble();

                    lista.adiciona(new Aluno(ra, nome, nota));
                    break;

                case 2:
                    lista.exibe();
                    break;

                case 3:
                    System.out.println("Digite o indice do aluno:");
                    indice = leitor.nextInt();
                    lista.getElemento(indice);
                    break;

                case 4:
                    lista.limpa();
                    break;

                case 5:
                    System.out.println("Digite o RA a ser buscado: ");
                    ra = leitor.nextInt();
                    Boolean validar = false;

                    for (int i = 0; i < lista.getTamanho(); i++ ) {
                        if (lista.getElemento(i).equals(ra)) {
                            System.out.println(lista.getElemento(i));
                        }
                    }

                    if (!validar) {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 6:
                    gravaArquivoCsv(lista, "alunos");
                    break;

                case 7:
                    leExibeArquivoCsv("alunos");
                    break;

                case 8:
                    fim = true;
                    break;

                default:
                    System.out.println("Digite um valor válido!");
            }
        }
    }
}
